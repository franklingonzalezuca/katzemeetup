package edu.franksprachen.katzemeetup.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import edu.franksprachen.katzemeetup.repository.CatRepository;
import edu.franksprachen.katzemeetup.retrofit.CatNetworkMapper;
import edu.franksprachen.katzemeetup.retrofit.CatRetrofit;
import edu.franksprachen.katzemeetup.room.CacheMapper;
import edu.franksprachen.katzemeetup.room.CatDao;
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
public final class RepositoryModule_ProvideCatRepositoryFactory implements Factory<CatRepository> {
  private final Provider<CatDao> catDaoProvider;

  private final Provider<CatRetrofit> catRetrofitProvider;

  private final Provider<CacheMapper> cacheMapperProvider;

  private final Provider<CatNetworkMapper> networkMapperProvider;

  public RepositoryModule_ProvideCatRepositoryFactory(Provider<CatDao> catDaoProvider,
      Provider<CatRetrofit> catRetrofitProvider, Provider<CacheMapper> cacheMapperProvider,
      Provider<CatNetworkMapper> networkMapperProvider) {
    this.catDaoProvider = catDaoProvider;
    this.catRetrofitProvider = catRetrofitProvider;
    this.cacheMapperProvider = cacheMapperProvider;
    this.networkMapperProvider = networkMapperProvider;
  }

  @Override
  public CatRepository get() {
    return provideCatRepository(catDaoProvider.get(), catRetrofitProvider.get(), cacheMapperProvider.get(), networkMapperProvider.get());
  }

  public static RepositoryModule_ProvideCatRepositoryFactory create(Provider<CatDao> catDaoProvider,
      Provider<CatRetrofit> catRetrofitProvider, Provider<CacheMapper> cacheMapperProvider,
      Provider<CatNetworkMapper> networkMapperProvider) {
    return new RepositoryModule_ProvideCatRepositoryFactory(catDaoProvider, catRetrofitProvider, cacheMapperProvider, networkMapperProvider);
  }

  public static CatRepository provideCatRepository(CatDao catDao, CatRetrofit catRetrofit,
      CacheMapper cacheMapper, CatNetworkMapper networkMapper) {
    return Preconditions.checkNotNull(RepositoryModule.INSTANCE.provideCatRepository(catDao, catRetrofit, cacheMapper, networkMapper), "Cannot return null from a non-@Nullable @Provides method");
  }
}
