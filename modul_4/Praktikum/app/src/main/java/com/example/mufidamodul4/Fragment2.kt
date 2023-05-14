package com.example.mufidamodul4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

//
class Fragment2 : Fragment() {

    var email: String? = null

    companion object{
        val EXTRA_EMAIL = "extra_email"
        val EXTRA_UNAME = "extra_uname"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_fragment2, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragment1 = Fragment1()
        val btn_satu = view.findViewById<Button>(R.id.btn_satu)
        btn_satu.setOnClickListener{
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.container, fragment1, Fragment1::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (savedInstanceState != null){
            val emaill = savedInstanceState.getString(EXTRA_EMAIL)
            email = emaill
        }

        if (arguments != null){
            val uname = arguments?.getString(EXTRA_UNAME)
            val tv_uname = view?.findViewById<TextView>(R.id.tv_Uname)
            val tv_email = view?.findViewById<TextView>(R.id.tv_Email)
            if (tv_uname != null) {
                tv_uname.text = uname
            }
            if (tv_email != null) {
                tv_email.text = email
            }
        }
    }

}