package com.example.androidapp.model;

import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static android.app.PendingIntent.getActivity;

public class AddUser {

    private DatabaseReference mDatabase;

    public AddUser(EditText fName, EditText lName, EditText email) throws FileNotFoundException, JSONException {
        NewUser user = new NewUser();
        user.setfName(fName);
        user.setlName(lName);
        user.setEmail(email);

        JSONObject jo = new JSONObject();


        jo.put("user 1", user);


        //mDatabase = FirebaseDatabase.getInstance().getReference("UserList");
        //FirebaseDatabase database = FirebaseDatabase.getInstance();
        //DatabaseReference myRef = database.getReference("UserList");
        //myRef.setValue(jo.toString());
        /*File file = new File("/assets/UserList.json");
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.write(jo.toString());

            pw.flush();
        }*/
    }

}
