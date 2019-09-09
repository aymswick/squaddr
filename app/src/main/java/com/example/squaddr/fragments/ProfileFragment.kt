package com.example.squaddr.fragments

import android.os.Bundle
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import com.example.squaddr.R
import com.example.squaddr.transformations.CircleTransform
import com.squareup.picasso.Picasso

class ProfileFragment : Fragment() {

    override fun onCreateView(inflator: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflator.inflate(R.layout.profile_layout, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        drawProfileImage()
    }

    private fun drawProfileImage() {
        val view = this.view
        if (view != null) {
            val imageView = view.findViewById<ImageView>(R.id.profile_image)
            Picasso.get().load(R.drawable.michael_myers).transform(CircleTransform()).into(imageView)
        }
    }
}
