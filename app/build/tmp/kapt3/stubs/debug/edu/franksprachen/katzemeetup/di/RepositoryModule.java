package edu.franksprachen.katzemeetup.di;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;
import edu.franksprachen.katzemeetup.repository.CatRepository;
import edu.franksprachen.katzemeetup.retrofit.CatNetworkMapper;
import edu.franksprachen.katzemeetup.retrofit.CatRetrofit;
import edu.franksprachen.katzemeetup.room.CacheMapper;
import edu.franksprachen.katzemeetup.room.CatDao;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Ledu/franksprachen/katzemeetup/di/RepositoryModule;", "", "()V", "provideCatRepository", "Ledu/franksprachen/katzemeetup/repository/CatRepository;", "catDao", "Ledu/franksprachen/katzemeetup/room/CatDao;", "catRetrofit", "Ledu/franksprachen/katzemeetup/retrofit/CatRetrofit;", "cacheMapper", "Ledu/franksprachen/katzemeetup/room/CacheMapper;", "networkMapper", "Ledu/franksprachen/katzemeetup/retrofit/CatNetworkMapper;", "app_debug"})
@dagger.Module()
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull()
    public static final edu.franksprachen.katzemeetup.di.RepositoryModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final edu.franksprachen.katzemeetup.repository.CatRepository provideCatRepository(@org.jetbrains.annotations.NotNull()
    edu.franksprachen.katzemeetup.room.CatDao catDao, @org.jetbrains.annotations.NotNull()
    edu.franksprachen.katzemeetup.retrofit.CatRetrofit catRetrofit, @org.jetbrains.annotations.NotNull()
    edu.franksprachen.katzemeetup.room.CacheMapper cacheMapper, @org.jetbrains.annotations.NotNull()
    edu.franksprachen.katzemeetup.retrofit.CatNetworkMapper networkMapper) {
        return null;
    }
    
    private RepositoryModule() {
        super();
    }
}