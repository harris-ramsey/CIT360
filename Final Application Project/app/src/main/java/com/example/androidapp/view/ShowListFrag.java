package com.example.androidapp.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.androidapp.MainActivity;
import com.example.androidapp.R;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ShowListFrag extends Fragment {
    private static final String FILE_NAME = "userlist.txt";
    Context context = MainActivity.getContext();
    FileInputStream fileInputStream = null;
    ArrayList<String> data = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.showusers, container, false);
        ListView listView = view.findViewById(R.id.showUsers);
        try {
            arrayListSetup();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                data);
        listView.setAdapter(adapter);

        return view;
    }

    private void arrayListSetup() throws IOException {
        try {
            fileInputStream = context.openFileInput(FILE_NAME);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            //String json = "";
            String inText;

            while ((inText = bufferedReader.readLine()) != null) {
                data.add(inText);
                //stringBuilder.append(inText);
                //json += inText;
            }

            /*Gson gson = new Gson();
            User[] users = gson.fromJson((JsonElement) obj, User[].class);
            for (User user: users) {
                //if (user != null) {
                    data.add(user.getName() + user.getEmail());
                //}
            }*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        }
    }
}
