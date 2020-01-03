package com.dyuga.customgridlayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    private List<MovieModel> moviesList;

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView text_id;
        ImageView image_id;

        MyViewHolder(View view) {
            super(view);
            text_id = view.findViewById(R.id.text_id);
            image_id = view.findViewById(R.id.image_id);
        }
    }

    public CustomAdapter(List<MovieModel> moviesList) {
        this.moviesList = moviesList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_layout, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MovieModel movie = moviesList.get(position);
        holder.image_id.setImageResource(R.drawable.image1);
        holder.text_id.setText(movie.getTitle());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}