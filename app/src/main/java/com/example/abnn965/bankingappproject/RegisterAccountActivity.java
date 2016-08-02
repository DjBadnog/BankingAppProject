package com.example.abnn965.bankingappproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterAccountActivity extends AppCompatActivity {

    private Button submit;
    private EditText name;
    private EditText surname;
    private EditText identityNumber;
    private EditText email;
    private EditText phoneNumber;
    private EditText address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_account);

        submit = (Button) findViewById(R.id.btnSubmitPersonalDetails);
        name = (EditText)findViewById(R.id.edtName);
        surname = (EditText)findViewById(R.id.edtSurname);
        email = (EditText)findViewById(R.id.edtEmail);
        phoneNumber = (EditText)findViewById(R.id.edtPhoneNumber);
        address = (EditText)findViewById(R.id.edtPostalAddress);
    }

}
