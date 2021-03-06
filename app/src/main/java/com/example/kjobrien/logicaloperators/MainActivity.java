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

        // False And True
        CheckBox chxFalseAndTrueYes = (CheckBox) findViewById(R.id.chxFalseAndTrueYes);
        CheckBox chxFalseAndTrueNo = (CheckBox) findViewById(R.id.chxFalseAndTrueNo);

        // False And False
        CheckBox cbFalseAndFalseYes = (CheckBox) findViewById(R.id.cbFalseAndFalseYes);
        CheckBox cbFalseAndFalseNo = (CheckBox) findViewById(R.id.cbFalseAndFalseNo);

        // True Or True
        CheckBox cbTrueOrTrueYes = (CheckBox) findViewById(R.id.cbTrueOrTrueYes);
        CheckBox cbTrueOrTrueNo = (CheckBox) findViewById(R.id.cbTrueOrTrueNo);

        // True Or False
        CheckBox cbTrueOrFalseYes = (CheckBox) findViewById(R.id.cbTrueOrFalseYes);
        CheckBox cbTrueOrFalseNo = (CheckBox) findViewById(R.id.cbTrueOrFalseNo);

        // False or True
        CheckBox cbFalseOrTrueYes = (CheckBox) findViewById(R.id.cbFalseOrTrueYes);
        CheckBox cbFalseOrTrueNo = (CheckBox) findViewById(R.id.cbFalseOrTrueNo);

        // False Or False
        CheckBox cbFalseOrFalseYes = (CheckBox) findViewById(R.id.cbFalseOrFalseYes);
        CheckBox cbFalseOrFalseNo = (CheckBox) findViewById(R.id.cbFalseOrFalseNo);

        // True ^ True
        CheckBox cbTrueCaretTrueYes = (CheckBox) findViewById(R.id.cbTrueCaretTrueYes);
        CheckBox cbTrueCaretTrueNo = (CheckBox) findViewById(R.id.cbTrueCaretTrueNo);

        // True ^ False
        CheckBox cbTrueCaretFalseYes = (CheckBox) findViewById(R.id.cbTrueCaretFalseYes);
        CheckBox cbTrueCaretFalseNo = (CheckBox) findViewById(R.id.cbTrueOrFalseNo);

        // False ^ True
        CheckBox cbFalseCaretTrueYes = (CheckBox) findViewById(R.id.cbFalseCaretTrueYes);
        CheckBox cbFalseCaretTrueNo = (CheckBox) findViewById(R.id.cbFalseCaretTrueNo);

        // False ^ False
        CheckBox cbFalseCaretFalseYes = (CheckBox) findViewById(R.id.cbFalseCaretFalseYes);
        CheckBox cbFalseCaretFalseNo = (CheckBox) findViewById(R.id.cbFalseCaretFalseNo);


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
        /*if (trueAndFalse) {
            chxTrueAndFalseYes.setChecked(true);
        } else if (!trueAndFalse) {
            chxTrueAndFalseNo.setChecked(true);
        }*/

        chxTrueAndFalseYes.setChecked((trueAndFalse ? true : false));
        chxTrueAndFalseNo.setChecked((!trueAndFalse ? true : false));

        // False And True

        boolean falseAndTrue = (false && true);
        /*if(falseAndTrue){
            chxFalseAndTrueYes.setChecked(true);
        }else if (!falseAndTrue){
            chxFalseAndTrueNo.setChecked(true);
        }*/

        chxFalseAndTrueYes.setChecked((falseAndTrue ? true : false));
        chxFalseAndTrueNo.setChecked(!falseAndTrue ? true : false);

        // False And False
        boolean falseAndFalse = (false && false);

        /*if(falseAndFalse) {
            cbFalseAndFalseYes.setChecked(true);
        } else if (!falseAndFalse) {
            cbFalseAndFalseNo.setChecked(true);
        }*/

        cbFalseAndFalseYes.setChecked((falseAndFalse ? true : false));
        cbFalseAndFalseNo.setChecked((!falseAndFalse ? true : false));

        // True Or True
        boolean trueOrTrue = (true || true);
        /*if (trueOrTrue) {
            cbTrueOrTrueYes.setChecked(true);
        } else if (!trueOrTrue) {
            cbTrueOrTrueNo.setChecked(true);
        }*/

        cbTrueOrTrueYes.setChecked((trueOrTrue ? true : false));
        cbTrueOrTrueNo.setChecked((!trueOrTrue ? true : false));

        // True Or False
        boolean trueOrFalse = (true || false);
        /*if (trueOrFalse){
            cbTrueOrFalseYes.setChecked(true);
        }else if (!trueOrFalse){
            cbTrueOrTrueNo.setChecked(true);
        }*/

        cbTrueOrFalseYes.setChecked((trueOrFalse ? true : false));
        cbTrueOrFalseNo.setChecked((!trueOrFalse ? true : false));

        // False Or True
        boolean falseOrTrue = (false || true);

        /*if (falseOrTrue){
            cbFalseOrTrueYes.setChecked(true);
        } else if (!falseOrTrue) {
            cbFalseOrTrueNo.setChecked(true);
        }*/

        cbFalseOrTrueYes.setChecked((falseOrTrue ? true : false));
        cbFalseOrTrueNo.setChecked((!falseOrTrue ? true : false));

        // False Or False
        boolean falseOrFalse = (false || false);

        /*if (falseOrFalse) {
            cbFalseOrFalseYes.setChecked(true);
        } else if (!falseOrFalse) {
            cbFalseOrFalseNo.setChecked(true);
        }*/

        cbFalseOrFalseYes.setChecked(falseOrFalse ? true : false);
        cbFalseOrFalseNo.setChecked(!falseOrFalse ? true : false);

        // True ^ True
        boolean trueCaretTrue = (true ^ true);

        /*if (trueCaretTrue){
            cbTrueCaretTrueYes.setChecked(true);
        }else if (!trueCaretTrue) {
            cbTrueCaretTrueNo.setChecked(true);
        }*/

        cbTrueCaretTrueYes.setChecked((trueCaretTrue ? true : false));
        cbTrueCaretTrueNo.setChecked((!trueCaretTrue ? true : false));

        // True ^ False
        boolean trueCatretFalse = (true ^ false);

        /*if (trueCatretFalse){
            cbTrueCaretFalseYes.setChecked(true);
        }else if (!trueCatretFalse){
            cbTrueCaretFalseNo.setChecked(true);

        }*/

        cbTrueCaretFalseYes.setChecked((trueCatretFalse ? true : false));
        cbTrueCaretFalseNo.setChecked((!trueCatretFalse ? true : false));

        // False ^ True
        boolean falseCaretTrue = (false ^ true);

        /*if (falseCaretTrue) {
            cbFalseCaretTrueYes.setChecked(true);
        } else if (!falseCaretTrue) {
            cbFalseCaretTrueNo.setChecked(true);
        }*/

        cbFalseCaretTrueYes.setChecked((falseCaretTrue ? true : false));
        cbFalseCaretTrueNo.setChecked((!falseCaretTrue ? true : false));

        // False ^ False
        boolean falseCaretFalse = (false ^ false);

        /*if (falseCaretFalse) {
            cbFalseCaretFalseYes.setChecked(true);
        } else if (!falseCaretFalse) {
            cbFalseCaretFalseNo.setChecked(true);
        }*/

        cbFalseCaretFalseYes.setChecked(falseCaretFalse ? true : false);
        cbFalseCaretFalseNo.setChecked(!falseCaretFalse ? true : false);

    }
}
