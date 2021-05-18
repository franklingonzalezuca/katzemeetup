package edu.franksprachen.katzemeetup.view.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import edu.franksprachen.katzemeetup.R
import edu.franksprachen.katzemeetup.intent.Intent
import edu.franksprachen.katzemeetup.util.AdapterCats
import edu.franksprachen.katzemeetup.util.DataState
import edu.franksprachen.katzemeetup.view.MainViewModel
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class MainFragment constructor(
):Fragment(R.layout.fragment_first) {
    private val viewModel: MainViewModel by viewModels()

    @Inject
    lateinit var catsAdapter: AdapterCats

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        subscribeObservers()
        val layoutManager = LinearLayoutManager(
            requireActivity().applicationContext,
            LinearLayoutManager.VERTICAL,
            false
        )
        layoutManager.reverseLayout = true
        layoutManager.stackFromEnd = true
        recyclerViewCats.layoutManager = layoutManager
        recyclerViewCats.adapter = catsAdapter
        subscribeObservers()
        lifecycleScope.launch {
            viewModel.userIntent.send(Intent.GetCatEvent)
        }
    }

    private fun subscribeObservers() {
        lifecycleScope.launch {
            viewModel.dataState.collect {
                when(it) {
                    is DataState.Success -> {
                        displayProgressBar(false)
                        catsAdapter.setCats(it.cats)
                    }
                    is DataState.Error -> {
                        displayProgressBar(false)
                        displayError(it.exception.message)
                            }
                    is DataState.Loading -> {
                        displayProgressBar(true)
                    }
                }
            }
        }
    }

    private fun displayError(message: String?) {
         if (message != null) textDemo.text = message else textDemo.text = "Unknown error."
    }


    private fun displayProgressBar(isDisplayed: Boolean) {
        progress_bar.visibility = if (isDisplayed) View.VISIBLE else View.GONE
    }
}