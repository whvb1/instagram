package com.example.instagram.Activities;


import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.Adapters.postAdapter;
import com.example.instagram.Models.post;
import com.example.instagram.R;

import java.util.ArrayList;
import java.util.List;

import static com.example.instagram.Adapters.postAdapter.SPAN_COUNT_ONE;
import static com.example.instagram.Adapters.postAdapter.SPAN_COUNT_THREE;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnPost;
    RecyclerView recyclePosts;
    GridLayoutManager gridLayoutManager;
    postAdapter postAdap;

    ArrayList<post> posts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPost = findViewById(R.id.btnPost);

        /*
        recyclePosts = findViewById(R.id.recyclePosts);
        gridLayoutManager = new GridLayoutManager(this, SPAN_COUNT_THREE);
        postAdap = new postAdapter(this, posts, gridLayoutManager);
        recyclePosts = findViewById(R.id.recyclePosts);
        recyclePosts.setAdapter(postAdap);
        recyclePosts.setLayoutManager(gridLayoutManager);
         */
        btnPost.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btnPost:
                Intent postIntent = new Intent(this, PostActivity.class);
                this.startActivity(postIntent);
                break;
            default:
                break;

        }

    }
}
