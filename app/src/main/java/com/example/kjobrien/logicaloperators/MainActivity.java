package com.example.kjobrien.logicaloperators;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create Objects
        TextView txtHealthy = (TextView) findViewById(R.id.txtHealthy);
        final CheckBox chxHealthyYes = (CheckBox) findViewById(R.id.chxHealthyYes);
        final CheckBox chxHealthyNo = (CheckBox) findViewById(R.id.chxHealthyNo);


        chxHealthyYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (chxHealthyYes.isChecked()) {

                    chxHealthyNo.setChecked(false);

                }

            }
        });


        chxHealthyNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chxHealthyNo.isChecked()) {

                    chxHealthyYes.setChecked(false);
                }
            }
        });

        boolean amIHealthy = false;
        int power = 30;

        /*if (amIHealthy) {

            chxHealthyYes.setChecked(true);
        } else if (!amIHealthy) {
            chxHealthyNo.setChecked(true);
        }*/


        /*amIHealthy = (power > 70);

        if (amIHealthy) {
            chxHealthyYes.setChecked(true);
        } else if (!amIHealthy) {
            chxHealthyNo.setChecked(true);
        }*/

        amIHealthy = (power > 70 ? true : false);

        /*if (amIHealthy) {
            chxHealthyYes.setChecked(true);
        } else if (!amIHealthy) {

            chxHealthyNo.setChecked(true);
        }*/

        /*chxHealthyYes.setChecked((power > 80 ? true : false));
        chxHealthyNo.setChecked((power < 80 ? true : false));*/

        amIHealthy = (power > 90);

        chxHealthyYes.setChecked((amIHealthy ? true : false)); // Make check box decide if checked
        chxHealthyNo.setChecked((!amIHealthy ? true : false));

    }
}
