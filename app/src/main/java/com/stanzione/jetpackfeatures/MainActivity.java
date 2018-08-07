package com.stanzione.jetpackfeatures;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView firstNameTextView;
    private TextView lastNameTextView;
    private TextView ageTextView;
    private Button increaseAgeButton;

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createUser();
        setupUi();

    }

    private void createUser(){
        user = ViewModelProviders.of(this).get(User.class);
    }

    private void setupUi(){
        firstNameTextView = findViewById(R.id.firstNameTextView);
        lastNameTextView = findViewById(R.id.lastNameTextView);
        ageTextView = findViewById(R.id.ageTextView);
        increaseAgeButton = findViewById(R.id.increaseAgeButton);

        firstNameTextView.setText(user.getFirstName());
        lastNameTextView.setText(user.getLastName());
        ageTextView.setText(String.valueOf(user.getAge()));

        increaseAgeButton.setOnClickListener((view -> increaseAge()));

    }

    private void increaseAge(){
        user.setAge(user.getAge()+1);
        ageTextView.setText(String.valueOf(user.getAge()));
    }

}
