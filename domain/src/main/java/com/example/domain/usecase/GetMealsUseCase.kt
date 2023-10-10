package com.example.domain.usecase

import com.example.domain.repo.MealsRepo

class GetMealsUseCase (private val repo: MealsRepo) {

    suspend operator fun invoke () = repo.getMealsRemote()
}