package com.example.instagram.Adapters;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.instagram.Models.post;
import com.example.instagram.R;

import java.util.ArrayList;

public class postAdapter extends RecyclerView.Adapter {

    private Context mContext;
    private ArrayList<post> mData;
    RequestOptions option;
    private GridLayoutManager mLayoutManager;
    public static final int SPAN_COUNT_ONE = 1;
    public static final int SPAN_COUNT_THREE = 3;
    public static final int VIEW_TYPE_SMALL = 1;
    public static final int VIEW_TYPE_BIG = 2;

    public postAdapter(Context mContext, ArrayList<post> mData, GridLayoutManager mLayoutManager) {
        this.mContext = mContext;
        this.mData = mData;
        this.mLayoutManager = mLayoutManager;

        //Request option for Glide
        option = new RequestOptions().centerCrop().placeholder(R.drawable.ic_launcher_background).error(R.drawable.ic_launcher_background);
    }
    public int getItemViewType(int position) {
        int spanCount = mLayoutManager.getSpanCount();
        if (spanCount == SPAN_COUNT_ONE) {
            return VIEW_TYPE_BIG;
        } else {
            return VIEW_TYPE_SMALL;
        }
    }
    @Override
    public postAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //TODO: grid layout manager
        View view;
        if ( viewType == VIEW_TYPE_BIG) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_small, parent, false);
        } else {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_small, parent, false);
        }
        return new MyViewHolder(view, viewType);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }


    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        //big layout
        if (getItemViewType(position) == VIEW_TYPE_BIG) {
        }
        //small layout + big layout
        holder.txtCaption.setText(mData.get(position).getCaption());
        holder.frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: image info
            }
        });
        //Glide.with(mContext).load().apply(option).into(holder.imgPhoto);


    }

    public int getItemCount() { return mData.size(); }



    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txtCaption;
        ImageView imgPhoto;
        LinearLayout frame;

        public MyViewHolder(View itemView, int viewType) {
            super(itemView);
            if (viewType == VIEW_TYPE_BIG) {

            } else {
                txtCaption = itemView.findViewById(R.id.txtCaption);
                imgPhoto = itemView.findViewById(R.id.imgPhoto);
                frame = itemView.findViewById(R.id.frame);

            }



        }
    }


}
