package com.example.data.datasource

import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.createSupabaseClient


class SupabaseClientProvider {
    var client: SupabaseClient
        private set

    constructor(supabaseUrl: String, supabaseKey: String) {

        client = createSupabaseClient(
            supabaseUrl = supabaseUrl,
            supabaseKey = supabaseKey,
            builder = {}
        )
    }

}
