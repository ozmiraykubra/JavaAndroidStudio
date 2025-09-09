package com.example.oopproject;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        User myUser = new User();
        myUser.name="MRY";
        myUser.job="Instructor";

        User newUser = new User();
        newUser.name="Kirk";
        newUser.job="Musician";
        */

        User myUser = new User("MRY","Instructor");
        User newUser = new User("Kirk" , "Musician");
        System.out.println(myUser.name);

        Musician james = new Musician("Jame","Guitar",50);
        System.out.println(james.age);
    }
}