package com.example.di

import com.example.core.utils.logDebug
import com.example.data.datasource.SupabaseClientProvider
import org.koin.dsl.module

val supabaseModule = module {
    single { SupabaseClientProvider(
        supabaseUrl = "https://moygfqmmtuwvpeatrvhw.supabase.co",
        supabaseKey = "sb_publishable_hfxhVvbzz9SQ9gQovMtFhA_Gte1KvBG"
    ).client }

}