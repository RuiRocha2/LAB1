package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AT1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_at1);

        Button buttonAtividade2 = findViewById(R.id.button); // Reference the button
        buttonAtividade2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AT1.this, AT2.class); // Create an Intent for AT2
                startActivity(intent); // Start the AT2 activity
            }
        });
    }
}
