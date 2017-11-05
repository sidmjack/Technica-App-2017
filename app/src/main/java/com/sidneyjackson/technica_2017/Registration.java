package com.sidneyjackson.technica_2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registration extends AppCompatActivity {
    private Profile profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Button registerBtn = (Button) findViewById(R.id.email_sign_in_button);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save();
            }
        });

        profile = new Profile();
    }

    protected void save() {
        EditText firstName = (EditText) findViewById(R.id.fName_ID);
        EditText lastName = (EditText) findViewById(R.id.lName_ID);
        EditText middleInitial = (EditText) findViewById(R.id.mName_ID);

        profile.firstName = firstName.toString();
        profile.lastName = lastName.toString();
        profile.middleInitial = middleInitial.toString();

        Intent intent = new Intent(Registration.this, MainActivity.class);
        startActivity(intent);
        finish();

    }
}
