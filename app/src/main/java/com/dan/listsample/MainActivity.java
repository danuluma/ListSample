package com.dan.listsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView mListViewCelebs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> celebs = new ArrayList<>();

        celebs.add("Joseph Mwangi");
        celebs.add("Miguna Miguna");
        celebs.add("Cyprian Nyakundi");
        celebs.add("Dan Uluma");

        Log.e("Data Size", "=" + celebs.size());

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, celebs);
        mListViewCelebs = findViewById(R.id.list_view);
        mListViewCelebs.setAdapter(adapter
        );
        mListViewCelebs.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                        Toast.makeText(MainActivity.this, adapter.getItem(i), Toast.LENGTH_SHORT).show();

                    }
                }
        );

    }
}
