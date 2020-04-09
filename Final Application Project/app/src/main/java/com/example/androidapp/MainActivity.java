package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;

import com.example.androidapp.view.InputInfoFrag;
import com.example.androidapp.view.LoginFrag;
import com.example.androidapp.view.MenuFrag;

public class MainActivity extends AppCompatActivity {

    private static Context context;
    public static Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        MainActivity.context = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContext(this);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragCont, new LoginFrag());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

}
