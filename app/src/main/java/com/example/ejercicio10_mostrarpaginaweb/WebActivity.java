package com.example.ejercicio10_mostrarpaginaweb;

import android.os.Bundle;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.ejercicio10_mostrarpaginaweb.databinding.ActivityWebBinding;

public class WebActivity extends AppCompatActivity {
    private ActivityWebBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWebBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Configura el WebView
        binding.webview.getSettings().setJavaScriptEnabled(true);
        binding.webview.setWebViewClient(new WebViewClient());

        // Obtener la URL de la intención
        String url = getIntent().getStringExtra("URL");
        if (url != null) {
            binding.webview.loadUrl(url);
        }
    }
}