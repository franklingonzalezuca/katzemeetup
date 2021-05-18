package edu.franksprachen.katzemeetup.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import edu.franksprachen.katzemeetup.retrofit.CatRetrofit;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RetrofitModule_ProvideCatServiceFactory implements Factory<CatRetrofit> {
  private final Provider<Retrofit.Builder> retrofitProvider;

  public RetrofitModule_ProvideCatServiceFactory(Provider<Retrofit.Builder> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public CatRetrofit get() {
    return provideCatService(retrofitProvider.get());
  }

  public static RetrofitModule_ProvideCatServiceFactory create(
      Provider<Retrofit.Builder> retrofitProvider) {
    return new RetrofitModule_ProvideCatServiceFactory(retrofitProvider);
  }

  public static CatRetrofit provideCatService(Retrofit.Builder retrofit) {
    return Preconditions.checkNotNull(RetrofitModule.INSTANCE.provideCatService(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
