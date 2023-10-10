package com.example.data.repo

import com.example.data.remote.ApiService
import com.example.domain.entity.CategoryResponse
import com.example.domain.repo.MealsRepo


// implementation of aMealsRepo interface from domain layer
class MealzRepoImpl (private val apiService: ApiService) : MealsRepo {
    override suspend fun getMealsRemote(): CategoryResponse  = apiService.getMovieRemote()
}