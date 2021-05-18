package edu.franksprachen.katzemeetup.retrofit;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CatNetworkMapper_Factory implements Factory<CatNetworkMapper> {
  @Override
  public CatNetworkMapper get() {
    return newInstance();
  }

  public static CatNetworkMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CatNetworkMapper newInstance() {
    return new CatNetworkMapper();
  }

  private static final class InstanceHolder {
    private static final CatNetworkMapper_Factory INSTANCE = new CatNetworkMapper_Factory();
  }
}
