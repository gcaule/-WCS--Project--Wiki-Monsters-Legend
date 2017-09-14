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
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

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
        tweets.add(new Tweet(R.drawable.bte_dark, "Tyrannoking", "Dark Element"));
        tweets.add(new Tweet(R.drawable.bte_earth, "Rockilla", "Earth Element"));
        tweets.add(new Tweet(R.drawable.bte_fire, "Fire Lion", "Fire Element"));
        tweets.add(new Tweet(R.drawable.bte_legend, "Arch Knight", "Legend Element"));
        tweets.add(new Tweet(R.drawable.bte_light, "Light Spirit", "Light Element"));
        tweets.add(new Tweet(R.drawable.bte_magic, "Genie", "Magic Element"));
        tweets.add(new Tweet(R.drawable.bte_metal, "Metalsaur", "Metal Element"));
        tweets.add(new Tweet(R.drawable.bte_nature, "Panda", "Nature Element"));
        tweets.add(new Tweet(R.drawable.bte_thunder, "Thunder Eagle", "Thunder Element"));
        tweets.add(new Tweet(R.drawable.bte_water, "Thunder", "Water Element"));
        return tweets;
    }

    private void afficherListeTweets(){
        List<Tweet> tweets = genererTweets();

        TweetAdapter adapter = new TweetAdapter(MainActivity.this, tweets);
        mListView.setAdapter(adapter);
    }
}