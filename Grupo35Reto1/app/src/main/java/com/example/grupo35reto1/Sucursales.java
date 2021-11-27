package com.example.grupo35reto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Sucursales extends AppCompatActivity {
    TextView textS1;
    TextView textS2;
    TextView textS3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucursales);

        Resources res = getResources();
        Drawable drawable =res.getDrawable(R.drawable.tienda1, getTheme());
        Drawable drawable1 =res.getDrawable(R.drawable.tienda2, getTheme());
        Drawable drawable2 =res.getDrawable(R.drawable.tienda3, getTheme());

        ImageView imagen1 = (ImageView) findViewById(R.id.imageTienda1);
        imagen1.setImageDrawable(drawable);

        ImageView imagen2 = (ImageView) findViewById(R.id.imageTienda2);
        imagen2.setImageDrawable(drawable1);

        ImageView imagen3 = (ImageView) findViewById(R.id.imageTienda3);
        imagen3.setImageDrawable(drawable2);


        textS1 = (TextView) findViewById(R.id.textTienda1);
        textS2 = (TextView) findViewById(R.id.textTienda2);
        textS3 = (TextView) findViewById(R.id.textTienda3);


    }
}