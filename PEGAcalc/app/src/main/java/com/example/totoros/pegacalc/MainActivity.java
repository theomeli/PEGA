package com.example.totoros.pegacalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends Activity {

    private EditText num1;
    private EditText num2;
    private TextView txtResult;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> list = new ArrayList<String>();
        list.add("+");
        list.add("-");
        list.add("*");
        list.add("/");

        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);
        txtResult = (TextView)findViewById(R.id.textView);
        spinner = (Spinner)findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,list);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void calculate(View view) {
        String praksi = spinner.getSelectedItem().toString();
        float result;
        if(praksi.equals("+")) {
            result = Float.parseFloat(num1.getText().toString()) + Float.parseFloat(num2.getText().toString());
        }
        else if(praksi.equals("-")) {
            result = Float.parseFloat(num1.getText().toString()) - Float.parseFloat(num2.getText().toString());
        }
        else if(praksi.equals("*")) {
            result = Float.parseFloat(num1.getText().toString()) * Float.parseFloat(num2.getText().toString());
        }
        else {
            result = Float.parseFloat(num1.getText().toString()) / Float.parseFloat(num2.getText().toString());
        }
        txtResult.setText(Float.toString(result));
    }

}