package com.skrebtsov.eugeney.decorator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Beverage beverage = new Espresso();
        beverage = new Soy(beverage);
        beverage = new Whip(beverage);
        Log.d("ESPRESSO", beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Soy(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);

        Log.d("ESPRESSO", beverage1.getDescription() + " $" + beverage1.cost());
    }
}