package com.example.apprenti.wikimonsterlegends;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by apprenti on 08/09/17.
 */

    public class TweetAdapter extends ArrayAdapter<Tweet> {

        public TweetAdapter(Context context, List<Tweet> tweets) {
            super(context, 0, tweets);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null){
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.tweet_monstre,parent, false);
            }

            TweetViewHolder viewHolder = (TweetViewHolder) convertView.getTag();
            if(viewHolder == null){
                viewHolder = new TweetViewHolder();
                viewHolder.pseudo = (TextView) convertView.findViewById(R.id.pseudo);
                viewHolder.text = (TextView) convertView.findViewById(R.id.text);
                viewHolder.avatar = (ImageView) convertView.findViewById(R.id.avatar);
                convertView.setTag(viewHolder);
            }

            Tweet tweet = getItem(position);
            viewHolder.pseudo.setText(tweet.getPseudo());
            viewHolder.text.setText(tweet.getText());
            viewHolder.avatar.setImageResource(tweet.getAvatar());

            return convertView;
        }

        private class TweetViewHolder{
            public TextView pseudo;
            public TextView text;
            public ImageView avatar;

        }
}
