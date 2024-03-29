package com.punam.mon.di

import com.punam.mon.src.domain.repository.UserRepository
import com.punam.mon.src.domain.use_case.user.UserLogin
import com.punam.mon.src.domain.use_case.user.UserUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    @Singleton
    fun provideUserUseCases(repository: UserRepository): UserUseCase {
        return UserUseCase(
            userLogin = UserLogin(repository),
        )
    }
}