package com.kat.fivethings;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // the layout on which you are working
        LinearLayout emergencyNumberLinearLayout = (LinearLayout) findViewById(R.id.emergencyNumberLinearLayout);
        // device language to show emergency number button
        String deviceLanguage = Locale.getDefault().getLanguage();
        if (deviceLanguage.equalsIgnoreCase("en")) { // us has one emergency number
            // create button and set the properties for button
            Button emergencyNumber911Button = new Button(this);
            emergencyNumber911Button.setText(super.getString(R.string.emergencyNumber911));
            LinearLayout.LayoutParams linearLayoutParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, 1.0f);
            emergencyNumber911Button.setLayoutParams(linearLayoutParams);

            // starts a phone call intent
            emergencyNumber911Button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + getString(R.string.emergencyNumber911)));
                    if (intent.resolveActivity(getPackageManager()) != null) {
                        startActivity(intent);
                    }
                }
            });
            //add button to the layout
            emergencyNumberLinearLayout.addView(emergencyNumber911Button);
        } else if(deviceLanguage.equalsIgnoreCase("pt")) { // brazil has two emergency numbers
            LinearLayout.LayoutParams lineLayoutParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, 1.0f);


            // create button and set the properties for button
            Button emergencyNumberOneButton = new Button(this);
            emergencyNumberOneButton.setText(getString(R.string.emergencyNumberOne));
            emergencyNumberOneButton.setLayoutParams(lineLayoutParams);

            // starts a phone call intent
            emergencyNumberOneButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + getString(R.string.emergencyNumberOne)));
                    if (intent.resolveActivity(getPackageManager()) != null) {
                        startActivity(intent);
                    }
                }
            });
            //add button to the layout
            emergencyNumberLinearLayout.addView(emergencyNumberOneButton);

            // create button and set the properties for button
            Button emergencyNumberTwoButton = new Button(this);
            emergencyNumberTwoButton.setText(getString(R.string.emergencyNumberTwo));
            emergencyNumberTwoButton.setLayoutParams(lineLayoutParams);

            // starts a phone call intent
            emergencyNumberTwoButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + getString(R.string.emergencyNumberTwo)));
                    if (intent.resolveActivity(getPackageManager()) != null) {
                        startActivity(intent);
                    }
                }
            });
            //add button to the layout
            emergencyNumberLinearLayout.addView(emergencyNumberTwoButton);
        }

        // creates a click event and starts detail activity for CPR
        TextView cprTextView = (TextView) findViewById(R.id.cprTextView);
        cprTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(intent);
            }
        });

        // creates a click event and starts detail activity for heimlich maneuver
        TextView heimlichManeuverTextView = (TextView) findViewById(R.id.heimlichManeuverTextView);
        heimlichManeuverTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(intent);
            }
        });

        // creates a click event and starts detail activity for bleeding hemorrhage
        TextView bleedingHemorrhageTextView = (TextView) findViewById(R.id.bleedingHemorrhageTextView);
        bleedingHemorrhageTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(intent);
            }
        });

        // creates a click event and starts detail activity for drowning
        TextView drowningTextView = (TextView) findViewById(R.id.drowningTextView);
        drowningTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(intent);
            }
        });

        // creates a click event and starts detail activity for burns
        TextView burnsTextView = (TextView) findViewById(R.id.burnsTextView);
        burnsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
