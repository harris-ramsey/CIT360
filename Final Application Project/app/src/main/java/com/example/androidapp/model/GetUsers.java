package com.example.androidapp.model;

import android.os.AsyncTask;
import android.util.Log;

import com.example.androidapp.R;
import com.example.androidapp.controller.CreateFile;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import static android.content.Context.MODE_PRIVATE;

public class GetUsers extends AsyncTask<String, Void, String> {

    public interface AsyncResponse {
        void processFinish(String output);
    }
    public AsyncResponse delegate = null;

    @Override
    protected String doInBackground(String... strings) {
        StringBuilder json = new StringBuilder();
        try {
            // Set a url as a variable
            URL url = new URL(strings[0]);
            // Create and open the connection
            URLConnection connection = url.openConnection();
            // Create the input stream for the reader
            InputStreamReader inputStrm = new InputStreamReader(connection.getInputStream());
            // Create a buffered reader
            BufferedReader reader = new BufferedReader(inputStrm);
            String inputLine;
            // While loop to read each line of web page data
            while ((inputLine = reader.readLine()) != null) {
                json.append(inputLine);
            }
            // Close the reader to not tie up resources
            reader.close();
        } catch (MalformedURLException e) {
            Log.d("malfunction", e.getMessage());
        } catch (IOException e) {
            Log.d("An I/O error occur", e.getMessage());
        }
        return json.toString();
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        try {
            Object obj = new JSONParser().parse(s);
            JSONArray jsonArray = new JSONArray();
            jsonArray.put(obj);
            JSONObject jsObject = new JSONObject();
            try {
                jsObject.put("name", jsonArray);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            JsonObject jsonObject = new Gson().fromJson(String.valueOf(jsObject), JsonObject.class);
            Gson gson = new GsonBuilder().create();
            String text = jsonObject.toString();

            text = gson.toJson(jsonObject);

            Log.d("names", obj.toString());

            new CreateFile(jsonArray.toString());
            //delegate.processFinish(text);

        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        Gson gson = new Gson();
        User[] users = gson.fromJson(s, User[].class);
        for (User user: users) {
            if (user != null) {
                Log.d("users", user.getName() + user.getEmail());
            }
        }
        Log.d("json", s);
        delegate.processFinish(s);*/
    }
}
