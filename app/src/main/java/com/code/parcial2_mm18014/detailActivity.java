package com.code.parcial2_mm18014;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.code.parcial2_mm18014.models.Libro;

public class detailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        Libro libro = new Libro(b.getString("titulo"),b.getString("autor"),b.getString("editorial"), b.getInt("imgPortada"));

        TextView titulo = (TextView)findViewById(R.id.txtTituloDetail);
        TextView autor = (TextView)findViewById(R.id.txtAutorDetail);
        ImageView img = (ImageView)findViewById(R.id.imageViewDetail);
        TextView editorial = (TextView)findViewById(R.id.txtEditorialDetail);

        titulo.setText( libro.TituloLibro);
        autor.setText( libro.autor);
        editorial.setText( libro.editorial);
        img.setImageResource(libro.portadaImg);
    }
}