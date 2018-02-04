package com.tugas.auliaravi.studycase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        String MenuShow = intent.getStringExtra("Menu");
        String PorsiShow= intent.getStringExtra("Porsi");
        String RestaurantShow= intent.getStringExtra("Restaurant");
        String HargaMakanan = intent.getStringExtra("Harga");

        int TotalHargaMakanan = Integer.valueOf(PorsiShow)*Integer.valueOf(HargaMakanan);

        TextView Menu = (TextView) findViewById(R.id.makanan_show);
        TextView Porsi = (TextView) findViewById(R.id.jumlah_porsi);
        TextView Tempat = (TextView) findViewById(R.id.restaurant_show);
        TextView Harga = (TextView) findViewById(R.id.harga_show);

        Menu.setText  (MenuShow);
        Porsi.setText(PorsiShow);
        Tempat.setText(RestaurantShow);
        Harga.setText(String.valueOf(TotalHargaMakanan));

        if(TotalHargaMakanan >65500){
            Toast toast = Toast.makeText(this,"Uang tidak cukup",Toast.LENGTH_LONG);
            toast.show();
        }else{
            Toast toast = Toast.makeText(this,"Uang anda cukup",Toast.LENGTH_LONG);
            toast.show();
        }

    }
}