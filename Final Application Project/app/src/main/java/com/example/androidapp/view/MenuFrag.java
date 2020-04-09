package com.example.androidapp.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.androidapp.R;
import com.example.androidapp.model.GetUsers;

public class MenuFrag extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.menu, container, false);
        Button buttonList = view.findViewById(R.id.butUserList);
        buttonList.setOnClickListener(new UserList());
        //Button buttonAdd = view.findViewById(R.id.butAddUser);
        //buttonAdd.setOnClickListener(new AddUser());
        return view;
    }

    private class UserList implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            new GetUsers().execute("https://userdb-b64f9.firebaseio.com/UserList.json");

            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragCont, new UserListFrag());
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

/*
    private class AddUser implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragCont, new InputInfoFrag());
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }*/
}
