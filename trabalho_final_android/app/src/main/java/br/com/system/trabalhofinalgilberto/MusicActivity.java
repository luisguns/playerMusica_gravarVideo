package br.com.system.trabalhofinalgilberto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MusicActivity extends AppCompatActivity {

    private ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        setTitle("Reproduzir musica");

        songList = (ListView) findViewById(R.id.songList);
        arrayList = new ArrayList<>();
        arrayList.add(new Music("Boate azul", "Ricardo Costa", R.raw.boate_azul));
        arrayList.add(new Music("São João Na Roça", "Mastruz com Leite", R.raw.sao_joao_na_roca));
        arrayList.add(new Music("Malandrinha", "Edson Gomes", R.raw.malandrinha));

        adapter = new CustomMusicAdapter(this, R.layout.custom_music_item, arrayList);
        songList.setAdapter(adapter);
    }
}
