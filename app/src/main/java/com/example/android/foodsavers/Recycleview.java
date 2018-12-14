package com.example.android.foodsavers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Recycleview extends AppCompatActivity {
    private myAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_recycleview );
        RecyclerView mRecyclerView =this.findViewById( R.id.info );
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        List<String> values = new ArrayList<String>();
        values.add( "餐馆信息：kkk" );
        values.add( "餐馆信息：eee" );
        mAdapter = new myAdapter( values, R.layout.restaurant, this );
        mRecyclerView.setAdapter(mAdapter);
    }
}
