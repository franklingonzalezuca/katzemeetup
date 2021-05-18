package edu.franksprachen.katzemeetup.view.fragment;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class MainFragment_MembersInjector implements MembersInjector<MainFragment> {
  private final Provider<AdapterCats> catsAdapterProvider;

  public MainFragment_MembersInjector(Provider<AdapterCats> catsAdapterProvider) {
    this.catsAdapterProvider = catsAdapterProvider;
  }

  public static MembersInjector<MainFragment> create(Provider<AdapterCats> catsAdapterProvider) {
    return new MainFragment_MembersInjector(catsAdapterProvider);
  }

  @Override
  public void injectMembers(MainFragment instance) {
    injectCatsAdapter(instance, catsAdapterProvider.get());
  }

  @InjectedFieldSignature("edu.franksprachen.katzemeetup.view.fragment.MainFragment.catsAdapter")
  public static void injectCatsAdapter(MainFragment instance, AdapterCats catsAdapter) {
    instance.catsAdapter = catsAdapter;
  }
}
