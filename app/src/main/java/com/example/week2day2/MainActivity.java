package com.example.week2day2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final int REQUESTIN_THIS_SHIT = 321;
    TextView tvMake;
    TextView tvModel;
    TextView tvYear;
    TextView tvColor;
    TextView tvEngine;
    TextView tvTransmission;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMake= findViewById(R.id.tv_make);
        tvModel = findViewById(R.id.tv_model);
        tvYear = findViewById(R.id.tv_year);
        tvColor = findViewById(R.id.tv_color);
        tvEngine = findViewById(R.id.tv_engine);
        tvTransmission = findViewById(R.id.tv_transmission);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(data != null){
            Bundle bundlepassed = data.getExtras();

            Car passedCar = bundlepassed.getParcelable("car");

            displayViews();
            tvModel.setText("Model: " + passedCar.getModel());
            tvYear.setText("Year: " + passedCar.getMake());
            tvMake.setText("Make: " + passedCar.getYear());
            tvTransmission.setText("Transmission: " + passedCar.getTransmissionSize());
            tvColor.setText("Color: " + passedCar.getColor());
            tvEngine.setText("Engine: " + passedCar.getEngineSize());
        }
    }

    public void onClick(View view) {
        Intent passPerson = new Intent(this, CarRegistrationActivity.class);

        startActivityForResult(passPerson,REQUESTIN_THIS_SHIT);
    }

    private void displayViews(){
        tvMake.setVisibility(View.VISIBLE);
        tvYear.setVisibility(View.VISIBLE);
        tvModel.setVisibility(View.VISIBLE);
        tvEngine.setVisibility(View.VISIBLE);
        tvColor.setVisibility(View.VISIBLE);
        tvTransmission.setVisibility(View.VISIBLE);
    }
}
