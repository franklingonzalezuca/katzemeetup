package edu.franksprachen.katzemeetup.repository;

import edu.franksprachen.katzemeetup.retrofit.CatNetworkMapper;
import edu.franksprachen.katzemeetup.retrofit.CatRetrofit;
import edu.franksprachen.katzemeetup.room.CacheMapper;
import edu.franksprachen.katzemeetup.room.CatDao;
import edu.franksprachen.katzemeetup.util.DataState;
import kotlinx.coroutines.flow.Flow;
import java.lang.Exception;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Ledu/franksprachen/katzemeetup/repository/CatRepository;", "", "catDao", "Ledu/franksprachen/katzemeetup/room/CatDao;", "catRetrofit", "Ledu/franksprachen/katzemeetup/retrofit/CatRetrofit;", "cacheMapper", "Ledu/franksprachen/katzemeetup/room/CacheMapper;", "networkMapper", "Ledu/franksprachen/katzemeetup/retrofit/CatNetworkMapper;", "(Ledu/franksprachen/katzemeetup/room/CatDao;Ledu/franksprachen/katzemeetup/retrofit/CatRetrofit;Ledu/franksprachen/katzemeetup/room/CacheMapper;Ledu/franksprachen/katzemeetup/retrofit/CatNetworkMapper;)V", "getCats", "Lkotlinx/coroutines/flow/Flow;", "Ledu/franksprachen/katzemeetup/util/DataState;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CatRepository {
    private final edu.franksprachen.katzemeetup.room.CatDao catDao = null;
    private final edu.franksprachen.katzemeetup.retrofit.CatRetrofit catRetrofit = null;
    private final edu.franksprachen.katzemeetup.room.CacheMapper cacheMapper = null;
    private final edu.franksprachen.katzemeetup.retrofit.CatNetworkMapper networkMapper = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCats(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends edu.franksprachen.katzemeetup.util.DataState>> p0) {
        return null;
    }
    
    public CatRepository(@org.jetbrains.annotations.NotNull()
    edu.franksprachen.katzemeetup.room.CatDao catDao, @org.jetbrains.annotations.NotNull()
    edu.franksprachen.katzemeetup.retrofit.CatRetrofit catRetrofit, @org.jetbrains.annotations.NotNull()
    edu.franksprachen.katzemeetup.room.CacheMapper cacheMapper, @org.jetbrains.annotations.NotNull()
    edu.franksprachen.katzemeetup.retrofit.CatNetworkMapper networkMapper) {
        super();
    }
}