package edu.calvin.cs262.climbinglogapp;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by jbu2 on 11/4/2015.
 * Routes page
 */
public class Routes extends FragmentActivity {

    //onCreate() method
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.routes);
    }

    protected void onPause() {
        super.onPause();
    }
}