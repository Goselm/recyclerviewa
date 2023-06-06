package com.steven_202102267.recyclerviewa;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    private RecyclerView _recyclerView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _recyclerView1 = (RecyclerView) findViewById(R.id.recyclerView1);
         List<NegaraModel> negaraModelList = new ArrayList<>();
         NegaraModel nm = new NegaraModel();
         nm.setNama("Albania");
         nm.setDeskripsi("Negara ini menggunakan bendera berwarna merah.");
         nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/256/Albania-Flag-icon.png");
         negaraModelList.add(nm);
         nm = new NegaraModel();
         nm.setNama("Hungary");
         nm.setDeskripsi("Negara ini bernama HUngaria dalam bahasa Indonesia.");
         nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/256/Hungary-Flag-icon.png");
         negaraModelList.add(nm);
         nm = new NegaraModel();
         nm.setNama("Slovenia");
         nm.setDeskripsi("Bendera Triwarna putih-biru-merah atau biasa dikenal sebagai warna tradisional Pan Slavia");
         nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/256/Slovenia-Flag-icon.png");
         negaraModelList.add(nm);
         nm = new NegaraModel();
         nm.setNama("Canada");
         nm.setDeskripsi("Negara ini terdapat di sebelah utara negara Amerika Serikat");
         nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/256/Canada-Flag-icon.png");
         negaraModelList.add(nm);
         RecyclerView.LayoutManager lm = new LinearLayoutManager(MainActivity.this);
         _recyclerView1.setLayoutManager(lm);
         NegaraAdapter na = new NegaraAdapter(getApplicationContext(), negaraModelList);
         _recyclerView1.setAdapter(na);
    }
}