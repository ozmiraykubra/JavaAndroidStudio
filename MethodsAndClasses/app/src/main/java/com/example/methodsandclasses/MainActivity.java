package com.example.methodsandclasses;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.PersistableBundle;

public class MainActivity extends AppCompatActivity {
    String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("on create called.");

        testMethod();

        System.out.println(math(3,5));

        System.out.println(newMethod("MRY"));

        userName="";
        makeMusicians();
        makeSimpsons();
    }

    public void makeSimpsons(){
        Simpsons homer = new Simpsons("Homer",50,"Nuclear");
        homer.age=51;
        System.out.println(homer.getName());
        homer.setName("Homer Simpson");
        System.out.println(homer.getName());
    }

    public void makeMusicians(){
        Musicians james = new Musicians("James", "Guitar",50);
        System.out.println(james.instrument);
    }
    public void testMethod(){
        userName = "Lars";
        int x = 4 + 4 ;
        System.out.println("Value : " + x);
    }
    public int math(int a, int b){
        userName = "Kirk";
        int x = 11;
        System.out.println("value of x in math : " + x);
       return a + b;
    }
    public String newMethod(String string){
        userName = "Rob";
        return string + "new method";
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("on resume called.");

    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("on stop called.");

    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("on pause called.");

    }
}
