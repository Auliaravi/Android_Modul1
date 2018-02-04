package com.tugas.auliaravi.studycase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText MasukanNamaMakanan;
    private EditText MasukanJumlahPorsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MasukanNamaMakanan = (EditText) findViewById(R.id.inputmenu);
        MasukanJumlahPorsi = (EditText) findViewById(R.id.inputporsi);

    }

    public void Launcheatbus(View view) {
        String InputNamaMakanan = MasukanNamaMakanan.getText().toString();
        String InputJumlahPorsi = MasukanJumlahPorsi.getText().toString();

        Intent intent = new Intent(this, Main2Activity.class);

        intent.putExtra("Menu",InputNamaMakanan);
        intent.putExtra("Porsi",InputJumlahPorsi);
        intent.putExtra("Harga","50000");
        intent.putExtra("Restaurant","EatBus");

        startActivity(intent);
    }

    public void Launchabnormal(View view) {
        String InputNamaMakanan = MasukanNamaMakanan.getText().toString();
        String InputJumlahPorsi = MasukanJumlahPorsi.getText().toString();

        Intent intent = new Intent(this, Main2Activity.class);

        intent.putExtra("Menu",InputNamaMakanan);
        intent.putExtra("Porsi",InputJumlahPorsi);
        intent.putExtra("Harga","30000");
        intent.putExtra("Restaurant","Abnormal");

        startActivity(intent);
    }
}
