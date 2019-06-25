package com.example.week2hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;

import java.util.ArrayList;

public class PersonListActivity extends AppCompatActivity {
    TextView tvPeople;
    ArrayList<Person> peopleList = new ArrayList(){};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_list);

        tvPeople = findViewById(R.id.tv_people_list);

        Intent passedIntent = getIntent();
        Bundle passedBundle = passedIntent.getExtras();

        if(passedBundle != null) {
             peopleList = passedBundle.getParcelableArrayList("peeps");
            //System.out.println("I AM REALL");
            if(peopleList != null) {
                for (int i = 0; i < peopleList.size(); i++) {
                    //System.out.println(peopleList.get(i).toString());

                    tvPeople.append(peopleList.get(i).toString() + '\n');
                }
            }
        }
    }
}
