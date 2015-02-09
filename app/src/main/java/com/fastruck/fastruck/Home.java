package com.fastruck.fastruck;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.fastruck.fastruck.model.Foodtruck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Home extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final ListView listview = (ListView) findViewById(R.id.listview);
        //String[] values = new String[] { "Le Camion qui fume", "La Cantine California",
        //                                 "Glazed", "Le refectoire"};
        Foodtruck[] foodtrucks = new Foodtruck[] {
            new Foodtruck("Le Camion qui fume", "un excellent foodtruck", R.drawable.camionquifume),
            new Foodtruck("La Cantine California", "un foodtruck top", R.drawable.cantinecalifornia),
            new Foodtruck("Glazed", "un foodtruck génial", R.drawable.wideglaceglazed),
            new Foodtruck("Le refectoire", "le meilleur foodtruck", R.drawable.lerefectoire)
        };
        final FoodtruckAdapter adapter = new FoodtruckAdapter(getApplicationContext(), foodtrucks);
        listview.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
