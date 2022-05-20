package facci.christhiangarcia.practicasugar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import models.Book;

public class MainActivity extends AppCompatActivity {

    EditText editTextApellidos;
    EditText editTextNombres;
    EditText editTextFoto;

    Button buttonGuardar;
    Button buttonListado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                editTextApellidos = findViewById(R.id.EditTextApellidos);
                editTextApellidos = findViewById(R.id.EditTextNombres);
                editTextApellidos = findViewById(R.id.EditTextFoto);
                buttonGuardar = findViewById(R.id.ButtonGuardar);
                buttonListado = findViewById(R.id.ButtonListado);

                buttonGuardar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Book book = new Book(
                                editTextApellidos.getText().toString(),
                                editTextNombres.getText().toString(),
                                editTextFoto.getText().toString()
                        );
                        book.save();

                        Log.e(  "SQLite", "Datos Guardados");
                    }
                });
    }
}