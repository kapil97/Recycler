package com.example.kapil.recyclertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
        private RecyclerView recyclerView;
        private RecyclerView.Adapter adapter;
    private List<CardView> listitems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
//        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        listitems=new ArrayList<>();
        for(int i=0;i<=12;i++)
        {
            CardView cardView=new CardView(
                    "headings"+(i+1),"dummy text"
            );
            listitems.add(cardView);

        }
        adapter = new Adapter(listitems);
        recyclerView.setAdapter(adapter);
    }
}
