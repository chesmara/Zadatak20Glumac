package com.example.androiddevelopment.zadatak20glumac.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.androiddevelopment.zadatak20glumac.R;
import com.example.androiddevelopment.zadatak20glumac.provajderi.glumacProvajder;

import java.util.List;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);






        final List<String> imenaGlumaca= glumacProvajder.getImenaGlumaca();

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,R.layout.list_item, imenaGlumaca) ;
        ListView listView=(ListView) findViewById(R.id.listaGlumaca);

        listView.setAdapter(dataAdapter);


            listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                    Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                    intent.putExtra("position", position);
                    startActivity(intent);


                }

            });


    }





}
