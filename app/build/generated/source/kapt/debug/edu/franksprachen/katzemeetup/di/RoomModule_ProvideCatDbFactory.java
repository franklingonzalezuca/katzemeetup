package edu.franksprachen.katzemeetup.di;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class RoomModule_ProvideCatDbFactory implements Factory<CatDatabase> {
  private final Provider<Context> contextProvider;

  public RoomModule_ProvideCatDbFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public CatDatabase get() {
    return provideCatDb(contextProvider.get());
  }

  public static RoomModule_ProvideCatDbFactory create(Provider<Context> contextProvider) {
    return new RoomModule_ProvideCatDbFactory(contextProvider);
  }

  public static CatDatabase provideCatDb(Context context) {
    return Preconditions.checkNotNull(RoomModule.INSTANCE.provideCatDb(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
