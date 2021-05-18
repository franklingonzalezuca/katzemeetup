package edu.franksprachen.katzemeetup.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import edu.franksprachen.katzemeetup.room.CatDao;
import edu.franksprachen.katzemeetup.room.CatDatabase;
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
public final class RoomModule_ProvideCatDaoFactory implements Factory<CatDao> {
  private final Provider<CatDatabase> catDatabaseProvider;

  public RoomModule_ProvideCatDaoFactory(Provider<CatDatabase> catDatabaseProvider) {
    this.catDatabaseProvider = catDatabaseProvider;
  }

  @Override
  public CatDao get() {
    return provideCatDao(catDatabaseProvider.get());
  }

  public static RoomModule_ProvideCatDaoFactory create(Provider<CatDatabase> catDatabaseProvider) {
    return new RoomModule_ProvideCatDaoFactory(catDatabaseProvider);
  }

  public static CatDao provideCatDao(CatDatabase catDatabase) {
    return Preconditions.checkNotNull(RoomModule.INSTANCE.provideCatDao(catDatabase), "Cannot return null from a non-@Nullable @Provides method");
  }
}
