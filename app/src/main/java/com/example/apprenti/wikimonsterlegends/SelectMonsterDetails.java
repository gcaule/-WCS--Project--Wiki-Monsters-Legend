package com.example.apprenti.wikimonsterlegends;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SelectMonsterDetails extends AppCompatActivity {

    int streum;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        ImageView statLife = (ImageView) findViewById(R.id.stat_life_img);
        statLife.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, R.string.lifeToast, duration);
                toast.setGravity(Gravity.LEFT, 210, 0);
                toast.show();
            }
        });

        ImageView statPower = (ImageView) findViewById(R.id.stat_power_img);
        statPower.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, R.string.powerToast, duration);
                toast.setGravity(Gravity.LEFT, 10, 0);
                toast.show();
            }
        });

        ImageView statSpeed = (ImageView) findViewById(R.id.stat_speed_img);
        statSpeed.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, R.string.speedToast, duration);
                toast.setGravity(Gravity.RIGHT,210, 0);
                toast.show();
            }
        });

        ImageView statStamina = (ImageView) findViewById(R.id.stat_stamina_img);
        statStamina.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, R.string.staminaToast, duration);
                toast.setGravity(Gravity.RIGHT, 0, 0);
                toast.show();
            }
        });

        streum = getIntent().getIntExtra("streum", 0);
        Button button_suiv = (Button)findViewById(R.id.button_suiv);
        Button button_prec = (Button)findViewById(R.id.button_prec);
        if (streum == 0) {
            button_prec.setEnabled(false);
        }
        else if (streum == 9){
            button_suiv.setEnabled(false);
        }

        final ImageView image_monster = (ImageView) findViewById(R.id.image_monster);
        TextView name_monster = (TextView) findViewById(R.id.name_monster);
        ImageView element_monster_img = (ImageView) findViewById(R.id.element_monster_img);
        TextView element_monster = (TextView) findViewById(R.id.element_monster);
        ImageView egg = (ImageView) findViewById(R.id.egg);
        ImageView etape1 = (ImageView) findViewById(R.id.etape1);
        ImageView etape2 = (ImageView) findViewById(R.id.etape2);
        ImageView etape3 = (ImageView) findViewById(R.id.etape3);
        final TextView statistiques = (TextView) findViewById(R.id.statistiques);
        final TextView stat_power = (TextView) findViewById(R.id.stat_power);
        final TextView stat_life = (TextView) findViewById(R.id.stat_life);
        final TextView stat_speed = (TextView) findViewById(R.id.stat_speed);
        final TextView stat_stamina = (TextView) findViewById(R.id.stat_stamina);
        TextView levelAdult = (TextView)findViewById(R.id.level25_100);

        if (streum == 0) {

            image_monster.setImageResource(R.drawable.tyrannoking_0);
            name_monster.setText("Tyrannoking");
            element_monster_img.setImageResource(R.drawable.bte_dark);
            element_monster.setText("Dark Element");
            egg.setImageResource(R.drawable.tyrannoking_0);
            etape1.setImageResource(R.drawable.tyrannoking_1);
            etape2.setImageResource(R.drawable.tyrannoking_2);
            etape3.setImageResource(R.drawable.tyrannoking_3);
            stat_power.setText("230");
            stat_life.setText("71");
            stat_speed.setText("175");
            stat_stamina.setText("100");
            levelAdult.setText("Level 25-70");

            ImageView imgClick0 = (ImageView)findViewById(R.id.egg);
            ImageView imgClick1 = (ImageView)findViewById(R.id.etape1);
            ImageView imgClick2 = (ImageView)findViewById(R.id.etape2);
            ImageView imgClick3 = (ImageView)findViewById(R.id.etape3);

            imgClick0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.tyrannoking_0);
                    statistiques.setText("Monster's Skills (Level 0)");
                    stat_power.setText("230");
                    stat_life.setText("71");
                    stat_speed.setText("175");
                }
            });

            imgClick1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.tyrannoking_1);
                    statistiques.setText("Monster's Skills (Level 1)");
                    stat_power.setText("253");
                    stat_life.setText("81");
                    stat_speed.setText("192");
                }
            });

            imgClick2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.tyrannoking_2);
                    statistiques.setText("Monster's Skills (Level 4)");
                    stat_power.setText("322");
                    stat_life.setText("104");
                    stat_speed.setText("244");
                }
            });

            imgClick3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.tyrannoking_3);
                    statistiques.setText("Monster's Skills (Level 25)");
                    stat_power.setText("805");
                    stat_life.setText("1017");
                    stat_speed.setText("612");
                }
            });

        } else if (streum == 1) {

            image_monster.setImageResource(R.drawable.rockilla_0);
            name_monster.setText("Rockilla");
            element_monster_img.setImageResource(R.drawable.bte_earth);
            element_monster.setText("Earth Element");
            egg.setImageResource(R.drawable.rockilla_0);
            etape1.setImageResource(R.drawable.rockilla_1);
            etape2.setImageResource(R.drawable.rockilla_2);
            etape3.setImageResource(R.drawable.rockilla_3);
            stat_power.setText("175");
            stat_life.setText("71");
            stat_speed.setText("175");
            stat_stamina.setText("100");
            levelAdult.setText("Level 25-70");

            ImageView imgClick0 = (ImageView)findViewById(R.id.egg);
            ImageView imgClick1 = (ImageView)findViewById(R.id.etape1);
            ImageView imgClick2 = (ImageView)findViewById(R.id.etape2);
            ImageView imgClick3 = (ImageView)findViewById(R.id.etape3);

            imgClick0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.rockilla_0);
                    statistiques.setText("Monster's Skills (Level 0)");
                    stat_power.setText("175");
                    stat_life.setText("71");
                    stat_speed.setText("175");
                }
            });

            imgClick1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.rockilla_1);
                    statistiques.setText("Monster's Skills (Level 1)");
                    stat_power.setText("192");
                    stat_life.setText("115");
                    stat_speed.setText("192");
                }
            });

            imgClick2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.rockilla_2);
                    statistiques.setText("Monster's Skills (Level 4)");
                    stat_power.setText("244");
                    stat_life.setText("147");
                    stat_speed.setText("244");
                }
            });

            imgClick3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.rockilla_3);
                    statistiques.setText("Monster's Skills (Level 25)");
                    stat_power.setText("612");
                    stat_life.setText("1444");
                    stat_speed.setText("612");
                }
            });


        } else if (streum == 2) {

            image_monster.setImageResource(R.drawable.fire_lion_0);
            name_monster.setText("Fire Lion");
            element_monster_img.setImageResource(R.drawable.bte_fire);
            element_monster.setText("Fire Element");
            egg.setImageResource(R.drawable.fire_lion_0);
            etape1.setImageResource(R.drawable.fire_lion_1);
            etape2.setImageResource(R.drawable.fire_lion_2);
            etape3.setImageResource(R.drawable.fire_lion_3);
            stat_power.setText("220");
            stat_life.setText("50");
            stat_speed.setText("175");
            stat_stamina.setText("100");
            levelAdult.setText("Level 25-70");

            ImageView imgClick0 = (ImageView)findViewById(R.id.egg);
            ImageView imgClick1 = (ImageView)findViewById(R.id.etape1);
            ImageView imgClick2 = (ImageView)findViewById(R.id.etape2);
            ImageView imgClick3 = (ImageView)findViewById(R.id.etape3);

            imgClick0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.fire_lion_0);
                    statistiques.setText("Monster's Skills (Level 0)");
                    stat_power.setText("220");
                    stat_life.setText("50");
                    stat_speed.setText("175");
                }
            });

            imgClick1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.fire_lion_1);
                    statistiques.setText("Monster's Skills (Level 1)");
                    stat_power.setText("242");
                    stat_life.setText("81");
                    stat_speed.setText("192");
                }
            });

            imgClick2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.fire_lion_2);
                    statistiques.setText("Monster's Skills (Level 4)");
                    stat_power.setText("308");
                    stat_life.setText("104");
                    stat_speed.setText("244");
                }
            });

            imgClick3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.fire_lion_3);
                    statistiques.setText("Monster's Skills (Level 25)");
                    stat_power.setText("770");
                    stat_life.setText("1017");
                    stat_speed.setText("612");
                }
            });


        } else if (streum == 3) {

            image_monster.setImageResource(R.drawable.arch_knight_0);
            name_monster.setText("Arch Knight");
            element_monster_img.setImageResource(R.drawable.bte_legend);
            element_monster.setText("Element Legend");
            egg.setImageResource(R.drawable.arch_knight_0);
            etape1.setImageResource(R.drawable.arch_knight_1);
            etape2.setImageResource(R.drawable.arch_knight_2);
            etape3.setImageResource(R.drawable.arch_knight_3);
            stat_power.setText("200");
            stat_life.setText("56");
            stat_speed.setText("200");
            stat_stamina.setText("140");
            levelAdult.setText("Level 25-130");

            ImageView imgClick0 = (ImageView)findViewById(R.id.egg);
            ImageView imgClick1 = (ImageView)findViewById(R.id.etape1);
            ImageView imgClick2 = (ImageView)findViewById(R.id.etape2);
            ImageView imgClick3 = (ImageView)findViewById(R.id.etape3);

            imgClick0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.arch_knight_0);
                    statistiques.setText("Monster's Skills (Level 0)");
                    stat_power.setText("200");
                    stat_life.setText("56");
                    stat_speed.setText("200");
                }
            });

            imgClick1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.arch_knight_1);
                    statistiques.setText("Monster's Skills (Level 1)");
                    stat_power.setText("308");
                    stat_life.setText("127");
                    stat_speed.setText("308");
                }
            });

            imgClick2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.arch_knight_2);
                    statistiques.setText("Monster's Skills (Level 4)");
                    stat_power.setText("392");
                    stat_life.setText("162");
                    stat_speed.setText("392");
                }
            });

            imgClick3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.arch_knight_3);
                    statistiques.setText("Monster's Skills (Level 25)");
                    stat_power.setText("980");
                    stat_life.setText("1587");
                    stat_speed.setText("980");
                }
            });


        } else if (streum == 4) {

            image_monster.setImageResource(R.drawable.light_spirit_0);
            name_monster.setText("Light Spirit");
            element_monster_img.setImageResource(R.drawable.bte_light);
            element_monster.setText("Light Element");
            egg.setImageResource(R.drawable.light_spirit_0);
            etape1.setImageResource(R.drawable.light_spirit_1);
            etape2.setImageResource(R.drawable.light_spirit_2);
            etape3.setImageResource(R.drawable.light_spirit_3);
            stat_power.setText("175");
            stat_life.setText("71");
            stat_speed.setText("175");
            stat_stamina.setText("100");
            levelAdult.setText("Level 25-70");

            ImageView imgClick0 = (ImageView)findViewById(R.id.egg);
            ImageView imgClick1 = (ImageView)findViewById(R.id.etape1);
            ImageView imgClick2 = (ImageView)findViewById(R.id.etape2);
            ImageView imgClick3 = (ImageView)findViewById(R.id.etape3);

            imgClick0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.light_spirit_0);
                    statistiques.setText("Monster's Skills (Level 0)");
                    stat_power.setText("175");
                    stat_life.setText("71");
                    stat_speed.setText("175");
                }
            });

            imgClick1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.light_spirit_1);
                    statistiques.setText("Monster's Skills (Level 1)");
                    stat_power.setText("192");
                    stat_life.setText("115");
                    stat_speed.setText("192");
                }
            });

            imgClick2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.light_spirit_2);
                    statistiques.setText("Monster's Skills (Level 4)");
                    stat_power.setText("244");
                    stat_life.setText("147");
                    stat_speed.setText("244");
                }
            });

            imgClick3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.light_spirit_3);
                    statistiques.setText("Monster's Skills (Level 25)");
                    stat_power.setText("612");
                    stat_life.setText("1444");
                    stat_speed.setText("612");
                }
            });


        } else if (streum == 5) {

            image_monster.setImageResource(R.drawable.genie_0);
            name_monster.setText("Genie");
            element_monster_img.setImageResource(R.drawable.bte_magic);
            element_monster.setText("Magic Element");
            egg.setImageResource(R.drawable.genie_0);
            etape1.setImageResource(R.drawable.genie_1);
            etape2.setImageResource(R.drawable.genie_2);
            etape3.setImageResource(R.drawable.genie_3);
            stat_power.setText("190");
            stat_life.setText("50");
            stat_speed.setText("250");
            stat_stamina.setText("100");
            levelAdult.setText("Level 25-70");

            ImageView imgClick0 = (ImageView)findViewById(R.id.egg);
            ImageView imgClick1 = (ImageView)findViewById(R.id.etape1);
            ImageView imgClick2 = (ImageView)findViewById(R.id.etape2);
            ImageView imgClick3 = (ImageView)findViewById(R.id.etape3);

            imgClick0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.genie_0);
                    statistiques.setText("Monster's Skills (Level 0)");
                    stat_power.setText("190");
                    stat_life.setText("50");
                    stat_speed.setText("250");
                }
            });

            imgClick1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.genie_1);
                    statistiques.setText("Monster's Skills (Level 1)");
                    stat_power.setText("209");
                    stat_life.setText("81");
                    stat_speed.setText("275");
                }
            });

            imgClick2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.genie_2);
                    statistiques.setText("Monster's Skills (Level 4)");
                    stat_power.setText("266");
                    stat_life.setText("104");
                    stat_speed.setText("350");
                }
            });

            imgClick3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.genie_3);
                    statistiques.setText("Monster's Skills (Level 25)");
                    stat_power.setText("665");
                    stat_life.setText("1017");
                    stat_speed.setText("875");
                }
            });


        } else if (streum == 6) {

            image_monster.setImageResource(R.drawable.metalsaur_0);
            name_monster.setText("Metalsaur");
            element_monster_img.setImageResource(R.drawable.bte_metal);
            element_monster.setText("Metal Element");
            egg.setImageResource(R.drawable.metalsaur_0);
            etape1.setImageResource(R.drawable.metalsaur_1);
            etape2.setImageResource(R.drawable.metalsaur_2);
            etape3.setImageResource(R.drawable.metalsaur_3);
            stat_power.setText("224");
            stat_life.setText("60");
            stat_speed.setText("200");
            stat_stamina.setText("100");
            levelAdult.setText("Level 25-70");

            ImageView imgClick0 = (ImageView)findViewById(R.id.egg);
            ImageView imgClick1 = (ImageView)findViewById(R.id.etape1);
            ImageView imgClick2 = (ImageView)findViewById(R.id.etape2);
            ImageView imgClick3 = (ImageView)findViewById(R.id.etape3);

            imgClick0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.metalsaur_0);
                    statistiques.setText("Monster's Skills (Level 0)");
                    stat_power.setText("224");
                    stat_life.setText("60");
                    stat_speed.setText("200");
                }
            });

            imgClick1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.metalsaur_1);
                    statistiques.setText("Monster's Skills (Level 1)");
                    stat_power.setText("246");
                    stat_life.setText("97");
                    stat_speed.setText("220");
                }
            });

            imgClick2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.metalsaur_2);
                    statistiques.setText("Monster's Skills (Level 4)");
                    stat_power.setText("313");
                    stat_life.setText("124");
                    stat_speed.setText("280");
                }
            });

            imgClick3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.metalsaur_3);
                    statistiques.setText("Monster's Skills (Level 25)");
                    stat_power.setText("784");
                    stat_life.setText("1220");
                    stat_speed.setText("700");
                }
            });


        } else if (streum == 7) {

            image_monster.setImageResource(R.drawable.panda_0);
            name_monster.setText("Panda");
            element_monster_img.setImageResource(R.drawable.bte_nature);
            element_monster.setText("Nature Element");
            egg.setImageResource(R.drawable.panda_0);
            etape1.setImageResource(R.drawable.panda_1);
            etape2.setImageResource(R.drawable.panda_2);
            etape3.setImageResource(R.drawable.panda_3);
            stat_power.setText("190");
            stat_life.setText("56");
            stat_speed.setText("200");
            stat_stamina.setText("100");
            levelAdult.setText("Level 25-70");

            ImageView imgClick0 = (ImageView)findViewById(R.id.egg);
            ImageView imgClick1 = (ImageView)findViewById(R.id.etape1);
            ImageView imgClick2 = (ImageView)findViewById(R.id.etape2);
            ImageView imgClick3 = (ImageView)findViewById(R.id.etape3);

            imgClick0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.panda_0);
                    statistiques.setText("Monster's Skills (Level 0)");
                    stat_power.setText("190");
                    stat_life.setText("56");
                    stat_speed.setText("100");
                }
            });

            imgClick1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.panda_1);
                    statistiques.setText("Monster's Skills (Level 1)");
                    stat_power.setText("209");
                    stat_life.setText("91");
                    stat_speed.setText("220");
                }
            });

            imgClick2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.panda_2);
                    statistiques.setText("Monster's Skills (Level 4)");
                    stat_power.setText("266");
                    stat_life.setText("116");
                    stat_speed.setText("280");
                }
            });

            imgClick3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.panda_3);
                    statistiques.setText("Monster's Skills (Level 25)");
                    stat_power.setText("665");
                    stat_life.setText("1139");
                    stat_speed.setText("700");
                }
            });


        } else if (streum == 8) {

            image_monster.setImageResource(R.drawable.thunder_eagle_0);
            name_monster.setText("Thunder Eagle");
            element_monster_img.setImageResource(R.drawable.bte_thunder);
            element_monster.setText("Thunder Element");
            egg.setImageResource(R.drawable.thunder_eagle_0);
            etape1.setImageResource(R.drawable.thunder_eagle_1);
            etape2.setImageResource(R.drawable.thunder_eagle_2);
            etape3.setImageResource(R.drawable.thunder_eagle_3);
            stat_power.setText("175");
            stat_life.setText("50");
            stat_speed.setText("250");
            stat_stamina.setText("100");
            levelAdult.setText("Level 25-70");

            ImageView imgClick0 = (ImageView)findViewById(R.id.egg);
            ImageView imgClick1 = (ImageView)findViewById(R.id.etape1);
            ImageView imgClick2 = (ImageView)findViewById(R.id.etape2);
            ImageView imgClick3 = (ImageView)findViewById(R.id.etape3);

            imgClick0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.thunder_eagle_0);
                    statistiques.setText("Monster's Skills (Level 0)");
                    stat_power.setText("175");
                    stat_life.setText("50");
                    stat_speed.setText("250");
                }
            });

            imgClick1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.thunder_eagle_1);
                    statistiques.setText("Monster's Skills (Level 1)");
                    stat_power.setText("192");
                    stat_life.setText("81");
                    stat_speed.setText("275");
                }
            });

            imgClick2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.thunder_eagle_2);
                    statistiques.setText("Monster's Skills (Level 4)");
                    stat_power.setText("244");
                    stat_life.setText("104");
                    stat_speed.setText("350");
                }
            });

            imgClick3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.thunder_eagle_3);
                    statistiques.setText("Monster's Skills (Level 25)");
                    stat_power.setText("612");
                    stat_life.setText("1017");
                    stat_speed.setText("875");
                }
            });


        } else if (streum == 9) {

            image_monster.setImageResource(R.drawable.turtle_0);
            name_monster.setText("Turtle");
            element_monster_img.setImageResource(R.drawable.bte_water);
            element_monster.setText("Water Element");
            egg.setImageResource(R.drawable.turtle_0);
            etape1.setImageResource(R.drawable.turtle_1);
            etape2.setImageResource(R.drawable.turtle_2);
            etape3.setImageResource(R.drawable.turtle_3);
            stat_power.setText("200");
            stat_life.setText("56");
            stat_speed.setText("200");
            stat_stamina.setText("100");
            levelAdult.setText("Level 25-70");

            ImageView imgClick0 = (ImageView)findViewById(R.id.egg);
            ImageView imgClick1 = (ImageView)findViewById(R.id.etape1);
            ImageView imgClick2 = (ImageView)findViewById(R.id.etape2);
            ImageView imgClick3 = (ImageView)findViewById(R.id.etape3);

            imgClick0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.turtle_0);
                    statistiques.setText("Monster's Skills (Level 0)");
                    stat_power.setText("200");
                    stat_life.setText("56");
                    stat_speed.setText("200");
                }
            });

            imgClick1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.turtle_1);
                    statistiques.setText("Monster's Skills (Level 1)");
                    stat_power.setText("220");
                    stat_life.setText("91");
                    stat_speed.setText("220");
                }
            });

            imgClick2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.turtle_2);
                    statistiques.setText("Monster's Skills (Level 4)");
                    stat_power.setText("280");
                    stat_life.setText("116");
                    stat_speed.setText("280");
                }
            });

            imgClick3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_monster.setImageResource(R.drawable.turtle_3);
                    statistiques.setText("Monster's Skills (Level 25)");
                    stat_power.setText("700");
                    stat_life.setText("1139");
                    stat_speed.setText("700");
                }
            });


        }

        Button prec = (Button)findViewById(R.id.button_prec);
        prec.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectMonsterDetails.this, SelectMonsterDetails.class);
                intent.putExtra("streum", streum-1);
                startActivity(intent);
            }
        });

        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectMonsterDetails.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button suiv = (Button)findViewById(R.id.button_suiv);
        suiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SelectMonsterDetails.this, SelectMonsterDetails.class);
                intent.putExtra("streum", streum+1);
                startActivity(intent);

            }
        });

    }
}
