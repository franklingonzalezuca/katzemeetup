package edu.franksprachen.katzemeetup.view;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import edu.franksprachen.katzemeetup.repository.CatRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class MainViewModel_AssistedFactory implements ViewModelAssistedFactory<MainViewModel> {
  private final Provider<CatRepository> catRepository;

  @Inject
  MainViewModel_AssistedFactory(Provider<CatRepository> catRepository) {
    this.catRepository = catRepository;
  }

  @Override
  @NonNull
  public MainViewModel create(@NonNull SavedStateHandle arg0) {
    return new MainViewModel(catRepository.get(), arg0);
  }
}
