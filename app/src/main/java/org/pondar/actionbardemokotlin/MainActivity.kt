package org.pondar.actionbardemokotlin

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        Log.d("icon_pressed", "${item.itemId}")
        when (item.itemId) {
            R.id.item_about -> {
                Toast.makeText(this, "About item clicked!", Toast.LENGTH_LONG)
                    .show()
                return true
            }
            R.id.item_delete -> {
                Toast.makeText(this, "Delete item clicked!", Toast.LENGTH_LONG)
                    .show()
                return true
            }
            R.id.item_help -> {
                Toast.makeText(this, "Help item clicked!", Toast.LENGTH_LONG)
                    .show()
                return true
            }
            R.id.item_refresh -> {
                Toast.makeText(this, "Refresh item clicked!", Toast.LENGTH_LONG)
                    .show()
                return true
            }
        }

        return false //we did not handle the event

    }
}