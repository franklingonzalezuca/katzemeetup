package edu.franksprachen.katzemeetup.view;

import androidx.hilt.Assisted;
import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import edu.franksprachen.katzemeetup.intent.Intent;
import edu.franksprachen.katzemeetup.repository.CatRepository;
import edu.franksprachen.katzemeetup.util.DataState;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.flow.*;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0013\u001a\u00020\u0014R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0015"}, d2 = {"Ledu/franksprachen/katzemeetup/view/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "catRepository", "Ledu/franksprachen/katzemeetup/repository/CatRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Ledu/franksprachen/katzemeetup/repository/CatRepository;Landroidx/lifecycle/SavedStateHandle;)V", "_dataState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Ledu/franksprachen/katzemeetup/util/DataState;", "dataState", "Lkotlinx/coroutines/flow/StateFlow;", "getDataState", "()Lkotlinx/coroutines/flow/StateFlow;", "userIntent", "Lkotlinx/coroutines/channels/Channel;", "Ledu/franksprachen/katzemeetup/intent/Intent;", "getUserIntent", "()Lkotlinx/coroutines/channels/Channel;", "setStateEvent", "", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.channels.Channel<edu.franksprachen.katzemeetup.intent.Intent> userIntent = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<edu.franksprachen.katzemeetup.util.DataState> _dataState = null;
    private final edu.franksprachen.katzemeetup.repository.CatRepository catRepository = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.channels.Channel<edu.franksprachen.katzemeetup.intent.Intent> getUserIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<edu.franksprachen.katzemeetup.util.DataState> getDataState() {
        return null;
    }
    
    public final void setStateEvent() {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    edu.franksprachen.katzemeetup.repository.CatRepository catRepository, @org.jetbrains.annotations.NotNull()
    @androidx.hilt.Assisted()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
}