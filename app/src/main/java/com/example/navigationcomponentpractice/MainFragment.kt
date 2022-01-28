package com.example.navigationcomponentpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class MainFragment : Fragment(R.layout.fragment_main) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnA = view.findViewById<Button>(R.id.btn_fragment_A)
        val btnB = view.findViewById<Button>(R.id.btn_fragment_B)

        btnA.setOnClickListener {
           // navigate to fragment A
            Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_fragmentA)
        }

        btnB.setOnClickListener {
            //navigate to fragment B
            Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_fragmentB)

        }
    }


}