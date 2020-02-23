package com.john.jmusicstore.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.john.jmusicstore.MainActivity;
import com.john.jmusicstore.R;
import com.john.jmusicstore.api.UserAPI;
import com.john.jmusicstore.model.User;
import com.john.jmusicstore.server_response.SignUpResponse;
import com.john.jmusicstore.url.URL;

import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {

    private TextView login_text;
    private EditText etName, etEmail, etPhoneNumber, etSMSCode, etPasswordRegister;
    private Button btnSendSMS, btnSignUp;

    Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_register);

        etSMSCode = findViewById(R.id.etSMSCode);
        etPhoneNumber = findViewById(R.id.etPhoneNumber);
        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPasswordRegister = findViewById(R.id.etPasswordRegister);
        btnSendSMS = findViewById(R.id.btnSendSMS);
        btnSignUp = findViewById(R.id.btnSignUp);

        login_text = findViewById(R.id.login_text);



    }
}
