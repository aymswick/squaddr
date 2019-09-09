package com.example.squaddr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.example.squaddr.dummy.DummyContent
import com.example.squaddr.fragments.FeedItemFragment
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bottomsheet_shout.*


class MainActivity : AppCompatActivity(), FeedItemFragment.OnListFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bar = findViewById(R.id.bottomAppBar) as BottomAppBar
        var bottomSheetBehavior = BottomSheetBehavior.from(bottomsheet_shout)

        shoutButton.setOnClickListener {
            if (bottomSheetBehavior.getState() != BottomSheetBehavior.STATE_EXPANDED) {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED)
            } else {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED)
            }
        }

        //supportFragmentManager.beginTransaction().add()

        setSupportActionBar(bar)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.bottombar_menu, menu)
        return true
    }

    // Required for Feed Item Fragment communication between activity and frag
    override fun onListFragmentInteraction(item: DummyContent.DummyItem?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
