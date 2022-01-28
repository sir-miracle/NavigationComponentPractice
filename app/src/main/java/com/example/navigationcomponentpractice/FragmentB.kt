package com.example.navigationcomponentpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.Navigation

class FragmentB : Fragment(R.layout.fragment_b) {
lateinit var tvMessage: EditText

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

         tvMessage = view.findViewById(R.id.text_message)
        val btnSend = view.findViewById<Button>(R.id.btn_send)


        btnSend.setOnClickListener {
            val message = tvMessage.text.toString()
            if (message.isNotBlank()) {
               // use action to navigate to fragment C and pass(in this case, message) data to it using safeargs
                val action = FragmentBDirections.actionFragmentBToFragmentC(message)
                Navigation.findNavController(view).navigate(action)
            } else {
                Toast.makeText(
                    requireActivity(), "Message Field Should not be empty",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}