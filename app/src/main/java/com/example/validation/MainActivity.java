package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public EditText name,email,phone,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        password = findViewById(R.id.password);

        findViewById(R.id.signUpbtn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.signUpbtn:
                signup();
                break;
        }




    }

    private void signup() {
       String Name= name.getText().toString().trim();
       String Email= email.getText().toString().trim();
       String Phone=phone.getText().toString().trim();
       String Password= password.getText().toString().trim();

       if (Name.isEmpty()){

           name.setError("Name is Emty");
           name.requestFocus();
           return;
       }

       if (Email.isEmpty()){
           email.setError("Alamin is emty");
           email.requestFocus();
           return;
       }
       if (!Patterns.EMAIL_ADDRESS.matcher(Email).matches()){
           email.setError("Not matches Email");
           email.requestFocus();
           return;
       }
       if (Password.isEmpty()){
           password.setError("sdfasd");
           password.requestFocus();
           return;
       }
       if (Password.length()<=8){
           password.setError("No password");
           password.requestFocus();
           return;

       }

    }
}
