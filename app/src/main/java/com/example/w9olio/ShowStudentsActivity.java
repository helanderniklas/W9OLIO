package com.example.w9olio;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.widget.TextView;
import java.util.List;

public class ShowStudentsActivity extends AppCompatActivity {

    private UserStorage userStorage;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_students);

        userStorage = UserStorage.getInstance();
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new UserListAdapter(getApplicationContext(), userStorage.GetUsers()));
    }

    public void switchtoAddStudents(View view){
        Intent intent = new Intent(ShowStudentsActivity.this, MainActivity.class);
        startActivity(intent);
    }
}