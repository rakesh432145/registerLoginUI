package com.example.akalwadi.materialui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    public EditText etname, etusername, etemail, etpassword, etrepassword;
    public TextView tvemail;
    public Button btnreg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etname = (EditText) findViewById(R.id.editText);
        etusername = (EditText) findViewById(R.id.editText2);
        etemail = (EditText) findViewById(R.id.editText5);
        etpassword = (EditText) findViewById(R.id.editText3);
        etrepassword = (EditText) findViewById(R.id.editText4);

        tvemail = (TextView) findViewById(R.id.textView4);

        tvemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            }
        });

        btnreg = (Button) findViewById(R.id.button);

        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((etname.getText().toString()).matches("") && (etusername.getText().toString()).matches("") && (etemail.getText().toString()).matches("") && (etpassword.getText().toString()).matches("") && (etrepassword.getText().toString()).matches("")){
                    Toast.makeText(RegisterActivity.this, "All Details are mandatory", Toast.LENGTH_SHORT).show();
                }
                else if(etpassword.getText().toString().matches(etrepassword.getText().toString())){
                    Toast.makeText(RegisterActivity.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(RegisterActivity.this, MainScreen.class));
                }else{
                    Toast.makeText(RegisterActivity.this, "Both passwords should match", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
