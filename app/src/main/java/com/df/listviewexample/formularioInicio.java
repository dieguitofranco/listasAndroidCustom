package com.df.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.df.listviewexample.models.Car;

import java.util.ArrayList;
import java.util.LinkedList;

public class formularioInicio extends AppCompatActivity implements View.OnClickListener {

    private EditText txtName;
    private EditText txtCilinder;
    private EditText txtValue;
    private EditText txtUrlImage;
    private EditText txtModel;
    private Button btnAgregar;
    private Button btnConsultar;

    private LinkedList<Car> carros ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_inicio);
        carros = new LinkedList<>();
        txtName  = findViewById(R.id.txtCarName);
        txtCilinder = findViewById(R.id.txtCilinderCar);
        txtValue = findViewById(R.id.txtValue);
        txtUrlImage = findViewById(R.id.txtImageUrl);
        txtModel = findViewById(R.id.txtModel);

        btnAgregar = findViewById(R.id.btnAgregar);
        btnConsultar = findViewById(R.id.btnConsultar);

        btnAgregar.setOnClickListener(this);
        btnConsultar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case  R.id.btnAgregar:
                Car car = new Car();
                car.setName(txtName.getText().toString());
                car.setModel(txtModel.getText().toString());
                car.setCylinderCapacity(txtCilinder.getText().toString());
                car.setValue(txtValue.getText().toString());
                car.setImage(txtUrlImage.getText().toString());
                carros.add(car);
                this.cleanForm();
                Toast.makeText(this, "Carro adicionado correctamente", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnConsultar:
                Bundle extra = new Bundle();
                extra.putSerializable("lista", carros);

                Intent intent = new Intent(formularioInicio.this,MainActivity.class);
                intent.putExtra("extra", extra);

                startActivity(intent);
                break;
        }



    }

    private void cleanForm(){
        txtName.setText("");
        txtCilinder.setText("");
        txtValue.setText("");
        txtUrlImage.setText("");
        txtModel.setText("");
    }
}