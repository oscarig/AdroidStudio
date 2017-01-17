package com.example.oscar_pc.prjnotificaciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnBoton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBoton1 = (Button) findViewById(R.id.btnBoton1);

        btnBoton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //para mostrar mensajes usamos el objeto toast
                Toast mensaje1 = Toast.makeText(getApplicationContext(), "He pulsado el boton 1", Toast.LENGTH_SHORT);
                mensaje1.show();
            }
        });

    }

    public void ejecutar(View view){
        Toast mensaje1 = Toast.makeText(getApplicationContext(), "He pulsado el boton 2", Toast.LENGTH_SHORT);
        mensaje1.show();

    }
}
