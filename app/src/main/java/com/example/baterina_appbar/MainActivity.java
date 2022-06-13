package com.example.baterina_appbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.navigation_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()){
            //REFRESH NAVIGATION
            case R.id.nav_refresh:
                Toast.makeText(this, "YOU CLICK THE REFRESH NAVIGATION", Toast.LENGTH_LONG).show();
                Log.i("MESSAGE", "YOU CLICK THE REFRESH NAVIGATION");
                return true;

                //SEARCH NAVIGATION
            case R.id.nav_search:
                Toast.makeText(this, "YOU CLICK THE SEARCH NAVIGATION", Toast.LENGTH_SHORT).show();
                Log.i("MESSAGE", "YOU CLICK THE SEARCH NAVIGATION");
                return true;
            case R.id.search_Name:
                Toast.makeText(this, "YOU ARE SEARCHING FOR AN NAME", Toast.LENGTH_SHORT).show();
                Log.i("MESSAGE", "YOU ARE SEARCHING FOR AN NAME");
                return true;
            case R.id.search_IDNumber:
                Toast.makeText(this, "YOU ARE SEARCHING FOR AN ID NUMBER", Toast.LENGTH_SHORT).show();
                Log.i("MESSAGE", "YOU ARE SEARCHING FOR AN ID NUMBER");
                return true;
            case R.id.search_Address:
                Toast.makeText(this, "YOU ARE SEARCHING FOR AN ADDRESS", Toast.LENGTH_SHORT).show();
                Log.i("MESSAGE", "YOU ARE SEARCHING FOR AN ADDRESS");
                return true;

                //COURSE NAVIGATION
            case R.id.nav_Course:
                Toast.makeText(this, "YOU CLICK THE COURSE NAVIGATION", Toast.LENGTH_LONG).show();
                Log.i("MESSAGE", "YOU CLICK THE COURSE NAVIGATION");
                return true;
            case R.id.search_IT:
                Toast.makeText(this, "BS INFORMATION TECHNOLOGY", Toast.LENGTH_LONG).show();
                Log.i("MESSAGE", "BS INFORMATION TECHNOLOGY");
                return true;
            case R.id.search_CS:
                Toast.makeText(this, "BS Computer Science", Toast.LENGTH_LONG).show();
                Log.i("MESSAGE", "BS Computer Science");
                return true;
            case R.id.search_EMC:
                Toast.makeText(this, "BS Entertainment and Multimedia Computing - DAT", Toast.LENGTH_LONG).show();
                Log.i("MESSAGE", "BS Entertainment and Multimedia Computing - DAT");
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}