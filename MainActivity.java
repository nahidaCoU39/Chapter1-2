package com.hfad.beeradviser;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickFindBeer(View view){
        TextView brands =(TextView)findViewById(R.id.brands);
        Spinner color=(Spinner)findViewById(R.id.color);
        String beerType =String.valueOf(color.getSelectedItem());
        brands.setText(beerType);
    }
}
