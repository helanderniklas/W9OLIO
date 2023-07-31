package com.example.w9olio;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.EditText;
import android.content.Intent;
import android.net.Uri;
import android.widget.ImageView;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Uri selectedImageUri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        Button submit = findViewById(R.id.submit);
        Button changeView = findViewById(R.id.seeusers);
        EditText firstname = findViewById(R.id.firstname);
        EditText lastname = findViewById(R.id.surname);
        EditText email = findViewById(R.id.email);
        Button addImage = findViewById(R.id.uploadimg);

        RadioGroup radioGroup = findViewById(R.id.btngroup);
        RadioButton rb1, rb2, rb3, rb4;
        rb1 = findViewById(R.id.tite);
        rb2 = findViewById(R.id.tuta);
        rb3 = findViewById(R.id.late);
        rb4 = findViewById(R.id.sahko);

        int selectedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        RadioButton selectedRadioButton = findViewById(selectedRadioButtonId);

        addImage.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent gallery = new Intent(Intent.ACTION_PICK);
                gallery.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(gallery, 1000);
            }
        });

        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String first = firstname.getText().toString();
                String last = lastname.getText().toString();
                String userEmail = email.getText().toString();
                int selectedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                RadioButton selectedRadioButton = findViewById(selectedRadioButtonId);
                String degreeProgram = selectedRadioButton.getText().toString();

                UserStorage.getInstance().addUser(first, last, userEmail, degreeProgram, selectedImageUri);
            }
        });



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        selectedImageUri = data.getData();
    }


    public void switchtoListStudents(View view){
        Intent intent = new Intent(MainActivity.this, ShowStudentsActivity.class);
        startActivity(intent);
    }
}