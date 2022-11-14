package com.unfixedbo1t.messagesending.di

import com.unfixedbo1t.messagesending.RecipientRepository
import com.unfixedbo1t.messagesending.RecipientRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class ViewModelModule {
    @Binds
    abstract fun bindRecipientsRepository(impl: RecipientRepositoryImpl): RecipientRepository
}
