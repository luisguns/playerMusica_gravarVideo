package br.com.system.trabalhofinalgilberto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Trabalho final gilberto");
        findViewById(R.id.home_grid_music).setOnClickListener(this);
        findViewById(R.id.home_grid_movies).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()){

            case R.id.home_grid_movies:
                intent = new Intent(this,VideoActivity.class);
                break;
            case R.id.home_grid_music:
                intent = new Intent(this,MusicActivity.class);
                break;
        }
        if (intent == null){
            Toast.makeText(this, "Deu ruim", Toast.LENGTH_SHORT).show();
        }else {
            startActivity(intent);
        }
    }
}
