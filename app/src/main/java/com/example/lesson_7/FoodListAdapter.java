package com.example.lesson_7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodListAdapter extends RecyclerView.Adapter<FoodListAdapter.MyTViewHolder> {
    public Context context;
    public List<Fooddd> foodddList;

    public class MyTViewHolder extends RecyclerView.ViewHolder {

        public ImageView photo;
        public TextView title,desc, price;

        public MyTViewHolder(View view){
            super(view);
            photo = view.findViewById(R.id.imageView);
            title = view.findViewById(R.id.title);
            desc = view.findViewById(R.id.desc);
            price = view.findViewById(R.id.price);
        }

    }

    public FoodListAdapter(Context context, List<Fooddd> foodList){
        this.context = context;
        this.foodddList = foodList;
    }

    @Override
    public MyTViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;
        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_foods,parent,false);

        return new MyTViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyTViewHolder holder, int position) {

        Fooddd item = foodddList.get(position);

        holder.photo.setImageResource(item.getPhoto());

        holder.title.setText(item.getTitle());
        holder.desc.setText(item.getDesc());
        holder.price.setText(""+ item.getPrice());



    }

    @Override
    public int getItemCount() {
        return foodddList.size();
    }
}
