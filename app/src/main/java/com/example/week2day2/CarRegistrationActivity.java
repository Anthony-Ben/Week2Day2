package com.example.week2day2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CarRegistrationActivity extends AppCompatActivity {
    public static final int SENDING_THIS_SHIT_BACK = 123;
    Intent intent;
    EditText etMake;
    EditText etModel;
    EditText etYear;
    EditText etColor;
    EditText etEngine;
    EditText etTransmission;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_entry);

        etMake= findViewById(R.id.et_make);
        etModel = findViewById(R.id.et_model);
        etYear = findViewById(R.id.et_year);
        etColor = findViewById(R.id.et_color);
        etEngine = findViewById(R.id.et_engine_size);
        etTransmission = findViewById(R.id.et_transmission);
        intent = getIntent();
    }


    public void onClick(View view) {

        final String make = etMake.getText().toString();
        final String model = etModel.getText().toString();
        final String year = etYear.getText().toString();
        final String color = etColor.getText().toString();
        final String engine = etEngine.getText().toString();
        final String transmission = etTransmission.getText().toString();

        final Car CartoPass = new Car(year, make, model, color, engine,transmission);

        //intent = getIntent();

        Bundle bundle = new Bundle();
        bundle.putParcelable("car", CartoPass);
        intent.putExtras(bundle);

        setResult(SENDING_THIS_SHIT_BACK,intent);
        finish();

    }
}
