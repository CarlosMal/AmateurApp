package com.cmb.carlosmal.amateurapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtFacebookLogin = (TextView) findViewById(R.id.txt_facebook_login);
        TextView txtGuestLogin = (TextView) findViewById(R.id.txt_guest_login);


        txtFacebookLogin.setOnClickListener(this);
        txtGuestLogin.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        switch(view.getId()) {
            case R.id.txt_facebook_login:
                Toast.makeText(this, "este es el facebook login", Toast.LENGTH_SHORT).show();
                break;
            case R.id.txt_guest_login:
                Toast.makeText(this, "este es el invitado", Toast.LENGTH_SHORT).show();
                break;
        }

    }



}
