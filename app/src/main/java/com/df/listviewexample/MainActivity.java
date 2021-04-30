package com.df.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.df.listviewexample.models.Car;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listViewNames;
    private ArrayList<Car> listCars = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewNames = findViewById(R.id.listViewNames);
       // Car c = new Car("FORD MUSTANG","2000","2021","140000000",null);
        listCars.add(new Car("FORD MUSTANG","2000","2021","140000000",null));
        listCars.add(new Car("CAMARO","2000","2021","140000000",null));
        listCars.add(new Car("COBRA","2000","1966","140000000",null));
        AdapterCar adapter = new AdapterCar(this,listCars);
        listViewNames.setAdapter(adapter);
        listViewNames.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,"ha pulsado el elemento numero "+ listCars.get(position).getName(), Toast.LENGTH_SHORT).show();
    }
}