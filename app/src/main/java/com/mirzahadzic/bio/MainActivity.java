package com.mirzahadzic.bio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText enterHobbies;
    private TextView hobbies;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        enterHobbies = findViewById(R.id.enter_hobbies);
        hobbies=findViewById(R.id.hobbies_text);



    }

    public void addHobbiesMethod(View view) {
        hobbies.setText("Hobbies:  " + enterHobbies.getText().toString().trim());
        hobbies.setVisibility(View.VISIBLE);

        //Sakrivanje tastature nakon klika na dugme - genericka metoda koja se moze koristiti stalno

        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(),0);

    }
}