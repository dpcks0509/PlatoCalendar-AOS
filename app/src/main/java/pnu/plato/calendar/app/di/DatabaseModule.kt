package pnu.plato.calendar.app.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import pnu.plato.calendar.data.local.database.LoginCredentialsDataStore
import pnu.plato.calendar.data.local.database.SettingsDataStore
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun provideLoginCredentialsDataStore(
        @ApplicationContext context: Context,
    ): LoginCredentialsDataStore = LoginCredentialsDataStore(context)

    @Provides
    @Singleton
    fun provideSettingsDataStore(
        @ApplicationContext context: Context,
    ): SettingsDataStore = SettingsDataStore(context)
}
