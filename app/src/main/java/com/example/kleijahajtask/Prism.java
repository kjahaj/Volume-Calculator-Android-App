package com.example.kleijahajtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prism extends AppCompatActivity {

    EditText base;
    EditText height;
    TextView title, result;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);

        base = findViewById(R.id.editText_Prism);
        height = findViewById(R.id.editText_Prismh);
        title = findViewById(R.id.textView2);
        result = findViewById(R.id.textView3);
        btn = findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String base1 = base.getText().toString();
                String height1 = height.getText().toString();

                int b = Integer.parseInt(base1);
                int h = Integer.parseInt(height1);


                double volume = b*h;
                result.setText("V = "+volume+" m^3");
            }
        });
    }
}
