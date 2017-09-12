package com.example.apprenti.wikimonsterlegends;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static com.example.apprenti.wikimonsterlegends.R.id.liste_deroulante;

public class MainActivity extends ActionBarActivity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(liste_deroulante);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, SelectMonsterDetails.class);
                intent.putExtra("streum", i);
                startActivity(intent);
            }
        });

        afficherListeTweets();
    }

    private List<Tweet> genererTweets(){
        List<Tweet> tweets = new ArrayList<>();
        tweets.add(new Tweet(R.drawable.bte_dark, "Tyrannoking", "Elément 'Dark'"));
        tweets.add(new Tweet(R.drawable.bte_earth, "Rockilla", "Elément 'Earth'"));
        tweets.add(new Tweet(R.drawable.bte_fire, "Fire Lion", "Elément 'Fire'"));
        tweets.add(new Tweet(R.drawable.bte_legend, "Arch Knight", "Elément 'Legend'"));
        tweets.add(new Tweet(R.drawable.bte_light, "Light Spirit", "Elément 'Light'"));
        tweets.add(new Tweet(R.drawable.bte_magic, "Genie", "Elément 'Magic'"));
        tweets.add(new Tweet(R.drawable.bte_metal, "Metalsaur", "Elément 'Metal'"));
        tweets.add(new Tweet(R.drawable.bte_nature, "Panda", "Elément 'Nature'"));
        tweets.add(new Tweet(R.drawable.bte_thunder, "Thunder Eagle", "Elément 'Thunder'"));
        tweets.add(new Tweet(R.drawable.bte_water, "Thunder", "Elément 'Water'"));
        return tweets;
    }

    private void afficherListeTweets(){
        List<Tweet> tweets = genererTweets();

        TweetAdapter adapter = new TweetAdapter(MainActivity.this, tweets);
        mListView.setAdapter(adapter);
    }
}