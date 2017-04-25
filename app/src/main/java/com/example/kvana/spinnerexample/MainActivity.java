package com.example.kvana.spinnerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Array;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner spinner;
    AutoCompleteTextView acTextView;
    String[] countries={"Afghanistan","Albania","Andorra","Iceland","India","Iran","Iraq"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner= (Spinner) findViewById(R.id.days_spinner);
       ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.days,android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        acTextView= (AutoCompleteTextView) findViewById(R.id.actextview);
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.select_dialog_item,countries);
        acTextView.setThreshold(1);
        acTextView.setAdapter(arrayAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView myText=(TextView)view;
        Toast.makeText(this,"you Selected "+myText.getText(),Toast.LENGTH_LONG).show();git
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
