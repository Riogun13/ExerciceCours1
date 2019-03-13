package com.pierre_luc.exercice_1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private CompareNumber compareNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        compareNumber = new CompareNumber();
    }


    public void compare(View button){
        EditText editTextNumber1 = findViewById(R.id.CompareNumber1);
        EditText editTextNumber2 = findViewById(R.id.CompareNumber2);
        editTextNumber1.setBackgroundColor(android.R.drawable.editbox_background);
        editTextNumber2.setBackgroundColor(android.R.drawable.editbox_background);
        CompareNumber.compareState compareState = compareNumber.testNumber(Integer.parseInt(editTextNumber1.getText().toString()), Integer.parseInt(editTextNumber2.getText().toString()));
        if(compareState == CompareNumber.compareState.NUMBER1){
            Toast.makeText(this,"Number 1 WIN", Toast.LENGTH_LONG).show();
            editTextNumber1.setBackgroundColor(Color.GREEN);
        }else if(compareState == CompareNumber.compareState.EQUAL){
            Toast.makeText(this,"EQUAL POWER", Toast.LENGTH_LONG).show();
        }else{
            editTextNumber2.setBackgroundColor(Color.GREEN);
            Toast.makeText(this,"Number 2 WIN", Toast.LENGTH_LONG).show();
        }

    }


}
