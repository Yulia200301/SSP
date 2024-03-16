package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.Toast;

public class authorActivity extends AppCompatActivity {

    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        menu.add(0,1,0,"return");
        menu.add(0,2,0,"exit");
        menu.add(0,3,0,"secretmenu");
        //getMenuInflater().inflate(R.menu.authormenu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        if(item.getItemId() == 1){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        else if (item.getItemId() == 2){
            this.finish();
        }
        else if (item.getItemId() == 3){
            Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onPrepareOptionsMenu(Menu menu){
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        MenuItem secretItem = menu.findItem(3);
        if(checkBox.isChecked()){
            secretItem.setVisible(true);
        } else{
            secretItem.setVisible(false);
        }
        return super.onPrepareOptionsMenu(menu);
    }
}