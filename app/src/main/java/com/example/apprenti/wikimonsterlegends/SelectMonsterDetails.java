package com.example.apprenti.wikimonsterlegends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SelectMonsterDetails extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        int streum = getIntent().getIntExtra("streum", 0);

        ImageView image_monster = (ImageView) findViewById(R.id.image_monster);
        TextView name_monster = (TextView) findViewById(R.id.name_monster);
        ImageView element_monster_img = (ImageView) findViewById(R.id.element_monster_img);
        TextView element_monster = (TextView) findViewById(R.id.element_monster);
        ImageView egg = (ImageView) findViewById(R.id.egg);
        ImageView etape1 = (ImageView) findViewById(R.id.etape1);
        ImageView etape2 = (ImageView) findViewById(R.id.etape2);
        ImageView etape3 = (ImageView) findViewById(R.id.etape3);
        TextView stat_power = (TextView) findViewById(R.id.stat_power);
        TextView stat_life = (TextView) findViewById(R.id.stat_life);
        TextView stat_speed = (TextView) findViewById(R.id.stat_speed);
        TextView stat_stamina = (TextView) findViewById(R.id.stat_stamina);

        if (streum == 0) {

            image_monster.setImageResource(R.drawable.tyrannoking_0);
            name_monster.setText("Tyrannoking");
            element_monster_img.setImageResource(R.drawable.bte_dark);
            element_monster.setText("Elément Dark");
            egg.setImageResource(R.drawable.tyrannoking_0);
            etape1.setImageResource(R.drawable.tyrannoking_1);
            etape2.setImageResource(R.drawable.tyrannoking_2);
            etape3.setImageResource(R.drawable.tyrannoking_3);
            stat_power.setText("230");
            stat_life.setText("71");
            stat_speed.setText("175");
            stat_stamina.setText("100");

        } else if (streum == 1) {

            image_monster.setImageResource(R.drawable.rockilla_0);
            name_monster.setText("Rockilla");
            element_monster_img.setImageResource(R.drawable.bte_earth);
            element_monster.setText("Elément Earth");
            egg.setImageResource(R.drawable.rockilla_0);
            etape1.setImageResource(R.drawable.rockilla_1);
            etape2.setImageResource(R.drawable.rockilla_2);
            etape3.setImageResource(R.drawable.rockilla_3);
            stat_power.setText("175");
            stat_life.setText("71");
            stat_speed.setText("175");
            stat_stamina.setText("100");

        } else if (streum == 2) {

            image_monster.setImageResource(R.drawable.fire_lion_0);
            name_monster.setText("Fire Lion");
            element_monster_img.setImageResource(R.drawable.bte_fire);
            element_monster.setText("Elément Fire");
            egg.setImageResource(R.drawable.fire_lion_0);
            etape1.setImageResource(R.drawable.fire_lion_1);
            etape2.setImageResource(R.drawable.fire_lion_2);
            etape3.setImageResource(R.drawable.fire_lion_3);
            stat_power.setText("220");
            stat_life.setText("50");
            stat_speed.setText("175");
            stat_stamina.setText("100");

        } else if (streum == 3) {

            image_monster.setImageResource(R.drawable.arch_knight_0);
            name_monster.setText("Arch Knight");
            element_monster_img.setImageResource(R.drawable.bte_legend);
            element_monster.setText("Elément Earth");
            egg.setImageResource(R.drawable.arch_knight_0);
            etape1.setImageResource(R.drawable.arch_knight_1);
            etape2.setImageResource(R.drawable.arch_knight_2);
            etape3.setImageResource(R.drawable.arch_knight_3);
            stat_power.setText("200");
            stat_life.setText("56");
            stat_speed.setText("200");
            stat_stamina.setText("140");

        } else if (streum == 4) {

            image_monster.setImageResource(R.drawable.light_spirit_0);
            name_monster.setText("Light Spirit");
            element_monster_img.setImageResource(R.drawable.bte_light);
            element_monster.setText("Elément Earth");
            egg.setImageResource(R.drawable.light_spirit_0);
            etape1.setImageResource(R.drawable.light_spirit_1);
            etape2.setImageResource(R.drawable.light_spirit_2);
            etape3.setImageResource(R.drawable.light_spirit_3);
            stat_power.setText("175");
            stat_life.setText("71");
            stat_speed.setText("175");
            stat_stamina.setText("100");

        } else if (streum == 5) {

            image_monster.setImageResource(R.drawable.genie_0);
            name_monster.setText("Rockilla");
            element_monster_img.setImageResource(R.drawable.bte_magic);
            element_monster.setText("Elément Magic");
            egg.setImageResource(R.drawable.genie_0);
            etape1.setImageResource(R.drawable.genie_1);
            etape2.setImageResource(R.drawable.genie_2);
            etape3.setImageResource(R.drawable.genie_3);
            stat_power.setText("190");
            stat_life.setText("50");
            stat_speed.setText("250");
            stat_stamina.setText("100");

        } else if (streum == 6) {

            image_monster.setImageResource(R.drawable.metalsaur_0);
            name_monster.setText("Metalsaur");
            element_monster_img.setImageResource(R.drawable.bte_metal);
            element_monster.setText("Elément Metal");
            egg.setImageResource(R.drawable.metalsaur_0);
            etape1.setImageResource(R.drawable.metalsaur_1);
            etape2.setImageResource(R.drawable.metalsaur_2);
            etape3.setImageResource(R.drawable.metalsaur_3);
            stat_power.setText("224");
            stat_life.setText("60");
            stat_speed.setText("200");
            stat_stamina.setText("100");

        } else if (streum == 7) {

            image_monster.setImageResource(R.drawable.panda_0);
            name_monster.setText("Panda");
            element_monster_img.setImageResource(R.drawable.bte_nature);
            element_monster.setText("Elément Nature");
            egg.setImageResource(R.drawable.panda_0);
            etape1.setImageResource(R.drawable.panda_1);
            etape2.setImageResource(R.drawable.panda_2);
            etape3.setImageResource(R.drawable.panda_3);
            stat_power.setText("190");
            stat_life.setText("56");
            stat_speed.setText("200");
            stat_stamina.setText("100");

        } else if (streum == 8) {

            image_monster.setImageResource(R.drawable.thunder_eagle_0);
            name_monster.setText("Thunder Eagle");
            element_monster_img.setImageResource(R.drawable.bte_thunder);
            element_monster.setText("Elément Thunder");
            egg.setImageResource(R.drawable.thunder_eagle_0);
            etape1.setImageResource(R.drawable.thunder_eagle_1);
            etape2.setImageResource(R.drawable.thunder_eagle_2);
            etape3.setImageResource(R.drawable.thunder_eagle_3);
            stat_power.setText("175");
            stat_life.setText("50");
            stat_speed.setText("250");
            stat_stamina.setText("100");

        } else if (streum == 9) {

            image_monster.setImageResource(R.drawable.turtle_0);
            name_monster.setText("Turtle");
            element_monster_img.setImageResource(R.drawable.bte_water);
            element_monster.setText("Elément Water");
            egg.setImageResource(R.drawable.turtle_0);
            etape1.setImageResource(R.drawable.turtle_1);
            etape2.setImageResource(R.drawable.turtle_2);
            etape3.setImageResource(R.drawable.turtle_3);
            stat_power.setText("200");
            stat_life.setText("56");
            stat_speed.setText("200");
            stat_stamina.setText("100");

        }

        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectMonsterDetails.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
