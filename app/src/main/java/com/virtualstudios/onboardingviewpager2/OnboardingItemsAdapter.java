package com.virtualstudios.onboardingviewpager2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

class OnboardingItemsAdapter {

    inner class OnboardingItemViewHolder(view:View) : RecyclerView.ViewHolder(view){

        private val imageOnboarding = view.findViewById<ImageView>(R.id.imageOnboarding)
        private val textTitle = view.findViewById<TextView>(R.id.textTitle)
        private val textDescription = view.findViewById<TextView>(R.id.textDescription)

              fun bind(onboardingItem: OnboardingItem){
        }
    }
}
