package com.example.androidapp.view;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.androidapp.R;
import com.example.androidapp.model.AddUser;
import com.example.androidapp.model.GetUsers;
import com.example.androidapp.model.NewUser;

import org.json.JSONException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class InputInfoFrag extends Fragment {

    EditText fName;
    EditText lName;
    EditText email;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.inputinfo, container, false);
        fName = view.findViewById(R.id.fName);
        lName = view.findViewById(R.id.lName);
        email = view.findViewById(R.id.emailAddy);
        //phone = view.findViewById(R.id.phoneNum);

        Button submit = view.findViewById(R.id.submitUser);
        submit.setOnClickListener(new SubmitUser());
        Button button = view.findViewById(R.id.mainMenu);
        button.setOnClickListener(new MainMenu());
        return view;
    }

    public class SubmitUser implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            fName.getText();
            lName.getText();
            email.getText();

            try {
                new AddUser(fName, lName, email);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            Log.d("fName", String.valueOf(fName.getText()));
        }
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
}
