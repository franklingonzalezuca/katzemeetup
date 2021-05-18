package edu.franksprachen.katzemeetup.di;

import android.content.Context;
import androidx.room.Room;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;
import dagger.hilt.android.qualifiers.ApplicationContext;
import edu.franksprachen.katzemeetup.room.CatDao;
import edu.franksprachen.katzemeetup.room.CatDatabase;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Ledu/franksprachen/katzemeetup/di/RoomModule;", "", "()V", "provideCatDao", "Ledu/franksprachen/katzemeetup/room/CatDao;", "catDatabase", "Ledu/franksprachen/katzemeetup/room/CatDatabase;", "provideCatDb", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public final class RoomModule {
    @org.jetbrains.annotations.NotNull()
    public static final edu.franksprachen.katzemeetup.di.RoomModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final edu.franksprachen.katzemeetup.room.CatDatabase provideCatDb(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final edu.franksprachen.katzemeetup.room.CatDao provideCatDao(@org.jetbrains.annotations.NotNull()
    edu.franksprachen.katzemeetup.room.CatDatabase catDatabase) {
        return null;
    }
    
    private RoomModule() {
        super();
    }
}