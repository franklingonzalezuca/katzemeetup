package edu.franksprachen.katzemeetup.view;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.google.gson.Gson;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import edu.franksprachen.katzemeetup.di.AdaptersModule;
import edu.franksprachen.katzemeetup.di.AdaptersModule_ProvideAdapterGenresFactory;
import edu.franksprachen.katzemeetup.di.RepositoryModule;
import edu.franksprachen.katzemeetup.di.RepositoryModule_ProvideCatRepositoryFactory;
import edu.franksprachen.katzemeetup.di.RetrofitModule;
import edu.franksprachen.katzemeetup.di.RetrofitModule_ProvideCatServiceFactory;
import edu.franksprachen.katzemeetup.di.RetrofitModule_ProvideGsonBuilderFactory;
import edu.franksprachen.katzemeetup.di.RetrofitModule_ProvideRetrofitFactory;
import edu.franksprachen.katzemeetup.di.RoomModule;
import edu.franksprachen.katzemeetup.di.RoomModule_ProvideCatDaoFactory;
import edu.franksprachen.katzemeetup.di.RoomModule_ProvideCatDbFactory;
import edu.franksprachen.katzemeetup.repository.CatRepository;
import edu.franksprachen.katzemeetup.retrofit.CatNetworkMapper;
import edu.franksprachen.katzemeetup.retrofit.CatRetrofit;
import edu.franksprachen.katzemeetup.room.CacheMapper;
import edu.franksprachen.katzemeetup.room.CatDao;
import edu.franksprachen.katzemeetup.room.CatDatabase;
import edu.franksprachen.katzemeetup.util.AdapterCats;
import edu.franksprachen.katzemeetup.view.fragment.MainFragment;
import edu.franksprachen.katzemeetup.view.fragment.MainFragmentFactory;
import edu.franksprachen.katzemeetup.view.fragment.MainFragment_MembersInjector;
import edu.franksprachen.katzemeetup.view.fragment.MainNavHostFragment;
import edu.franksprachen.katzemeetup.view.fragment.MainNavHostFragment_MembersInjector;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
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
public final class DaggerMainApp_HiltComponents_ApplicationC extends MainApp_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object catDatabase = new MemoizedSentinel();

  private volatile Object catDao = new MemoizedSentinel();

  private volatile Object gson = new MemoizedSentinel();

  private volatile Object retrofitBuilder = new MemoizedSentinel();

  private volatile Object catRetrofit = new MemoizedSentinel();

  private volatile Object catRepository = new MemoizedSentinel();

  private volatile Provider<CatRepository> provideCatRepositoryProvider;

  private volatile Object adapterCats = new MemoizedSentinel();

  private DaggerMainApp_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private CatDatabase getCatDatabase() {
    Object local = catDatabase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = catDatabase;
        if (local instanceof MemoizedSentinel) {
          local = RoomModule_ProvideCatDbFactory.provideCatDb(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          catDatabase = DoubleCheck.reentrantCheck(catDatabase, local);
        }
      }
    }
    return (CatDatabase) local;
  }

  private CatDao getCatDao() {
    Object local = catDao;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = catDao;
        if (local instanceof MemoizedSentinel) {
          local = RoomModule_ProvideCatDaoFactory.provideCatDao(getCatDatabase());
          catDao = DoubleCheck.reentrantCheck(catDao, local);
        }
      }
    }
    return (CatDao) local;
  }

  private Gson getGson() {
    Object local = gson;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = gson;
        if (local instanceof MemoizedSentinel) {
          local = RetrofitModule_ProvideGsonBuilderFactory.provideGsonBuilder();
          gson = DoubleCheck.reentrantCheck(gson, local);
        }
      }
    }
    return (Gson) local;
  }

  private Retrofit.Builder getRetrofitBuilder() {
    Object local = retrofitBuilder;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = retrofitBuilder;
        if (local instanceof MemoizedSentinel) {
          local = RetrofitModule_ProvideRetrofitFactory.provideRetrofit(getGson());
          retrofitBuilder = DoubleCheck.reentrantCheck(retrofitBuilder, local);
        }
      }
    }
    return (Retrofit.Builder) local;
  }

  private CatRetrofit getCatRetrofit() {
    Object local = catRetrofit;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = catRetrofit;
        if (local instanceof MemoizedSentinel) {
          local = RetrofitModule_ProvideCatServiceFactory.provideCatService(getRetrofitBuilder());
          catRetrofit = DoubleCheck.reentrantCheck(catRetrofit, local);
        }
      }
    }
    return (CatRetrofit) local;
  }

  private CatRepository getCatRepository() {
    Object local = catRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = catRepository;
        if (local instanceof MemoizedSentinel) {
          local = RepositoryModule_ProvideCatRepositoryFactory.provideCatRepository(getCatDao(), getCatRetrofit(), new CacheMapper(), new CatNetworkMapper());
          catRepository = DoubleCheck.reentrantCheck(catRepository, local);
        }
      }
    }
    return (CatRepository) local;
  }

  private Provider<CatRepository> getCatRepositoryProvider() {
    Object local = provideCatRepositoryProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      provideCatRepositoryProvider = (Provider<CatRepository>) local;
    }
    return (Provider<CatRepository>) local;
  }

  private AdapterCats getAdapterCats() {
    Object local = adapterCats;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = adapterCats;
        if (local instanceof MemoizedSentinel) {
          local = AdaptersModule_ProvideAdapterGenresFactory.provideAdapterGenres(ApplicationContextModule_ProvideApplicationFactory.provideApplication(applicationContextModule));
          adapterCats = DoubleCheck.reentrantCheck(adapterCats, local);
        }
      }
    }
    return (AdapterCats) local;
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  @Override
  public void injectMainApp(MainApp mainApp) {
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder adaptersModule(AdaptersModule adaptersModule) {
      Preconditions.checkNotNull(adaptersModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder repositoryModule(RepositoryModule repositoryModule) {
      Preconditions.checkNotNull(repositoryModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder retrofitModule(RetrofitModule retrofitModule) {
      Preconditions.checkNotNull(retrofitModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder roomModule(RoomModule roomModule) {
      Preconditions.checkNotNull(roomModule);
      return this;
    }

    public MainApp_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerMainApp_HiltComponents_ApplicationC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements MainApp_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public MainApp_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends MainApp_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements MainApp_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public MainApp_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends MainApp_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<MainViewModel_AssistedFactory> mainViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private MainViewModel_AssistedFactory getMainViewModel_AssistedFactory() {
        return new MainViewModel_AssistedFactory(DaggerMainApp_HiltComponents_ApplicationC.this.getCatRepositoryProvider());
      }

      private Provider<MainViewModel_AssistedFactory> getMainViewModel_AssistedFactoryProvider() {
        Object local = mainViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          mainViewModel_AssistedFactoryProvider = (Provider<MainViewModel_AssistedFactory>) local;
        }
        return (Provider<MainViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return Collections.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>singletonMap("edu.franksprachen.katzemeetup.view.MainViewModel", (Provider) getMainViewModel_AssistedFactoryProvider());
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMainApp_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      private final class FragmentCBuilder implements MainApp_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public MainApp_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends MainApp_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMainApp_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        @Override
        public void injectMainFragment(MainFragment mainFragment) {
          injectMainFragment2(mainFragment);
        }

        @Override
        public void injectMainNavHostFragment(MainNavHostFragment mainNavHostFragment) {
          injectMainNavHostFragment2(mainNavHostFragment);
        }

        private MainFragment injectMainFragment2(MainFragment instance) {
          MainFragment_MembersInjector.injectCatsAdapter(instance, DaggerMainApp_HiltComponents_ApplicationC.this.getAdapterCats());
          return instance;
        }

        private MainNavHostFragment injectMainNavHostFragment2(MainNavHostFragment instance) {
          MainNavHostFragment_MembersInjector.injectFragmentFactory(instance, new MainFragmentFactory());
          return instance;
        }

        private final class ViewWithFragmentCBuilder implements MainApp_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public MainApp_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends MainApp_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements MainApp_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public MainApp_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends MainApp_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // edu.franksprachen.katzemeetup.view.MainViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getMainViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements MainApp_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MainApp_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends MainApp_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // edu.franksprachen.katzemeetup.repository.CatRepository 
        return (T) DaggerMainApp_HiltComponents_ApplicationC.this.getCatRepository();

        default: throw new AssertionError(id);
      }
    }
  }
}
