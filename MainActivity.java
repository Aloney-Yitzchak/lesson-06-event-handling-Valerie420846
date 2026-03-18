package com.example.eventhandlingapp;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName; 
    private Button btnGreet;      
    private Button btnClear;      
    private TextView textViewResult; 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.etStatus);
        btnGreet     = findViewById(R.id.btnSave);
        btnClear     = findViewById(R.id.btnReset);
        textViewResult = findViewById(R.id.tvCounter);


        btnGreet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();

                if (name.isEmpty()) {
                    textViewResult.setText("נא להזין שם!");
                    textViewResult.setTextColor(Color.RED);
                } else {
                    textViewResult.setText("שלום, " + name + "! ברוך הבא!");
                    textViewResult.setTextColor(Color.BLUE);
                }
            }
        });


        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextName.setText("");
                
            
                textViewResult.setText("");
            }
        });
    }
}
