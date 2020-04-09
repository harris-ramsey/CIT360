package com.example.androidapp.model;

import android.widget.EditText;

public class NewUser {

    private String fName;
    private String lName;
    private String email;
    private int phone;

    public NewUser(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public NewUser() {
        fName = null;
        lName = null;
    }

    public String getfName() {
        return String.valueOf(fName);
    }

    public void setfName(EditText fName) {
        this.fName = String.valueOf(fName);
    }

    public String getlName() {
        return lName;
    }

    public void setlName(EditText lName) {
        this.lName = String.valueOf(lName);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(EditText email) {
        this.email = String.valueOf(email);
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

}
