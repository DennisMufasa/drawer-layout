package com.mufasa.drawerlayout;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    ActionBarDrawerToggle mDrawerToggle;
    DrawerLayout mDrawer;
    TextView messageTextView;
    ListView mlstView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get reference to the textView and drawer layout
        messageTextView= (TextView) findViewById(R.id.messageTextView);
        mDrawer=(DrawerLayout)findViewById(R.id.activity_main);

        //display the top left humberger bugger button
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //make the humburger menu work
        mDrawerToggle= new ActionBarDrawerToggle(this,mDrawer,R.string.app_name,R.string.app_name){

          @Override
            public void onDrawerClosed(View drawerView){

          }

            public void onDrawerOpened(View drawerView){


            }
        };
        mDrawer.setDrawerListener(mDrawerToggle);
        mDrawerToggle.syncState();

        //OnOptions item select

    }
}
