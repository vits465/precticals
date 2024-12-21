package com.example.app1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class hwageActivity extends AppCompatActivity {
    TextView tvname1;
    Button btnclick;
    EditText tvtext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hwage);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
            });
        tvname1=findViewById(R.id.tvname1);
        btnclick=findViewById(R.id.btnclick);
        tvtext1=findViewById(R.id.tvtext1);

        btnclick.setOnClickListener(V -> {
            String name=tvtext1.toString();
            tvname1.setText("the age is:-"+name);
            Toast.makeText(this,name, Toast.LENGTH_SHORT).show();

        });
    }
}