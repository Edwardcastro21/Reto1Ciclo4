package com.example.grupo35reto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button boton1;
    TextView texto1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*boton1 = (Button) findViewById(R.id.boton1);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto1.setText("Empezando a programar");
                Toast.makeText(getApplicationContext(), "oprimio el boton 1", Toast.LENGTH_LONG).show();

            }
        });
        texto1 = (TextView) findViewById(R.id.texto1);*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.opcion1) {
            Toast.makeText(getApplicationContext(), "Seleccionó la primera opción", Toast.LENGTH_LONG).show();
            Intent pantalla2 = new Intent(getApplicationContext(), Productos1.class);
            startActivity(pantalla2);
        }
        if (id == R.id.opcion2) {
            Toast.makeText(getApplicationContext(), "Seleccionó la segunda opción", Toast.LENGTH_LONG).show();
            Intent pantalla3 = new Intent(getApplicationContext(),Servicios.class);
            startActivity(pantalla3);
        }
        if (id == R.id.opcion3) {
            Toast.makeText(getApplicationContext(), "Seleccionó la tercera opción", Toast.LENGTH_LONG).show();
            Intent pantalla4 = new Intent(getApplicationContext(),Sucursales.class);
            startActivity(pantalla4);
        }

        return super.onOptionsItemSelected(item);

    }
}