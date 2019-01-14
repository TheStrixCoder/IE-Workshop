package com.bid.sampleappl;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    EditText etNum1;
    EditText etNum2;
    TextView res;
    Spinner spinner;
    String[] items={"+","-","*","/"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        etNum1=findViewById(R.id.num1);
        etNum2=findViewById(R.id.num2);
        res=findViewById(R.id.result);
        spinner=findViewById(R.id.spinnerOperator);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Activity2.this,
                android.R.layout.simple_spinner_item,items);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }

    public void calculateBtn(View view) {
        char operator=spinner.getSelectedItem().toString().charAt(0);
        int num1=Integer.parseInt(etNum1.getText().toString());
        int num2=Integer.parseInt(etNum2.getText().toString());
        Log.e("Error::::::","value "+operator);
        switch (operator)
        {
            case '+':
                int sum=num1+num2;
                Toast.makeText(Activity2.this,"The result is "+sum,Toast.LENGTH_SHORT).show();
                break;
            case '-':
                int sub=num1-num2;
                Toast.makeText(Activity2.this,"The result is "+sub,Toast.LENGTH_SHORT).show();
                break;
            case '*':
                int mul=num1*num2;
                Toast.makeText(Activity2.this,"The result is "+mul,Toast.LENGTH_SHORT).show();
                break;
            case '/':
                int div=num1/num2;
                Toast.makeText(Activity2.this,"The result is "+div,Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
