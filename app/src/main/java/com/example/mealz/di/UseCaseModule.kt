package com.example.mealz.di

import com.example.domain.repo.MealsRepo
import com.example.domain.usecase.GetMealsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideUseCase(mealsRepo: MealsRepo): GetMealsUseCase{
        return GetMealsUseCase(mealsRepo)
    }
}