package com.struzzwebsolutions.starbuzz

import android.app.Activity
import android.os.Bundle

class TopLevelActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_level)
    }
}
