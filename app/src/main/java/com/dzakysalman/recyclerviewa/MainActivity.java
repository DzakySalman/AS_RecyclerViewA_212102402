package com.dzakysalman.recyclerviewa;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView _recyclerView1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _recyclerView1 = (RecyclerView)findViewById(R.id.recyclerView1);

        List<NegaraModel> negaraModelList = new ArrayList<>();

        NegaraModel nm = new NegaraModel();
        nm.setNama("Albania");
        nm.setDeskripsi("Negara di Balkan dengan ibu kota Tirana.");
        nm.setUrl("https://icons.iconarchive.com/icons/wikipedia/flags/256/AL-Albania-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Japan");
        nm.setDeskripsi("Negara Asia Timur, terkenal dengan budaya dan teknologi.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/256/Japan-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Indonesia");
        nm.setDeskripsi("Negara kepulauan terbesar di Asia Tenggara dengan ribuan pulau.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/256/Indonesia-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Canada");
        nm.setDeskripsi("Negara di Amerika Utara dengan luas terbesar kedua.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/256/Canada-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Cina");
        nm.setDeskripsi("Negara terbesar di Asia Timur dengan populasi terbesar.");
        nm.setUrl("https://icons.iconarchive.com/icons/hopstarter/flag-borderless/256/China-icon.png");
        negaraModelList.add(nm);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(MainActivity.this);
        _recyclerView1.setLayoutManager(lm);

        NegaraAdapter na = new NegaraAdapter(getApplicationContext(), negaraModelList);
        _recyclerView1.setAdapter(na);

    }
}