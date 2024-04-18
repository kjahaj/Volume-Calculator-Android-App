package com.example.kleijahajtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cylinder extends AppCompatActivity {

    EditText radius;
    EditText height;
    TextView title, result;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        radius = findViewById(R.id.editText_Cylinder);
        height = findViewById(R.id.editText_Cylinderh);
        title = findViewById(R.id.textView2);
        result = findViewById(R.id.textView3);
        btn = findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String base1 = radius.getText().toString();
                String height1 = height.getText().toString();

                int r = Integer.parseInt(base1);
                int h = Integer.parseInt(height1);


                double volume = 3.14 * r*r*h;
                result.setText("V = "+volume+" m^3");
            }
        });
    }
}
