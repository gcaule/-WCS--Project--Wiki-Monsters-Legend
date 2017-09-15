package com.example.apprenti.wikimonsterlegends;

/**
 * Code: le Poisson a sauté de la Poêle.
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

    public String getPseudo() {
        return pseudo;
    }

    public String getText() {
        return text;
    }

}