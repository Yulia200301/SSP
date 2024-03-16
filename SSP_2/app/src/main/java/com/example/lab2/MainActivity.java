package com.example.lab2;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editText;
    private Button btnA;
    private Button btnB;
    private Button btnSpace;
    private Button btnDel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editText = findViewById(R.id.editText);
        btnA = findViewById(R.id.btnA);
        btnB = findViewById(R.id.btnB);
        btnSpace = findViewById(R.id.btnSpace);
        btnDel= findViewById(R.id.btnDel);

        btnA.setOnClickListener(this);
        btnB.setOnClickListener(this);
        btnSpace.setOnClickListener(this);
        btnDel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == btnA.getId()){
            editText.append("A");
            Toast tost = Toast.makeText(getApplicationContext(), R.string.btnA, Toast.LENGTH_SHORT);
            tost.show();
        }
        if(view.getId() == btnB.getId()){
            editText.append("B");
            Toast tost = Toast.makeText(getApplicationContext(), R.string.btnB, Toast.LENGTH_SHORT);
            tost.show();
        }
        if(view.getId() == btnSpace.getId()){
            editText.append(" ");
            Toast tost = Toast.makeText(getApplicationContext(), R.string.bntSpace, Toast.LENGTH_SHORT);
            tost.show();
        }
        if(view.getId() == btnDel.getId()){
            String currentText = String.valueOf(editText.getText());
            if (!currentText.isEmpty()) {
                String updatedText = currentText.substring(0, currentText.length() - 1);
                editText.setText(updatedText);
            }
            Toast tost = Toast.makeText(getApplicationContext(), R.string.btnDel, Toast.LENGTH_SHORT);
            tost.show();
        }
    }
}