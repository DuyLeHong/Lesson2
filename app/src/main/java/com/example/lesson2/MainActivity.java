package com.example.lesson2;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.theartofdev.edmodo.cropper.CropImage;
import com.theartofdev.edmodo.cropper.CropImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        UCrop.of(sourceUri, destinationUri)
//                .withAspectRatio(16, 9)
//                .withMaxResultSize(maxWidth, maxHeight)
//                .start(context);

        CropImage.activity()
                .setGuidelines(CropImageView.Guidelines.ON)
                .start(this);

        String sText = getString(R.string.tv_content);

    }
}