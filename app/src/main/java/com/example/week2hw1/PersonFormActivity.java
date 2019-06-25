package com.example.week2hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class PersonFormActivity extends AppCompatActivity {
EditText etFirstName, etLastName, etAddress, etState, etZip, etAge;
    private ArrayList<Person> personList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_form);

        etFirstName = findViewById(R.id.et_first_name);
        etLastName = findViewById(R.id.et_last_name);
        etAddress = findViewById(R.id.et_address);
        etState = findViewById(R.id.et_state);
        etZip = findViewById(R.id.et_zip);
        etAge = findViewById(R.id.et_age);

        Intent intentPassed = getIntent();
        Bundle bundlePassed = intentPassed.getExtras();

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_submit:
                String firstName = etFirstName.getText().toString();
                String lastName = etLastName.getText().toString();
                String state = etState.getText().toString();
                String address = etAddress.getText().toString();
                String zip = etZip.getText().toString();
                String age = etAge.getText().toString();

                Person person = new Person(firstName, lastName, age, state, address, zip);

                personList.add(person);

                break;

            case R.id.btn_view_list:
            Intent passPerson = new Intent(this, PersonListActivity.class);

            Bundle peopleBundle = new Bundle();
            peopleBundle.putParcelableArrayList("peeps", personList);
            passPerson.putExtras(peopleBundle);
            startActivity(passPerson);
            break;
        }
    }

    /*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:

                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }*/
}
