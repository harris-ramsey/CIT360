package com.example.androidapp.controller;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.FragmentActivity;

import com.example.androidapp.MainActivity;
import com.example.androidapp.model.GetUsers;

import org.json.JSONArray;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

import static android.content.Context.MODE_PRIVATE;

public class CreateFile extends Activity {
//implements GetUsers.AsyncResponse
    private static final String FILE_NAME = "userlist.txt";
    FileInputStream fileInputStream = null;

    Context context = MainActivity.getContext();
    ListView listView;

    public CreateFile(String text) throws IOException {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = context.getApplicationContext().openFileOutput(FILE_NAME, MODE_PRIVATE);
            fileOutputStream.write(text.getBytes());
            Toast.makeText(context.getApplicationContext(), "Saved to " + context.getFilesDir() + "/" + FILE_NAME, Toast.LENGTH_LONG).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                    Log.d("TAG", "processFinish: ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        /*
        try {
            fileInputStream = context.openFileInput(FILE_NAME);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder stringBuilder = new StringBuilder();
            String inText;

            while ((inText = bufferedReader.readLine()) != null) {
                stringBuilder.append(inText).append("\n");
            }
            Log.d("textLoaded", stringBuilder.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        }*/
    }


    }

