package com.example.mufidamodul4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_fragment1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragment2 = Fragment2()
        val btn_dua = view.findViewById<Button>(R.id.btn_dua)
        btn_dua.setOnClickListener{
            val bundle = Bundle()
            val et_uname = view.findViewById<EditText>(R.id.etUname)
            val et_email = view.findViewById<EditText>(R.id.etEmail)
            val uname = et_uname.text.toString()
            val email = et_email.text.toString()

            bundle.putString(Fragment2.EXTRA_UNAME, uname)

            fragment2.arguments = bundle
            fragment2.email = email

            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.container, fragment2, Fragment2::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }
    }

    private fun findViewById(btnDua: Int): Button {
        TODO("Not yet implemented")
    }

}