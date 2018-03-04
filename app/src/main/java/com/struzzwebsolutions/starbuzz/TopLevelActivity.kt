package com.struzzwebsolutions.starbuzz

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class TopLevelActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_level)

        val listView = findViewById<ListView>(R.id.list_options)

        listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            var intent: Intent? = null
            when (i) {
                0 -> intent = Intent(this, DrinkCategoryActivity::class.java)
                1 -> Toast.makeText(this, "Not yet implemented", Toast.LENGTH_SHORT).show()
                2 -> Toast.makeText(this, "Not yet implemented", Toast.LENGTH_LONG).show()
            }
            if (intent != null) startActivity(intent) else Toast.makeText(this, "Please try again", Toast.LENGTH_LONG).show()
            //startActivity(intent)
        }
    }

}
