package com.example.lr_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lr_3.R;
//private — имеют доступ только методы самого объекта.
//protected — имеют доступ методы объекта и его потомков.
//public — кто угодно.
public class MainActivity extends AppCompatActivity {
    //@Override: Аннотация, которая указывает, что метод переопределяет метод базового класса (AppCompatActivity)
    @Override
    //onCreate() вызывается при создании или перезапуска активности
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Нет необходимости в явном указании обработчиков событий для кнопок,
        // так как методы onButton1Click, onButton2Click, onButton3Click указаны в XML
    }
    public void onButton1Click(View view) {showSurnameOnButton("Кондрашин", (Button) view);}

    public void onButton2Click(View view) {showSurnameOnButton("Кондрашин", (Button) view);}

    public void onButton3Click(View view) {showSurnameOnButton("Кондрашин", (Button) view);}

    private void showSurnameOnButton(String surname, Button button) {
        button.setText(surname);

        // Можно также использовать Toast для отображения сообщения
        // Toast.makeText(this, surname, Toast.LENGTH_SHORT).show();
    }
}