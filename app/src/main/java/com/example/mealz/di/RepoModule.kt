package com.example.mealz.di

import com.example.data.remote.ApiService
import com.example.data.repo.MealzRepoImpl
import com.example.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideRepo(apiService: ApiService) : MealsRepo{
        return MealzRepoImpl(apiService)
    }
}