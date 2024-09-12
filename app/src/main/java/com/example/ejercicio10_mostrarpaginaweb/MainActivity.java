package com.example.ejercicio10_mostrarpaginaweb;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.ejercicio10_mostrarpaginaweb.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnVer.setOnClickListener(v -> {
            String url = binding.direccion.getText().toString();
            Intent intent = new Intent(MainActivity.this, WebActivity.class);
            intent.putExtra("URL", url);
            startActivity(intent);
        });
    }
}