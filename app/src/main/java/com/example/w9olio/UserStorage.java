package com.example.w9olio;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class UserStorage {

    static ArrayList<User> users = new ArrayList<>();
    private static UserStorage usersStorage = null;

    public static UserStorage getInstance(){
        if(usersStorage == null) {
            usersStorage = new UserStorage();
        }
        return usersStorage;

    }

    public static void addUser(String firstname, String lastname, String email, String degreeProgram, Uri img){
        users.add(new User(firstname, lastname, email, degreeProgram, img));
    }
    public ArrayList<User> GetUsers(){
        return users;
    }
}