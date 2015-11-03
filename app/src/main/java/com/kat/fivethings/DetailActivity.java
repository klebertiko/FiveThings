package com.kat.fivethings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundleExtras = getIntent().getExtras();
        if (bundleExtras != null) {
            String detail = bundleExtras.getString("detail");

            if ("cpr".equalsIgnoreCase(detail)) {
                setContentView(R.layout.activity_detail_cpr);
            } else if ("consciousChoking".equalsIgnoreCase(detail)) {
                setContentView(R.layout.activity_detail_consciouschoking);
            } else if ("bleeding".equalsIgnoreCase(detail)) {
                setContentView(R.layout.activity_detail_bleeding);
            } else if ("drowning".equalsIgnoreCase(detail)) {
                setContentView(R.layout.activity_detail_drowning);
            } else if ("burns".equalsIgnoreCase(detail)) {
                setContentView(R.layout.activity_detail_burns);
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }
}
