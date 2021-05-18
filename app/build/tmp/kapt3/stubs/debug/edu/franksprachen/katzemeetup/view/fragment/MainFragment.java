package edu.franksprachen.katzemeetup.view.fragment;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import dagger.hilt.android.AndroidEntryPoint;
import edu.franksprachen.katzemeetup.R;
import edu.franksprachen.katzemeetup.intent.Intent;
import edu.franksprachen.katzemeetup.util.AdapterCats;
import edu.franksprachen.katzemeetup.util.DataState;
import edu.franksprachen.katzemeetup.view.MainViewModel;
import kotlinx.android.synthetic.main.fragment_first.*;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import javax.inject.Inject;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001a\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0010H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001c"}, d2 = {"Ledu/franksprachen/katzemeetup/view/fragment/MainFragment;", "Landroidx/fragment/app/Fragment;", "()V", "catsAdapter", "Ledu/franksprachen/katzemeetup/util/AdapterCats;", "getCatsAdapter", "()Ledu/franksprachen/katzemeetup/util/AdapterCats;", "setCatsAdapter", "(Ledu/franksprachen/katzemeetup/util/AdapterCats;)V", "viewModel", "Ledu/franksprachen/katzemeetup/view/MainViewModel;", "getViewModel", "()Ledu/franksprachen/katzemeetup/view/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "displayError", "", "message", "", "displayProgressBar", "isDisplayed", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "subscribeObservers", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy viewModel$delegate = null;
    @javax.inject.Inject()
    public edu.franksprachen.katzemeetup.util.AdapterCats catsAdapter;
    private java.util.HashMap _$_findViewCache;
    
    private final edu.franksprachen.katzemeetup.view.MainViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final edu.franksprachen.katzemeetup.util.AdapterCats getCatsAdapter() {
        return null;
    }
    
    public final void setCatsAdapter(@org.jetbrains.annotations.NotNull()
    edu.franksprachen.katzemeetup.util.AdapterCats p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void subscribeObservers() {
    }
    
    private final void displayError(java.lang.String message) {
    }
    
    private final void displayProgressBar(boolean isDisplayed) {
    }
    
    public MainFragment() {
        super();
    }
}