package com.example.navigationcomponentpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs


class FragmentC : Fragment(R.layout.fragment_c) {
    val args: FragmentCArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textMessage = args.recievedMessage //use args to recieve the data sent from fragment b

        val theMessage = view.findViewById<TextView>(R.id.the_received_message)
        theMessage.text = textMessage
    }
}