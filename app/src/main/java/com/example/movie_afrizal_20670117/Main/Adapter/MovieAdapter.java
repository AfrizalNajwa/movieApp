package com.example.movie_afrizal_20670117.Main.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.movie_afrizal_20670117.R;
import com.example.movie_afrizal_20670117.Main.Activity.DetailMovieActivity;
import com.example.movie_afrizal_20670117.Main.Activity.MainActivity;
import com.example.movie_afrizal_20670117.Main.Model.Result;

import java.util.List;



public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {
    private Context context;
    private List<Result> resultList;

    public MovieAdapter(Context context, List<Result> resultList) {
        this.context = context;
        this.resultList = resultList;
    }

