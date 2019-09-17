package com.metacoders.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.ListItem;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewID);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

//        Method one
        /*ListItem item1 = new ListItem("Hello 1", "It's Dummy1", "8.5");
        ListItem item2 = new ListItem("Hello 2", "It's Dummy2", "7.5");

        listItems.add(item1);
        listItems.add(item2);*/


//        Method two

        for (int i = 0; i < 10; i++) {
            ListItem item = new ListItem(
                    "Item " + (i + 1),
                    "Description",
                    "Excellent"
            );
            listItems.add(item);

        }

        adapter = new MyAdapter(this, listItems);
        recyclerView.setAdapter(adapter);
    }

}
