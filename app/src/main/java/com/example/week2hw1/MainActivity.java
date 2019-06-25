package com.example.week2hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick(View view) {
        switch (view.getId()){

            case R.id.btn_to_camera_activity:
                Intent cameraIntent = new Intent(MainActivity.this, CameraActivity.class);
                startActivity(cameraIntent);
            break;

            case R.id.btn_to_list_persons_activity:
                Intent listPersonintent = new Intent(MainActivity.this, PersonListActivity.class);
                startActivity(listPersonintent);
                break;

            case R.id.btn_to_new_person_activity:
                Intent newPersonIntent = new Intent(MainActivity.this, PersonFormActivity.class);
                startActivity(newPersonIntent);
                break;

            case R.id.btn_to_widget_activity:
                Intent mediaIntent = new Intent(MainActivity.this, SoundclipActivity.class);
                startActivity(mediaIntent);
                break;

        }
    }
}
