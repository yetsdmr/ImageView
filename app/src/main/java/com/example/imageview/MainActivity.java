package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        tikla();
    }
    private void tanimla(){
        imageView = findViewById(R.id.image);
        button = findViewById(R.id.btn);
    }
    private void tikla(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rnd=(int)(Math.random()*5+1);
                degistir(rnd);
            }
        });
    }
    private void degistir(int sayi){
        if (sayi == 1)
        {
            imageView.setImageResource(R.drawable.animal_post);
        }
        else if (sayi == 2){
            imageView.setImageResource(R.drawable.post_2);
        }
    }
}