package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText nameText = findViewById(R.id.nameField);
                String name = nameText.getText().toString();

                EditText emailText = findViewById(R.id.emailField);
                String email = emailText.getText().toString();

                EditText passwordText = findViewById(R.id.passwordField);
                String password = passwordText.getText().toString();

                EditText confirmText = findViewById(R.id.confirmField);
                String confirm = confirmText.getText().toString();

                if(name.equals("") || email.equals("") || password.equals("") || confirm.equals("")) {
                    Toast.makeText(FormActivity.this, "Must fill in all fields", Toast.LENGTH_LONG).show();
                } else if(!password.equals(confirm)) {
                    Toast.makeText(FormActivity.this, "Error: Passwords do not match", Toast.LENGTH_LONG).show();
                } else {
                    String display = "Welcome, " + name + ", to the SignUpForm App";
                    Toast.makeText(FormActivity.this, display, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
