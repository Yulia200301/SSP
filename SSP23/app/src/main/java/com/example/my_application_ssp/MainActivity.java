package com.example.my_application_ssp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ConstraintLayout layout;
    private Button redButton;
    private Button whiteButton;
    private Button yellowButton;
    private Button greenButton;
    private Button blueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        layout = findViewById(R.id.main);
        redButton = findViewById(R.id.redButton);
        whiteButton = findViewById(R.id.whiteButton);
        yellowButton = findViewById(R.id.yellowButton);
        greenButton = findViewById(R.id.greenButton);
        blueButton = findViewById(R.id.blueButton);

        redButton.setOnClickListener(this);
        whiteButton.setOnClickListener(this);
        yellowButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);
        blueButton.setOnClickListener(this);
    }

    @Override
    public  boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()== R.id.menu_prog){
            Intent intent = new Intent(this, AboutProgram.class);
            startActivity(intent);
        }
        else if(item.getItemId()== R.id.menu_auth){
            Intent intent = new Intent(this, AboutAuthor.class);
            startActivity(intent);
        }

        else if(item.getItemId()== R.id.menu_exit){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == redButton.getId()){
            layout.setBackgroundColor(Color.RED);
            Toast tost = Toast.makeText(getApplicationContext(), R.string.redButton, Toast.LENGTH_SHORT);
            tost.show();
        }
        if(view.getId() == whiteButton.getId()){
            layout.setBackgroundColor(Color.WHITE);
            Toast tost = Toast.makeText(getApplicationContext(), R.string.whiteButton, Toast.LENGTH_SHORT);
            tost.show();
        }
        if(view.getId() == yellowButton.getId()){
            layout.setBackgroundColor(Color.YELLOW);
            Toast tost = Toast.makeText(getApplicationContext(), R.string.yellowButton, Toast.LENGTH_SHORT);
            tost.show();
        }
        if(view.getId() == greenButton.getId()){
            layout.setBackgroundColor(Color.GREEN);
            Toast tost = Toast.makeText(getApplicationContext(), R.string.greenButton, Toast.LENGTH_SHORT);
            tost.show();
        }
        if(view.getId() == blueButton.getId()){
            layout.setBackgroundColor(Color.BLUE);
            Toast tost = Toast.makeText(getApplicationContext(), R.string.blueButton, Toast.LENGTH_SHORT);
            tost.show();
        }
    }
}