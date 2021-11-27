package com.example.grupo35reto1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Servicios extends AppCompatActivity {

    TextView textSer1;
    TextView textSer2;
    TextView textSer3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios);

        Resources res = getResources();
        Drawable drawable =res.getDrawable(R.drawable.reparaciones, getTheme());
        Drawable drawable1 =res.getDrawable(R.drawable.personzaliza, getTheme());
        Drawable drawable2 =res.getDrawable(R.drawable.diseno, getTheme());

        ImageView imagen1 = (ImageView) findViewById(R.id.imageS1);
        imagen1.setImageDrawable(drawable);

        ImageView imagen2 = (ImageView) findViewById(R.id.imageS2);
        imagen2.setImageDrawable(drawable1);

        ImageView imagen3 = (ImageView) findViewById(R.id.imageS3);
        imagen3.setImageDrawable(drawable2);


        textSer1 = (TextView) findViewById(R.id.textServicios1);
        textSer2 = (TextView) findViewById(R.id.textServicios2);
        textSer3 = (TextView) findViewById(R.id.textServicios3);


    }
}