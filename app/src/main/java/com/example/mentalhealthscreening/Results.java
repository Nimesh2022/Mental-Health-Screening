package com.example.mentalhealthscreening;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    private TextView score;
    private TextView percentage;

    private TextView context;
    private Button exit;

    public int userScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        percentage = findViewById(R.id.percentage);
        context = findViewById(R.id.context5);
        exit = findViewById(R.id.exit);

        Intent receivedIntent = getIntent();
//        if (receivedIntent != null) {
//            int intValue = receivedIntent.getIntExtra("user_score", 0);
//            String scoreText = String.valueOf(intValue);
//            percentage.setText(scoreText);;
//        }

        if (receivedIntent != null) {
            int intValue = receivedIntent.getIntExtra("user_score", 0);
            if (intValue>=20){
                String context2 = "Good Mental Health!";
                context.setText(context2);
            } else if (intValue>=10 && intValue<20) {
                String context2 = "You are Prone to the disease! Please refer to our Reads.";
                context.setText(context2);
            } else if (intValue>0 && intValue<10) {
                String context2 = "Critical Condition! Please consult a therapist.";
                context.setText(context2);
            }
            String scoreText = String.valueOf(intValue);
            percentage.setText(scoreText);;
        }


        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


//                String scoreText = String.valueOf(percentage);
//                percentage.setText(scoreText);

                Intent intent = new Intent(Results.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}