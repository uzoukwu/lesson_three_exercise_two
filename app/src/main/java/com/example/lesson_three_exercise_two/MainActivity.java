package com.example.lesson_three_exercise_two;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String currentname = "ОАО Шаурма";
        String newname = "ОАО Пирожки";

        ArrayList<String> database = new ArrayList<>();
        database.add("ООО Феникс");
        database.add("ОАО Метсбыт");
        database.add("ЧП Иванов");
        database.add("ОАО Шаурма");
        database.add("ОАО Мебель");
        database.add("ОАО Кнопка");
        database.add("ООО Свет");
        database.add("ОАО БМВ");
        database.add("ООО Адидас");
        database.add("ООО Метро");
        


        for (String value: database) {
            if (value.equals(currentname)){
                value = newname;
            }
        }

        /*if (database.get(3).equals("ОАО Шаурма")) {
            database.set(3,"ОАО Пирожки");
            Log.d("myLog", "Updated: " + database.get(3));
        }*/


        for (String item: database) {
            Log.d("myLog", "New Database: " + item);
        }
    }
}