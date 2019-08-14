package kr.co.ajou.lalulintasforecast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    TextView articleLok;
    TextView articleFeatures;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        //Paragraph Text View

        articleLok = (TextView) findViewById(R.id.articleLok);
        articleLok.setText("1. Isikan lokasi anda dan lokasi tujuan  \n 2. Tentukan Waktu yang ingin anda Prediksi \n " +
                "3. Klik tombol ok bila anda sudah mengisi semua field \n 4. Klik tombol Cancel untuk kembali ke menu Utama");

        articleFeatures = (TextView) findViewById(R.id.articleFeatures);
        articleFeatures.setText("Pada Aplikasi ini terdapat 3 Menu, yaitu : \n 1. Set Distance \n " +
                "\n Pada Menu ini anda dapat mempredisksi waktu tempuh pada jam dan hari berikutnya " +
                "\n 2. Help" +
                "\n anda dapa melihat petunjuk penggunaan aplikasi dan Menu-Menu yang tersedia" +
                "\n 3. About" +
                "\n anda dapat mengetahui versi pembuatan aplikasi, profile perancang aplikasi, link source code pada git.");
    }
}
