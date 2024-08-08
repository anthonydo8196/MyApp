package com.myapp.ui.routine.fragments.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapp.R
import com.myapp.ui.routine.data.EntryViewModel


class AddEntryFragment : Fragment() {

    private lateinit var mEntryViewModel: EntryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add_entry, container, false)

        view.findViewById<Button>(R.id.addButton).setOnClickListener {
            insertDataToDatabase()
        }

        mEntryViewModel = ViewModelProvider(this).get(EntryViewModel::class.java)

        return view
    }

    private fun insertDataToDatabase() {
//    val input = initial
    }


}