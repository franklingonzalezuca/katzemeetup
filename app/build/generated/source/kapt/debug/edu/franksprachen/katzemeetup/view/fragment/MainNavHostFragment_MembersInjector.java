package edu.franksprachen.katzemeetup.view.fragment;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class MainNavHostFragment_MembersInjector implements MembersInjector<MainNavHostFragment> {
  private final Provider<MainFragmentFactory> fragmentFactoryProvider;

  public MainNavHostFragment_MembersInjector(
      Provider<MainFragmentFactory> fragmentFactoryProvider) {
    this.fragmentFactoryProvider = fragmentFactoryProvider;
  }

  public static MembersInjector<MainNavHostFragment> create(
      Provider<MainFragmentFactory> fragmentFactoryProvider) {
    return new MainNavHostFragment_MembersInjector(fragmentFactoryProvider);
  }

  @Override
  public void injectMembers(MainNavHostFragment instance) {
    injectFragmentFactory(instance, fragmentFactoryProvider.get());
  }

  @InjectedFieldSignature("edu.franksprachen.katzemeetup.view.fragment.MainNavHostFragment.fragmentFactory")
  public static void injectFragmentFactory(MainNavHostFragment instance,
      MainFragmentFactory fragmentFactory) {
    instance.fragmentFactory = fragmentFactory;
  }
}
