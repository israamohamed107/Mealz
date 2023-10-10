package com.example.mealz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.mealz.databinding.ActivityMainBinding
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewModel : MealsViewModel by viewModels()
    private lateinit var _binding:ActivityMainBinding
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        viewModel.getMeals()

        val mealsAdapter = MealsAdapter()
        lifecycleScope.launchWhenCreated {
            viewModel.categories.collect{
                mealsAdapter.submitList(it?.categories)
                binding.categoryRv.adapter = mealsAdapter

            }

        }
    }
}