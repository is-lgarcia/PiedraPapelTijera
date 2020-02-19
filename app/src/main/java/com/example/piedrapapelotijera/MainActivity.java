package com.example.piedrapapelotijera;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imagenPlayerPiedra;
    ImageView imagenPlayerPapel;
    ImageView imagenPlayerTijera;
    ImageView imagenPhonePiedra;
    ImageView imagenPhonePapel;
    ImageView imagenPhoneTijera;
    TextView txtPuntajePlayer;
    TextView txtPuntajePhone;
    TextView tituloGanador;

    private int random;
    private int puntajePlayer;
    private int puntajePhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        imagenPlayerPiedra = findViewById(R.id.imagen_piedra_p);
        imagenPlayerPapel = findViewById(R.id.imagen_papel_p);
        imagenPlayerTijera = findViewById(R.id.imagen_tijera_p);
        imagenPhonePiedra = findViewById(R.id.imagen_piedra_phone);
        imagenPhonePapel = findViewById(R.id.imagen_papel_phone);
        imagenPhoneTijera = findViewById(R.id.imagen_tijera_p_phone);
        txtPuntajePlayer = findViewById(R.id.txt_puntaje_player);
        txtPuntajePhone = findViewById(R.id.txt_puntaje_phone);
        tituloGanador = findViewById(R.id.txt_ganador);
    }

    public void Aleatorio(){
        Random random1 = new Random();
        random = (int) (random1.nextDouble()*3+1);
    }

    public void onClickPiedra (View view){
        Aleatorio();
        if (random == 1){
            imagenPlayerPiedra.setVisibility(View.VISIBLE);
            imagenPlayerPapel.setVisibility(View.INVISIBLE);
            imagenPlayerTijera.setVisibility(View.INVISIBLE);
            imagenPhonePiedra.setVisibility(View.VISIBLE);
            imagenPhonePapel.setVisibility(View.INVISIBLE);
            imagenPhoneTijera.setVisibility(View.INVISIBLE);
            tituloGanador.setText("Empate");
        } else if (random == 2){
            imagenPlayerPiedra.setVisibility(View.VISIBLE);
            imagenPlayerPapel.setVisibility(View.INVISIBLE);
            imagenPlayerTijera.setVisibility(View.INVISIBLE);
            imagenPhonePiedra.setVisibility(View.INVISIBLE);
            imagenPhonePapel.setVisibility(View.VISIBLE);
            imagenPhoneTijera.setVisibility(View.INVISIBLE);
            tituloGanador.setText("Ganador Phone");
            puntajePhone += 1;
            txtPuntajePhone.setText("Phone: "+puntajePhone);
        } else if (random == 3){
            imagenPlayerPiedra.setVisibility(View.VISIBLE);
            imagenPlayerPapel.setVisibility(View.INVISIBLE);
            imagenPlayerTijera.setVisibility(View.INVISIBLE);
            imagenPhonePiedra.setVisibility(View.INVISIBLE);
            imagenPhonePapel.setVisibility(View.INVISIBLE);
            imagenPhoneTijera.setVisibility(View.VISIBLE);
            tituloGanador.setText("Ganador Player");
            puntajePlayer += 1;
            txtPuntajePlayer.setText("Player: "+puntajePlayer);
        } else {
            Toast.makeText(this, "Algo anda mal con el Aleatorio", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickPapel (View view){
        Aleatorio();
        if (random == 1){
            imagenPlayerPiedra.setVisibility(View.INVISIBLE);
            imagenPlayerPapel.setVisibility(View.VISIBLE);
            imagenPlayerTijera.setVisibility(View.INVISIBLE);
            imagenPhonePiedra.setVisibility(View.VISIBLE);
            imagenPhonePapel.setVisibility(View.INVISIBLE);
            imagenPhoneTijera.setVisibility(View.INVISIBLE);
            tituloGanador.setText("Ganador Player");
            puntajePlayer += 1;
            txtPuntajePlayer.setText("Player: "+puntajePlayer);
        } else if (random == 2){
            imagenPlayerPiedra.setVisibility(View.INVISIBLE);
            imagenPlayerPapel.setVisibility(View.VISIBLE);
            imagenPlayerTijera.setVisibility(View.INVISIBLE);
            imagenPhonePiedra.setVisibility(View.INVISIBLE);
            imagenPhonePapel.setVisibility(View.VISIBLE);
            imagenPhoneTijera.setVisibility(View.INVISIBLE);
            tituloGanador.setText("Empate");
        } else if (random == 3){
            imagenPlayerPiedra.setVisibility(View.INVISIBLE);
            imagenPlayerPapel.setVisibility(View.VISIBLE);
            imagenPlayerTijera.setVisibility(View.INVISIBLE);
            imagenPhonePiedra.setVisibility(View.INVISIBLE);
            imagenPhonePapel.setVisibility(View.INVISIBLE);
            imagenPhoneTijera.setVisibility(View.VISIBLE);
            tituloGanador.setText("Ganador Phone");
            puntajePhone += 1;
            txtPuntajePhone.setText("Phone: "+puntajePhone);
        } else {
            Toast.makeText(this, "Algo anda mal con el Aleatorio", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickTijera (View view){
        Aleatorio();
        if (random == 1){
            imagenPlayerPiedra.setVisibility(View.INVISIBLE);
            imagenPlayerPapel.setVisibility(View.INVISIBLE);
            imagenPlayerTijera.setVisibility(View.VISIBLE);
            imagenPhonePiedra.setVisibility(View.VISIBLE);
            imagenPhonePapel.setVisibility(View.INVISIBLE);
            imagenPhoneTijera.setVisibility(View.INVISIBLE);
            tituloGanador.setText("Ganador Phone");
            puntajePhone += 1;
            txtPuntajePhone.setText("Phone: "+puntajePhone);
        } else if (random == 2){
            imagenPlayerPiedra.setVisibility(View.INVISIBLE);
            imagenPlayerPapel.setVisibility(View.INVISIBLE);
            imagenPlayerTijera.setVisibility(View.VISIBLE);
            imagenPhonePiedra.setVisibility(View.INVISIBLE);
            imagenPhonePapel.setVisibility(View.VISIBLE);
            imagenPhoneTijera.setVisibility(View.INVISIBLE);
            tituloGanador.setText("Ganador Player");
            puntajePlayer += 1;
            txtPuntajePlayer.setText("Player: "+puntajePlayer);
        } else if (random == 3){
            imagenPlayerPiedra.setVisibility(View.INVISIBLE);
            imagenPlayerPapel.setVisibility(View.INVISIBLE);
            imagenPlayerTijera.setVisibility(View.VISIBLE);
            imagenPhonePiedra.setVisibility(View.INVISIBLE);
            imagenPhonePapel.setVisibility(View.INVISIBLE);
            imagenPhoneTijera.setVisibility(View.VISIBLE);
            tituloGanador.setText("Empate");
        } else {
            Toast.makeText(this, "Algo anda mal con el Aleatorio", Toast.LENGTH_SHORT).show();
        }
    }
}
