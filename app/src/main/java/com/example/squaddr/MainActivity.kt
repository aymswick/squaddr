package com.example.squaddr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import com.example.squaddr.dummy.DummyContent
import com.example.squaddr.fragments.FeedItemFragment
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.bottomsheet_shout.*
import kotlinx.android.synthetic.main.hamburger_menu_layout.*


class MainActivity : AppCompatActivity(), FeedItemFragment.OnListFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Setup the BottomAppBar (has a left hamburger menu and some other buttons on the right)
        val bar = findViewById(R.id.bottomAppBar) as BottomAppBar
        setSupportActionBar(bar)
        bar.setNavigationOnClickListener {
            openHamburgerMenu()
        }

        // Persistent BottomSheet (for list of users to in your squad)
        var bottomSheetBehavior = BottomSheetBehavior.from(bottomsheet_shout)
        shoutButton.setOnClickListener {
            if (bottomSheetBehavior.getState() != BottomSheetBehavior.STATE_EXPANDED) {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED)
            } else {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED)
            }
        }
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

    fun openHamburgerMenu() {
        // First set the bottom sheet which will pop up with menu items
        val bottomSheetDialog = BottomSheetDialog(this)
        val bottomSheetLayout = layoutInflater.inflate(R.layout.hamburger_menu_layout, null)
        bottomSheetDialog.setContentView(bottomSheetLayout)
        bottomSheetDialog.show()
        return
        TODO("not implemented") //set onclick listener, wire up profile fragment, refactor menu layout
    }
}
