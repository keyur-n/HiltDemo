package com.example.hiltdemo

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)
object ActivityModule{

    @ActivityScoped
    @Provides
    @Named("StringFromResource")
    fun provideString(
        @ApplicationContext context: Context,
        @Named("String1") testString:String
    )= "${context.getString(R.string.err_username_empty)} - $testString"
}