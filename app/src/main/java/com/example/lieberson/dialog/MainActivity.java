package com.example.lieberson.dialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        private Button botao;
        private AlertDialog.Builder dialog;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = findViewById(R.id.botaoId);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //criando a dialog
                dialog = new AlertDialog.Builder(MainActivity.this);

                //criando o título da dialog
                dialog.setTitle("Título da Dialog");

                //configurando a msg
                dialog.setMessage("Mensagem de Dialog");

                //configurando se a dialog pode ser cancelada ao clicar na tela, ou nao
                dialog.setCancelable(false);

                //configurando o icone da dialog
                dialog.setIcon(android.R.drawable.ic_delete);


                //configurando o botao negativo. Ele recebe dois parametros, primeiro a msg dentro do botao e depois a acao
                dialog.setNegativeButton("Não",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                Toast.makeText(MainActivity.this, "Pressionado o botão não", Toast.LENGTH_LONG).show();
                            }
                        }
                );
                //configurando botao positivo. Ele recebe dois parametros, primeiro a msg dentro do botao e depois a acao
                dialog.setPositiveButton("Sim",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                Toast.makeText(MainActivity.this, "Pressionado o botão Sim", Toast.LENGTH_LONG).show();
                            }
                        });

                //criando a Dialog
                dialog.create();
                //executando a Dialog
                dialog.show();


            }
        });


    }
}
