package com.sidneyjackson.technica_2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Registration extends AppCompatActivity {
    Profile profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        profile = new Profile();
    }

    protected void save() {
        EditText firstName = (EditText) findViewById(R.id.fName_ID);
        EditText lastName = (EditText) findViewById(R.id.lName_ID);
        EditText middleInitial = (EditText) findViewById(R.id.mName_ID);

        profile.firstName = firstName.toString();
        profile.lastName = lastName.toString();
        profile.middleInitial = middleInitial.toString();

    }
}
