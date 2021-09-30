package com.coralcorp.hangedman;

import android.app.AlertDialog;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText letter;
    Button[] category;
    ImageView hangedMan;
    TextView hint, adivinar, selectCategory, categoryShow;

    char caracter;
    boolean adivino;
    String catSelected;
    String[] generadas;
    int cuantas, mistakes;

    char[] letras;
    boolean[] adivinada;

    StringBuilder builder;
    Handler handlerUI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handlerUI = new Handler();
        init();
    }

    public void init() {
        callComponents();
        String adivinarTxt = "Palabra a adivinar";
        adivinar.setText(adivinarTxt);
        showCategories();
        chooseCategory();
    }

    public void callComponents() {
        category = new Button[10];
        category[0] = findViewById(R.id.cat1);
        category[1] = findViewById(R.id.cat2);
        category[2] = findViewById(R.id.cat3);
        category[3] = findViewById(R.id.cat4);
        category[4] = findViewById(R.id.cat5);
        category[5] = findViewById(R.id.cat6);
        category[6] = findViewById(R.id.cat7);
        category[7] = findViewById(R.id.cat8);
        category[8] = findViewById(R.id.cat9);
        category[9] = findViewById(R.id.cat10);

        hint = findViewById(R.id.hint);
        letter = findViewById(R.id.letter);
        adivinar = findViewById(R.id.adivinar);
        hangedMan = findViewById(R.id.hangedMan);
        categoryShow = findViewById(R.id.category);
        selectCategory = findViewById(R.id.selectCategory);
    }

    public void showCategories() {
        letter.setClickable(false);
        letter.setVisibility(View.INVISIBLE);
        selectCategory.setVisibility(View.VISIBLE);
        hangedMan.setImageResource(R.drawable.hangedman_0);

        for (Button u : category) {
            u.setVisibility(View.VISIBLE);
            u.setClickable(true);
        }
    }

    public void chooseCategory() {
        for (Button i : category) {
            i.setOnClickListener(v -> {
                catSelected = i.getText().toString();
                for (Button a : category) {
                    a.setVisibility(View.INVISIBLE);
                    a.setClickable(false);
                }
                selectCategory.setVisibility(View.INVISIBLE);
                letter.setVisibility(View.VISIBLE);
                letter.setClickable(true);
                game();
            });
        }
    }


    public void game() {
        builder = new StringBuilder();
        categoryShow.setText(catSelected);
        generadas = Palabras.Categorias(catSelected);
        mistakes = 0;
        adivino = false;
        cuantas = generadas[0].length();
        letras = new char[cuantas];
        adivinada = new boolean[cuantas];
        hint.setText(generadas[1]);
        for (int i = 0; i < cuantas; ++i) {
            letras[i] = generadas[0].charAt(i);
            adivinada[i] = false;
        }
        for (int i = 0; i < cuantas; i++) {
            builder.append(" _");
        }
        adivinar.setText(builder.toString());
        letter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                caracter = s.charAt(s.length() - 1);
                if (caracter == '.') caracter = ' ';
                checkLetter();
                monito();
            }
        });
    }

    public void monito() {
        int monito = R.drawable.hangedman_0;
        switch (mistakes) {
            case 1:
                monito = R.drawable.hangedman_1;
                break;
            case 2:
                monito = R.drawable.hangedman_2;
                break;
            case 3:
                monito = R.drawable.hangedman_3;
                break;
            case 4:
                monito = R.drawable.hangedman_4;
                break;
            case 5:
                monito = R.drawable.hangedman_5;
                break;
            case 6:
                monito = R.drawable.hangedman_6;
                break;
            case 7:
                monito = R.drawable.hangedman_final;
                break;
        }
        hangedMan.setImageResource(monito);
    }

    public void checkLetter() {
        int siEsPalabra = 0;

        monito();
        builder.setLength(0);
        int noEsLaPalabra = 0;
        for (int i = 0; i < cuantas; i++) {
            if (caracter == letras[i]) {
                if (!adivinada[i]) {
                    adivinada[i] = true;
                    ++siEsPalabra;
                } else {
                    String text = "Ya la hab\u00edas introducido -_-";
                    hint.setText(text);
                    handlerUI.postDelayed(() -> hint.setText(generadas[1]), 4000);
                }
            } else {
                ++noEsLaPalabra;
            }
        }
        if (noEsLaPalabra == cuantas) {
            mistakes++;
        } else {
            if (siEsPalabra == cuantas) {
                adivino = true;
            }
        }
        if (adivino || mistakes == 6) {
            adivinar.setText(generadas[0]);
            handlerUI.postDelayed(() -> endGame(adivino), 2000);
        }
        for (int i = 0; i < cuantas; i++) {
            if (!adivinada[i]) {
                builder.append(" _");
            } else {
                builder.append(letras[i]);
            }
        }
        adivinar.setText(builder.toString());

    }


    public void endGame(boolean status) {
        String statusString;
        if (status) statusString = "\u00A1Ganaste!";
        else statusString = "Perdiste :(";
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setMessage("\u00BFQuieres jugar otra vez?");
        dialog.setTitle(statusString);
        dialog.setPositiveButton("Nuevo juego.", (dialog1, which) -> init());
        dialog.setNegativeButton("Salir", (dialog12, which) -> {
                    moveTaskToBack(true);
                    android.os.Process.killProcess(android.os.Process.myPid());
                    System.exit(1);
                }
        );
        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
    }
}