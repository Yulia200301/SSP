package com.example.my_application_ssp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.Toast;

public class AboutAuthor extends AppCompatActivity {

    private CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_author);

        checkBox = findViewById(R.id.checkBox1);

    }
    public boolean onCreateOptionsMenu(Menu menu){
        menu.add(0,3,0,"Вернуться");
        menu.add(0,4,0,"Выход");
        menu.add(0,5,0,"Секретно!!!!!");

        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()== 3){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        else if(item.getItemId()== 4){
            this.finish();
        }
        else if(item.getItemId()== 5){
            Toast tost = Toast.makeText(getApplicationContext(), R.string.secretno, Toast.LENGTH_SHORT);
            tost.show();
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onPrepareOptionsMenu(Menu menu){
        MenuItem sekret = menu.findItem(5);
        if(checkBox.isChecked()){
            sekret.setVisible(true);
        }
        else{
            sekret.setVisible(false);
        }
        return super.onPrepareOptionsMenu(menu);
    }

}