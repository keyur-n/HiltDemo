package com.example.hiltdemo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

/**
 * This object live as long as application does
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    @Named("String1")//Named is optional based on return type, if you have same return multiple times then only required
    fun provideTestString1() = "This is test string from Hilt 1"

    @Singleton
    @Provides
    @Named("String2")
    fun provideTestString2() = "This is test string from Hilt 2"


}