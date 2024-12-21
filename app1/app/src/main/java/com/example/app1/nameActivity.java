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

import java.util.jar.Attributes;

public class nameActivity extends AppCompatActivity {
    EditText etname;
    Button btnclick;
    TextView tvname;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_name);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        etname=findViewById(R.id.etname);
        btnclick=findViewById(R.id.btnclick);
        tvname=findViewById(R.id.tvname);

        btnclick.setOnClickListener(v -> {
            String name=etname.getText().toString();
            tvname.setText("The Name is:-"+name);
            Toast.makeText(this,name, Toast.LENGTH_SHORT).show();
        });
    }
}