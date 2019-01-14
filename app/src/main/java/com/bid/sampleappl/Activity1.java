package com.bid.sampleappl;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {
    EditText etName;
    EditText etAge;
    RadioButton btMale;
    RadioButton btFamale;
    EditText etMail;
    CheckBox cb1;
    CheckBox cb2;
    CheckBox cb3;
    CheckBox cb4;


    EditText etAddress;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        etName= (EditText)findViewById(R.id.et_name);
        etAge=(EditText)findViewById(R.id.et_Age);
        btMale=(RadioButton) findViewById(R.id.male_check);
        btFamale=(RadioButton)findViewById(R.id.female_check);
        etMail=(EditText)findViewById(R.id.et_id);
        etAddress=(EditText)findViewById(R.id.et_address);
        cb1=findViewById(R.id.cb_coding);
        cb2=findViewById(R.id.cb_dancing);
        cb3=findViewById(R.id.cb_food);
        cb4=findViewById(R.id.cb_reading);

    }
    public void onButtonClick(View view){
        String name=etName.getText().toString();
        String age=etAge.getText().toString();
        String mail=etMail.getText().toString();
        String address=etAddress.getText().toString();
        String gender="";
        String hobbies="";
        if(btMale.isChecked())
            gender="Male";
        else gender="Female";
        if(cb1.isChecked())
            hobbies+=cb1.getText().toString()+" ";
        if(cb2.isChecked())
            hobbies+=cb2.getText().toString()+" ";
        if(cb3.isChecked())
            hobbies+=cb3.getText().toString()+" ";
        if(cb4.isChecked())
            hobbies+=cb4.getText().toString()+" ";

        Toast.makeText(this,"Name:"+name+"\nAge:"+age+"\n Mail:"+mail+"\n Gender:"+gender+"\n Address:"+address+"\n Hobbies:"+hobbies,Toast.LENGTH_LONG).show();
        Intent i= new Intent(this,Activity2.class);
        i.putExtra("key1",name);
        i.putExtra("key2",age);
        i.putExtra("key3",mail);
        i.putExtra("key4",address);
        i.putExtra("key5",gender);
        startActivity(i);
    }
    public void onActivitySwitch(View view){
        Intent j= new Intent(this,Activity2.class);
        startActivity(j);
    }
    public void onCameraClick(View view){
        Intent i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(i);
    }
}
