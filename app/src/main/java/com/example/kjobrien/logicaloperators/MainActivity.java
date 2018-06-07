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

        // True And True
        TextView txtTrueAndTrue = (TextView) findViewById(R.id.txtTrueAndTrue);
        CheckBox chxTrueAndTrueYes = (CheckBox) findViewById(R.id.chxTrueAndTrueYes);
        CheckBox chxTrueAndTrueNo = (CheckBox) findViewById(R.id.chxTrueAndTrueNo);

        // True And False
        TextView txtTrueAndFalse = (TextView) findViewById(R.id.txtTrueAndFalse);
        CheckBox chxTrueAndFalseYes = (CheckBox) findViewById(R.id.chxTrueAndFalseYes);
        CheckBox chxTrueAndFalseNo = (CheckBox) findViewById(R.id.chxTrueAndFalseNo);


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

        // True And True

        boolean trueAndTrue = (true && true);

        /*if (trueAndTrue) {
            chxTrueAndTrueYes.setChecked(true);
        } else if (!trueAndTrue) {
            chxHealthyNo.setChecked(true);
        }*/

        chxTrueAndTrueYes.setChecked((trueAndTrue ? true : false));
        chxTrueAndTrueNo.setChecked((!trueAndTrue ? true : false));

        // True And False
        boolean trueAndFalse = (true && false);
        if (trueAndFalse) {
            chxTrueAndFalseYes.setChecked(true);
        } else if (!trueAndFalse) {
            chxTrueAndTrueNo.setChecked(true);
        }


    }
}
