package com.example.backdrop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

//        toolbar.setNavigationOnClickListener(new NavigationIconClickListener(getContext(), view.findViewById(R.id.product_grid)));
        toolbar.setNavigationOnClickListener(new NavigationIconClickListener(
                MainActivity.this,
                findViewById(R.id.product_grid),
                new AccelerateDecelerateInterpolator(),
                MainActivity.this.getResources().getDrawable(R.drawable.nav), // Menu open icon
                MainActivity.this.getResources().getDrawable(R.drawable.close))); // Menu close icon

//        toolbar.setNavigationOnClickListener(new NavigationIconClickListener(MainActivity.this, findViewById(R.id.product_grid)));
        // Set up the tool bar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            findViewById(R.id.product_grid).setBackgroundResource(R.drawable.bk_product_grid_background_shape);
        }
        MaterialButton s= findViewById(R.id.test);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "test", Toast.LENGTH_SHORT).show();
            }
        });

}}