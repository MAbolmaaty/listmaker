package com.emupapps.listmaker.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.emupapps.listmaker.R
import com.emupapps.listmaker.ui.detail.ui.detail.ListDetailFragment

class ListDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_detail_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, ListDetailFragment.newInstance())
                .commitNow()
        }
    }
}