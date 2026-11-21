package com.example.kalkulatorpodrozy;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText EtDist, EtFuel, EtPas;
    RadioGroup RgType;
    TextView TvCost, TvPerPers;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            btn = findViewById(R.id.btn);

            EtDist = findViewById(R.id.EtDist);
            EtFuel = findViewById(R.id.EtFuel);
            EtPas = findViewById(R.id.EtPas);

            RgType = findViewById(R.id.RgType);

            TvCost = findViewById(R.id.TvCost);
            TvPerPers = findViewById(R.id.TvPerPers);


            btn.setOnClickListener(view -> {



            });

            return insets;
        });
    }
}