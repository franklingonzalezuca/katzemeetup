package edu.franksprachen.katzemeetup.view;

import dagger.internal.Factory;
import edu.franksprachen.katzemeetup.repository.CatRepository;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainViewModel_AssistedFactory_Factory implements Factory<MainViewModel_AssistedFactory> {
  private final Provider<CatRepository> catRepositoryProvider;

  public MainViewModel_AssistedFactory_Factory(Provider<CatRepository> catRepositoryProvider) {
    this.catRepositoryProvider = catRepositoryProvider;
  }

  @Override
  public MainViewModel_AssistedFactory get() {
    return newInstance(catRepositoryProvider);
  }

  public static MainViewModel_AssistedFactory_Factory create(
      Provider<CatRepository> catRepositoryProvider) {
    return new MainViewModel_AssistedFactory_Factory(catRepositoryProvider);
  }

  public static MainViewModel_AssistedFactory newInstance(Provider<CatRepository> catRepository) {
    return new MainViewModel_AssistedFactory(catRepository);
  }
}
