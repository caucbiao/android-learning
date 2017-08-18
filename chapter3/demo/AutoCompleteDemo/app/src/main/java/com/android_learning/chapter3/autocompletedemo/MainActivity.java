package com.android_learning.chapter3.autocompletedemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, FRUITS);
        AutoCompleteTextView tv1 = (AutoCompleteTextView) findViewById(R.id.text1);
        tv1.setAdapter(adapter);

        MultiAutoCompleteTextView tv2 = (MultiAutoCompleteTextView) findViewById(R.id.text2);
        tv2.setAdapter(adapter);
        tv2.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }

    static final String[] FRUITS = new String[] {
            "Apple","Apricot","Areca nut","Banana","Blackberry","Blueberry"," Cherry ","Coconut","Cumquat","Flat peach",
            " Grape ","Greengage","Guava","Haw","Honey peach","Jackfruit","Kiwi fruit","Lemon","Litchi","Longan",
            "Loquat"," Mango","Musk melon","Nectarine","Orange ","Pawpaw","Peach "," Pear"," Persimmon ","Pineapple",
            "Plum","Pomegranate","Raspberry","Starfruit ","Shaddock","Strawberry","Sugar cane","Tangerine ",
            "Tomato","Watermelon","Waxberry red bayberry"

    };
}
