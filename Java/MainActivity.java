package com.example.explicitintent;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btnExplicit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        btnExplicit = findViewById(R.id.btnExplicit);

        btnExplicit.setOnClickListener(v -> {

            String message = editText.getText().toString();

            Intent intent = new Intent(
                    MainActivity.this,
                    SecondActivity.class
            );

            intent.putExtra("MESSAGE", message);

            startActivity(intent);
        });
    }
}
