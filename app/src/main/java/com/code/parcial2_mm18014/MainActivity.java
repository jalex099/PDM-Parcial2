package com.code.parcial2_mm18014;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.code.parcial2_mm18014.models.Libro;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public ArrayList<Libro> libros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.lv);


        libros = new ArrayList<Libro>();

        libros.add(new Libro("El corazón de la piedra", "José María García López", "Nocturna", R.drawable.img1));
        libros.add(new Libro("Salmos de vísperas","Esteban Hernández Castelló","Obra social de Caja de Avila", R.drawable.img2));
        libros.add(new Libro("La música en las catedrales españolas del Siglo de Oro", "Robert Stevenson", "Alianza Música", R.drawable.img3));
        libros.add(new Libro("Tomás Luis de Victoria: A guide to research", "Eugene Casjen Cramer", "Garland Publishing Inc.", R.drawable.img4));
        libros.add(new Libro("Studies in the Music of Tomás Luis de Victoria", "Eugene Casjen Cramer", "Ashgate", R.drawable.img5));
        CustomAdapter ad = new CustomAdapter(libros, this);

        listView.setAdapter(ad);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Selecciono: " + libros.get(position).TituloLibro, Toast.LENGTH_SHORT).show();
                Libro libro = libros.get(position);
                Intent intent = new Intent(getApplicationContext(), detailActivity.class);
                intent.putExtra("titulo",libro.TituloLibro);
                intent.putExtra("autor",libro.autor);
                intent.putExtra("editorial", libro.editorial);
                intent.putExtra("imgPortada", libro.portadaImg);
                startActivity(intent);
            }
        });
    }
}