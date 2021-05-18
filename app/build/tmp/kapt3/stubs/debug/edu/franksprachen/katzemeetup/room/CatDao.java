package edu.franksprachen.katzemeetup.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Ledu/franksprachen/katzemeetup/room/CatDao;", "", "getCats", "", "Ledu/franksprachen/katzemeetup/room/CatCacheEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCat", "", "catEntity", "(Ledu/franksprachen/katzemeetup/room/CatCacheEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface CatDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertCat(@org.jetbrains.annotations.NotNull()
    edu.franksprachen.katzemeetup.room.CatCacheEntity catEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM Breeds")
    public abstract java.lang.Object getCats(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<edu.franksprachen.katzemeetup.room.CatCacheEntity>> p0);
}