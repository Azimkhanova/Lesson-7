package com.example.lesson_7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    FoodListAdapter FoodListAdapter;
    ArrayList<Fooddd> foodddList;
    private RecyclerView.LayoutManager linearLayoutManager,gridLayoutManager;


    Button btn_change;
    boolean layoutType = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        btn_change = findViewById(R.id.btn_change);
        foodddList= new ArrayList<>();

        foodddList.add(new Fooddd(R.drawable.pizza,"DDDDD", "Tort1", 2990));
        foodddList.add(new Fooddd(R.drawable.pizza,"fffff", "Tort2", 3190));
        foodddList.add(new Fooddd(R.drawable.pizza,"BBBBB", "Tort3", 1990));


        linearLayoutManager = new LinearLayoutManager(this);
        gridLayoutManager = new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setAdapter(FoodListAdapter);

        btn_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutType = !layoutType;

                if (layoutType) {
                    recyclerView.setLayoutManager(gridLayoutManager);
                    foodddList.remove(0);

                } else {
                    recyclerView.setLayoutManager(linearLayoutManager);

                }
                FoodListAdapter.notifyDataSetChanged();
            }

        });
    }


    public void initViews(){

    }
}