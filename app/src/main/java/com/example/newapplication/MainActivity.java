package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button textbutton = (Button) findViewById(R.id.textbutton);
        textbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preregistration();

            }
        });

    }
    public void preregistration(){
        Intent intent=new Intent(this, registerbutton.class);
        startActivity(intent);
    }
}
