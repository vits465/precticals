package com.example.app1;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class calcActivity extends AppCompatActivity {
    EditText etno1;
    EditText etno2;
    Button btnplus;
    Button btnminus;
    Button btnmultiply;
    Button btndivide;
    TextView tvresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calc);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        etno1=findViewById(R.id.etno1);
        etno2=findViewById(R.id.etno2);
        btnplus=findViewById(R.id.btnplus);
        btnminus=findViewById(R.id.btnminus);
        btnmultiply=findViewById(R.id.btnmultiply);
        btndivide=findViewById(R.id.btndivide);
        tvresult=findViewById(R.id.tvresult);

        btnplus.setOnClickListener(v -> {
            String strno1=etno1.getText().toString();
            String strno2=etno2.getText().toString();

            if (TextUtils.isEmpty(strno1)){
                Toast.makeText(this, "enter no1", Toast.LENGTH_SHORT).show();
                etno1.setError("please enter no1");
            } else if (TextUtils.isEmpty(strno2)) {
                Toast.makeText(this, "enter no2", Toast.LENGTH_SHORT).show();
                etno2.setError("please enter no1");
            }else {
                int i=Integer.parseInt(strno1);
                int j=Integer.parseInt(strno2);
                int RESULT=i+j;
                tvresult.setText(RESULT+"");


            }
        });



        btnminus.setOnClickListener(v -> {
            String strno1=etno1.getText().toString();
            String strno2=etno2.getText().toString();

            if (TextUtils.isEmpty(strno1)){
                Toast.makeText(this, "enter no1", Toast.LENGTH_SHORT).show();
                etno1.setError("please enter no1");
            } else if (TextUtils.isEmpty(strno2)) {
                Toast.makeText(this, "enter no2", Toast.LENGTH_SHORT).show();
                etno2.setError("please enter no1");
            }else {
                int i=Integer.parseInt(strno1);
                int j=Integer.parseInt(strno2);
                int RESULT=i-j;
                tvresult.setText(RESULT+"");


            }
        });


        btnmultiply.setOnClickListener(v -> {
            String strno1=etno1.getText().toString();
            String strno2=etno2.getText().toString();

            if (TextUtils.isEmpty(strno1)){
                Toast.makeText(this, "enter no1", Toast.LENGTH_SHORT).show();
                etno1.setError("please enter no1");
            } else if (TextUtils.isEmpty(strno2)) {
                Toast.makeText(this, "enter no2", Toast.LENGTH_SHORT).show();
                etno2.setError("please enter no1");
            }else {
                int i=Integer.parseInt(strno1);
                int j=Integer.parseInt(strno2);
                int RESULT=i*j;
                tvresult.setText(RESULT+"");


            }
        });


        btndivide.setOnClickListener(v -> {
            String strno1=etno1.getText().toString();
            String strno2=etno2.getText().toString();

            if (TextUtils.isEmpty(strno1)){
                Toast.makeText(this, "enter no1", Toast.LENGTH_SHORT).show();
                etno1.setError("please enter no1");
            } else if (TextUtils.isEmpty(strno2)) {
                Toast.makeText(this, "enter no2", Toast.LENGTH_SHORT).show();
                etno2.setError("please enter no1");
            }else {
                int i=Integer.parseInt(strno1);
                int j=Integer.parseInt(strno2);
                int RESULT=i/j;
                tvresult.setText(RESULT+"");


            }
        });
    }
}