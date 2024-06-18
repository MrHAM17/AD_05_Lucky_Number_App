package com.example.luckynumber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class result_screen extends AppCompatActivity {


    TextView myTextView2, myTextView3 ;
    Button myButton2 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_result_screen);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });


//        myTextView2 = findViewById(R.id.textView2) ;
        myTextView3 = findViewById(R.id.textView3) ;
        myButton2 = findViewById(R.id.button2) ;

        // Receiving data from another activity to this
        Intent i = getIntent();
        String userName = i.getStringExtra("name") ;

        // Generating Random Numbers
        int randomNumber = getRandomNumber();

        myTextView3.setText("" +randomNumber);

        myButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareData(userName, randomNumber) ;
            }
        });


    }

    public int getRandomNumber() {
        Random random = new Random();
        int upperLimit = 100;
        int generatedRandomNumber = random.nextInt(upperLimit);
        return generatedRandomNumber ;
    }

    public void shareData(String userName, int randomNumber){
        // Implicit Intent
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");

        // Additional Info
        i.putExtra(Intent.EXTRA_SUBJECT, userName +" got lucky today !");
        i.putExtra(Intent.EXTRA_TEXT, "His lucky number is " +randomNumber);

        startActivity(Intent.createChooser(i, "Choose a platform"));
    }


}