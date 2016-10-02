package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_lists);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red", "wettati", R.drawable.color_red));
        words.add(new Word("musterd Yellow", "chiwitte", R.drawable.color_mustard_yellow));
        words.add(new Word("dusty yellow", "tolookuso", R.drawable.color_dusty_yellow));
        words.add(new Word("green", "chokkoki", R.drawable.color_green));
        words.add(new Word("brown", "takakki", R.drawable.color_brown));
        words.add(new Word("grey", "topoppi", R.drawable.color_gray));
        words.add(new Word("white", "kennekakku", R.drawable.color_white));
        words.add(new Word("black", "kululli", R.drawable.color_black));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
