package com.bvrith.prathyusha.parsejson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button instaButton = findViewById(R.id.instagramButton);
        Button googleButton = findViewById(R.id.googleButton);
        Button facebookButton = findViewById(R.id.facebookButton);
        ed = findViewById(R.id.ed1);



        instaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)  {
                final String x = ed.getText().toString();
                Toast.makeText(MainActivity.this,"Hello Instagram",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, InstaScreen.class);
                i.putExtra("x", x);
                startActivity(i);
            }
        });
        googleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Hello Google",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, GoogleScreen.class);
                startActivity(i);
            }
        });
        facebookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Hello Facebook",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this,FacebookScreen.class);
                startActivity(i);
            }
        });

        //System.out.println();
       // Toast.makeText(this,"HelloWorld",Toast.LENGTH_LONG).show();

    }
}
