package com.dyuga.customgridlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.dyuga.customgridlayout.customlayoutmanager.SpannableGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    CustomAdapter customAdapter;
    private List<MovieModel> movieList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prepareData();
        mRecyclerView = findViewById(R.id.mRecyclerView);
        customAdapter = new CustomAdapter(movieList);

        mRecyclerView.setLayoutManager(new SpannableGridLayoutManager(
                new SpannableGridLayoutManager.GridSpanLookup() {
                    @Override
                    public SpannableGridLayoutManager.SpanInfo getSpanInfo(int position) {
                        if (position == 4) {
                            return new SpannableGridLayoutManager.SpanInfo(2, 3);
                        } else {
                            return new SpannableGridLayoutManager.SpanInfo(1, 1);
                        }
                    }
                }, 3 ,
                .65f ));




        mRecyclerView.setAdapter(customAdapter);
    }

    private void prepareData() {
        MovieModel movie = new MovieModel("Book A Table");
        movieList.add(movie);
        movie = new MovieModel("Book A Table");
        movieList.add(movie);
        movie = new MovieModel("Book A Table");
        movieList.add(movie);
        movie = new MovieModel("Book A Table");
        movieList.add(movie);
        movie = new MovieModel("Book A Table");
        movieList.add(movie);
        movie = new MovieModel("Book A Table");
        movieList.add(movie);

    }
}
