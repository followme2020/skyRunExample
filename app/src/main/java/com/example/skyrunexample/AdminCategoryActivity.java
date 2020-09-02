package com.example.skyrunexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity
{

    private ImageView citycocos, eScooters, monoWheels, bycycles;
    private ImageView gyros, ninebots, toyATVs, accessories;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        citycocos = (ImageView) findViewById(R.id.citycoco);
        eScooters = (ImageView) findViewById(R.id.electro_scooter);
        monoWheels = (ImageView) findViewById(R.id.monowheel);
        bycycles = (ImageView) findViewById(R.id.bycycle);

        gyros = (ImageView) findViewById(R.id.gyro_hover);
        ninebots = (ImageView) findViewById(R.id.nine_bot);
        toyATVs = (ImageView) findViewById(R.id.electro_atv);
        accessories = (ImageView) findViewById(R.id.accessories);

        citycocos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Citycocos");
                startActivity(intent);
            }
        });

        eScooters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Electrical Scooters");
                startActivity(intent);
            }
        });

        monoWheels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Mono Wheels");
                startActivity(intent);
            }
        });
        bycycles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Bycicles");
                startActivity(intent);
            }
        });
        gyros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Gyro Hover");
                startActivity(intent);
            }
        });
        ninebots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Segways");
                startActivity(intent);
            }
        });
        toyATVs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "For Kids");
                startActivity(intent);
            }
        });
        accessories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Accessories");
                startActivity(intent);
            }
        });
    }
}