package com.dicoding.storyapp.injection

import android.content.Context
import com.dicoding.storyapp.data.repository.UserRepository
import com.dicoding.storyapp.data.pref.UserPreference
import com.dicoding.storyapp.data.pref.dataStore

object Injection {
    fun provideRepository(context: Context): UserRepository {
        val pref = UserPreference.getInstance(context.dataStore)
        return UserRepository.getInstance(pref)
    }

//    fun provideRepository(context: Context): QuoteRepository {
//        val database = QuoteDatabase.getDatabase(context)
//        val apiService = ApiConfig.getApiService()
//        return QuoteRepository(database, apiService)
//    }
}