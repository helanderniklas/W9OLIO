package com.example.w9olio;

import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {

    TextView txtUserName,txtUserProgramField, txtUserEmail;
    ImageView userImage;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        userImage = itemView.findViewById(R.id.userImage);
        txtUserName = itemView.findViewById(R.id.txtUserName);
        txtUserProgramField = itemView.findViewById(R.id.txtUserProgramField);
        txtUserEmail = itemView.findViewById(R.id.txtUserEmail);
    }
}