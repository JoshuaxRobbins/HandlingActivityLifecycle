package com.example.josh.handlingactivitylifecycle.view;

import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.josh.handlingactivitylifecycle.Constants;
import com.example.josh.handlingactivitylifecycle.Model.Person;
import com.example.josh.handlingactivitylifecycle.Model.PersonParcel;
import com.example.josh.handlingactivitylifecycle.R;

public class SecondActivity extends AppCompatActivity {

    public static final String TAG = SecondActivity.class.getSimpleName() + "_TAG";
    private TextView tvSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG, "onCreate: ");

        tvSecond = findViewById(R.id.tvSecond);
        String tvSecondText = getIntent().getStringExtra(Constants.KEYS.ET_MAIN);
        tvSecond.setText(tvSecondText);

        Person person;

        String personType = getIntent().getStringExtra(Constants.KEYS.PERSON_TYPE);

        switch (personType){

            case "parcelable":
                PersonParcel personParcel = getIntent().getParcelableExtra(Constants.KEYS.Person);
                tvSecond.setText(personParcel.toString());
                break;

            case "serializable":
                person = (Person) getIntent().getSerializableExtra(Constants.KEYS.Person);
                tvSecond.setText(person.toString());
                break;

        }
    }

    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }
}
