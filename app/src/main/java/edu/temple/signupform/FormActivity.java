package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.saveButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText usernameField = findViewById(R.id.usernameField);
                EditText emailField = findViewById(R.id.emailField);
                EditText passField = findViewById(R.id.passwordField);
                EditText passConfField = findViewById(R.id.passwordConfirmField);

                if(     usernameField.getText().length() <= 0 ||
                        emailField.getText().length() <= 0 ||
                        passField.getText().length() <= 0 ||
                        passConfField.getText().length() <= 0)
                {
                    // display error
                }
                else{
                    Toast.makeText(FormActivity.this, passField.getText(), Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
