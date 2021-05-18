package edu.franksprachen.katzemeetup.di;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import edu.franksprachen.katzemeetup.util.AdapterCats;
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
public final class AdaptersModule_ProvideAdapterGenresFactory implements Factory<AdapterCats> {
  private final Provider<Application> applicationProvider;

  public AdaptersModule_ProvideAdapterGenresFactory(Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public AdapterCats get() {
    return provideAdapterGenres(applicationProvider.get());
  }

  public static AdaptersModule_ProvideAdapterGenresFactory create(
      Provider<Application> applicationProvider) {
    return new AdaptersModule_ProvideAdapterGenresFactory(applicationProvider);
  }

  public static AdapterCats provideAdapterGenres(Application application) {
    return Preconditions.checkNotNull(AdaptersModule.INSTANCE.provideAdapterGenres(application), "Cannot return null from a non-@Nullable @Provides method");
  }
}
