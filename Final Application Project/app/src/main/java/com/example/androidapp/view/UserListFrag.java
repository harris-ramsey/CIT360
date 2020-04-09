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


public class UserListFrag extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.userlist, container, false);
        Button showUserButton = view.findViewById(R.id.butShowUsers);
        showUserButton.setOnClickListener(new grabUser());
        Button button = view.findViewById(R.id.mainMenu2);
        button.setOnClickListener(new MainMenu());
        return view;
    }

    public class MainMenu implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragCont, new MenuFrag());
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public class grabUser implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragCont, new ShowListFrag());
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
