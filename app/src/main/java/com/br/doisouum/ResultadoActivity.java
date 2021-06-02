package com.br.doisouum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imgResultado;
    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imgResultado = findViewById(R.id.img_resultado);
        btnVoltar = findViewById(R.id.btn_voltar);

        Bundle dados = getIntent().getExtras();

        int numeroresgatado = dados.getInt("numero");

        if(numeroresgatado == 0){
            imgResultado.setImageResource(R.drawable.img_um);
        }else{
            imgResultado.setImageResource(R.drawable.img_dois);
        }

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }
}