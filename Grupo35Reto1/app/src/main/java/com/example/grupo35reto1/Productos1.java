package com.example.grupo35reto1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Productos1 extends AppCompatActivity {
    TextView textP1;
    TextView textP2;
    TextView textP3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos1);
        Resources res = getResources();
        Drawable drawable =res.getDrawable(R.drawable.cha1, getTheme());
        Drawable drawable1 =res.getDrawable(R.drawable.cha2, getTheme());
        Drawable drawable2 =res.getDrawable(R.drawable.cha3, getTheme());

        ImageView imagen1 = (ImageView) findViewById(R.id.imageS1);
        imagen1.setImageDrawable(drawable);

        ImageView imagen2 = (ImageView) findViewById(R.id.imageS2);
        imagen2.setImageDrawable(drawable1);

        ImageView imagen3 = (ImageView) findViewById(R.id.imageS3);
        imagen3.setImageDrawable(drawable2);


        textP1 = (TextView) findViewById(R.id.textServicios1);
        textP2 = (TextView) findViewById(R.id.textServicios2);
        textP3 = (TextView) findViewById(R.id.textServicios3);

    }
}