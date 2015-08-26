package com.chenyingchu.mylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.list);
        final String[] values = new String[]{
                "I am the first one",
                "I am the second one",
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,
                android.R.id.text1, values);

        //Assign the adapter to listView
        listView.setAdapter(adapter);
        //set onclick
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int intPos = i;
                String clickedValue = listView.getItemAtPosition(intPos).toString();
                Toast.makeText(getApplicationContext(), clickedValue, Toast.LENGTH_SHORT).show();

            }
        });


    }
}
