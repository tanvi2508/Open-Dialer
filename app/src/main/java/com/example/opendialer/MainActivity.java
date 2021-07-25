package com.example.opendialer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void call(View v){
        EditText e=(EditText)findViewById(R.id.editPhone);
        Toast.makeText(MainActivity.this,"clicked",Toast.LENGTH_LONG).show();

        // Use format with "tel:" and phoneNumber created is
        // stored in u.

        Uri uri= Uri.parse("tel:"+e.getText().toString());
        Intent i=new Intent(Intent.ACTION_DIAL,uri);

        try {
            startActivity(i);
        }
        catch (SecurityException securityException){
            Toast.makeText(MainActivity.this,"An error occured",Toast.LENGTH_LONG).show();
        }

    }
}