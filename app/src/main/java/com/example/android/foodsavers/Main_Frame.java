package com.example.android.foodsavers;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.TextView;

public class Main_Frame extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText( R.string.title_home );
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText( R.string.title_dashboard );
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText( R.string.title_notifications );
                    return true;
            }
            return false;
        }
    };

    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main__frame );

        mTextMessage = (TextView) findViewById( R.id.message );
        BottomNavigationView navigation = (BottomNavigationView) findViewById( R.id.navigation );
        final SearchView mSearchView =  findViewById(R.id.search);
        mSearchView.clearFocus();
        mSearchView.setFocusable(false);
        mSearchView.setOnQueryTextListener( new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                mSearchView.clearFocus();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        } );
        navigation.setSelectedItemId( R.id.navigation_home );
        navigation.setOnNavigationItemSelectedListener( mOnNavigationItemSelectedListener );
        LinearLayout button = (LinearLayout) findViewById(R.id.Food_OneButton);
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main_Frame.this, Recycleview.class);
                startActivity(intent);
            }
        } );
        LinearLayout button1 = (LinearLayout) findViewById(R.id.Food_TwoButton);
        button1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main_Frame.this, Recycleview.class);
                startActivity(intent);
            }
        } );
        LinearLayout button2 = (LinearLayout) findViewById(R.id.Food_ThreeButton);
        button2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main_Frame.this, Recycleview.class);
                startActivity(intent);
            }
        } );
        LinearLayout Login = (LinearLayout) findViewById(R.id.LineLogin);
        findViewById(R.id.Login).setFocusable(false);
        findViewById(R.id.Login).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main_Frame.this, Recycleview.class);
                startActivity(intent);
            }
        } );
        Login.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main_Frame.this, Recycleview.class);
                startActivity(intent);
            }
        } );
        LinearLayout Register = (LinearLayout) findViewById(R.id.LineRegister);
        findViewById(R.id.Register).setFocusable(false);
        findViewById(R.id.Register).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main_Frame.this, Recycleview.class);
                startActivity(intent);
            }
        } );
        Register.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main_Frame.this, Recycleview.class);
                startActivity(intent);
            }
        } );
    }
}
