package com.example.pembermodul5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.pembermodul5.fragment.HomeFragment
import com.example.pembermodul5.fragment.ProfileFragment
import com.example.pembermodul5.fragment.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentHome = HomeFragment()
        val fragmentProfile = ProfileFragment()
        val fragmentSearch = SearchFragment()

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.nav_view)

        makeCurrentFragment(fragmentHome)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.navigation_home -> makeCurrentFragment(fragmentHome)
                R.id.navigation_search -> makeCurrentFragment(fragmentSearch)
                R.id.navigation_profile -> makeCurrentFragment(fragmentProfile)
            }
            true
        }
    }

    private fun makeCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container, fragment)
            commit()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.action_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.menu_chat -> {
                Toast.makeText(this,"This is Chat's Menu!", Toast.LENGTH_LONG).show()
                return true
            } R.id.menu_camera -> {
                Toast.makeText(this,"You Clicked Camera!", Toast.LENGTH_LONG).show()
                return true
            } R.id.menu_setting -> {
                Toast.makeText(this,"This is Setting!", Toast.LENGTH_LONG).show()
                return true
            } else -> super.onOptionsItemSelected(item)
        }
    }
}