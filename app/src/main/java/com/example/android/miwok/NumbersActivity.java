package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_lists);

        // Create a list of Word
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one", "lutti", R.drawable.number_one));
        words.add(new Word("two", "otikko", R.drawable.number_two));
        words.add(new Word("three", "tolookuso", R.drawable.number_three));
        words.add(new Word("four", "oyyisia", R.drawable.number_four));
        words.add(new Word("five", "massoka", R.drawable.number_five));
        words.add(new Word("six", "temmuka", R.drawable.number_six));
        words.add(new Word("seven", "kennekakku", R.drawable.number_seven));
        words.add(new Word("eight", "kawinta", R.drawable.number_eight));
        words.add(new Word("nine", "wo'e", R.drawable.number_nine));
        words.add(new Word("ten", "na'achha", R.drawable.number_ten));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}