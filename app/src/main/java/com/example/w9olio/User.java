package com.example.w9olio;

import android.net.Uri;

public class User {
    private  String firstname;
    private  String lastname;
    private  String email;
    private  String degreeProgram;
    private  Uri img;

    public User(String firstname, String lastname, String email, String degreeProgram, Uri img) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.degreeProgram = degreeProgram;
        this.img = img;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public Uri getImg(){ return img; }

}