package com.example.che.rcyclerviewcodingflowfirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleIetm> exampleList = new ArrayList<>();
        exampleList.add(new ExampleIetm(R.drawable.ic_android, "Line 1", "Line 2"));
        exampleList.add(new ExampleIetm(R.drawable.lego, "Line 3", "Line 4"));
        exampleList.add(new ExampleIetm(R.drawable.lips, "Line 5", "Line 6"));
        exampleList.add(new ExampleIetm(R.drawable.ic_android, "Line 7", "Line 8"));
        exampleList.add(new ExampleIetm(R.drawable.lego, "Line 9", "Line 10"));
        exampleList.add(new ExampleIetm(R.drawable.lips, "Line 11", "Line 12"));
        exampleList.add(new ExampleIetm(R.drawable.ic_android, "Line 13", "Line 14"));
        exampleList.add(new ExampleIetm(R.drawable.lego, "Line 15", "Line 16"));
        exampleList.add(new ExampleIetm(R.drawable.lips, "Line 17", "Line 18"));
        exampleList.add(new ExampleIetm(R.drawable.ic_android, "Line 19", "Line 20"));
        exampleList.add(new ExampleIetm(R.drawable.lego, "Line 21", "Line 22"));
        exampleList.add(new ExampleIetm(R.drawable.lips, "Line 23", "Line 24"));
        exampleList.add(new ExampleIetm(R.drawable.ic_android, "Line 25", "Line 26"));
        exampleList.add(new ExampleIetm(R.drawable.lego, "Line 27", "Line 28"));
        exampleList.add(new ExampleIetm(R.drawable.lips, "Line 29", "Line 30"));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}