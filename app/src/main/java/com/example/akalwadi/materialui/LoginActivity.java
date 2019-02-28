package com.example.akalwadi.materialui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    public EditText edtemail, edtpassword;
    public TextView tvwregister;
    public Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtemail = (EditText) findViewById(R.id.editText6);
        edtpassword = (EditText) findViewById(R.id.editText8);

        tvwregister = (TextView) findViewById(R.id.textView10);

        tvwregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });

        btnlogin = (Button) findViewById(R.id.button2);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((edtemail.getText().toString().matches("") && (edtpassword.getText().toString()).matches(""))){
                    Toast.makeText(LoginActivity.this, "Please enter credentials", Toast.LENGTH_SHORT).show();
                }else{
                    startActivity(new Intent(LoginActivity.this, MainScreen.class));
                }
            }
        });
    }
}
