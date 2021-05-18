package edu.franksprachen.katzemeetup.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import edu.franksprachen.katzemeetup.repository.CatRepository
import edu.franksprachen.katzemeetup.retrofit.CatNetworkMapper
import edu.franksprachen.katzemeetup.retrofit.CatRetrofit
import edu.franksprachen.katzemeetup.room.CacheMapper
import edu.franksprachen.katzemeetup.room.CatDao
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object RepositoryModule {
    @Singleton
    @Provides
    fun provideCatRepository(
        catDao: CatDao,
        catRetrofit: CatRetrofit,
        cacheMapper: CacheMapper,
        networkMapper: CatNetworkMapper
    ):CatRepository {
        return CatRepository(catDao, catRetrofit, cacheMapper, networkMapper)
    }
}