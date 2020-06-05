package com.example.wallpaperreset;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WallpaperManager kabekami = WallpaperManager.getInstance(getApplicationContext());
        try {
            kabekami.setResource(R.drawable.kuro);
            Toast.makeText(this, "Wallpaper has been reset", Toast.LENGTH_SHORT).show();
        } catch (IOException e)
        {
            Toast.makeText(this,"failed",Toast.LENGTH_SHORT).show();

        }
    }
}