package com.example.apprenti.wikimonsterlegends;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {

    private ListView mListView;
    private String[] listeMonstres = new String[]{
            "Tyrannoking", "Rockilla", "Fire Lion", "Arch Knight", "Light Spirit", "Genie",
            "Metalsaur", "Panda", "Thunder Eagle", "Turtle"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button retourAccueil = (Button) findViewById(R.id.button);
        retourAccueil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SelectMonsterDetails.class);
                startActivity(intent);
            }
        });

        mListView = (ListView) findViewById(R.id.liste_deroulante);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, listeMonstres);
        mListView.setAdapter(adapter);
    }
}
