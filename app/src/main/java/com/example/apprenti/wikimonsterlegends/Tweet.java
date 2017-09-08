package com.example.apprenti.wikimonsterlegends;

/**
 * Created by apprenti on 08/09/17.
 */

public class Tweet {
    private int avatar;
    private String pseudo;
    private String text;

    public Tweet(int avatar, String pseudo, String text) {
        this.avatar = avatar;
        this.pseudo = pseudo;
        this.text = text;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}