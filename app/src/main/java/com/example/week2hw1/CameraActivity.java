package com.example.week2hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

public class CameraActivity extends AppCompatActivity {
    private static final int pic_id = 123;
    ImageView ivPic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        ivPic = findViewById(R.id.iv_pic);

    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_capture_image:
                Intent camera_intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(camera_intent, pic_id);
                break;
        }
    }
    protected void onActivityResult(int requestCode,
                                    int resultCode,
                                    Intent data)
    {
        // Match the request 'pic id with requestCode
        if (requestCode == pic_id) {

            // BitMap is data structure of image file
            // which stor the image in memory
            Bitmap photo = (Bitmap)data.getExtras()
                    .get("data");

            // Set the image in imageview for display
            ivPic.setImageBitmap(photo);
        }
    }
}
