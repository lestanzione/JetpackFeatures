package com.stanzione.jetpackfeatures;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
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

        user.getFirstName().observe(this, firstNameTextView::setText);

        user.getLastName().observe(this, lastNameTextView::setText);

        user.getAge().observe(this, integer -> ageTextView.setText(String.valueOf(integer)));

        increaseAgeButton.setOnClickListener((view -> increaseAge()));

    }

    private void increaseAge(){
        user.setAge(user.getAge().getValue()+1);
    }

}
