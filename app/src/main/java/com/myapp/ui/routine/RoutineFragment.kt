package com.myapp.ui.routine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapp.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class RoutineFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_routine, container, false)

        view.findViewById<FloatingActionButton>(R.id.routineFAB).setOnClickListener {
            findNavController().navigate(R.id.action_navigation_routine_to_addEntryFragment)
        }

        return view

    }
}