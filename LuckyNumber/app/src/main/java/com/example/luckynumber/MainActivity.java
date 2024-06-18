package com.example.luckynumber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    TextView myTextView;
    EditText myEditText;
    Button myButton;
    ImageView myImageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });


        myTextView = findViewById(R.id.textView) ;
        myEditText = findViewById(R.id.editText) ;
        myButton = findViewById(R.id.button) ;
        myImageView = findViewById(R.id.imageView) ;

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //        String userNameAsInput = myEditText.getText().toString();
                String userNameAsInput = myEditText.toString();

                // Explicit Intent --> passing data from here to another activity within the app
                Intent i = new Intent(getApplicationContext(), result_screen.class) ;

                // Passing data to another activity
                i.putExtra("name", userNameAsInput);


                startActivity(i);
            }
        });





    }










}