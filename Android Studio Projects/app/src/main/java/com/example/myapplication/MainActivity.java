package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonKm = findViewById(R.id.buttonKm);
        buttonKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textKm = findViewById(R.id.editTextKm);
                EditText textM= findViewById(R.id.editTextM);
                Double km= Double.valueOf(textKm.getText().toString());
                Double m= km*5/18;
                DecimalFormat deci = new DecimalFormat("##.##");
                textM.setText(deci.format(m));
                Context context = getApplicationContext();
                CharSequence text = "Converted!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        Button buttonM = findViewById(R.id.buttonM);
        buttonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textKm = findViewById(R.id.editTextKm);
                EditText textM= findViewById(R.id.editTextM);
                Double m= Double.valueOf(textM.getText().toString());
                Double Km= m*18/5;
                DecimalFormat deci = new DecimalFormat("##.##");
                textKm.setText(deci.format(Km));
                Context context = getApplicationContext();
                CharSequence text = "Converted!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }
}
