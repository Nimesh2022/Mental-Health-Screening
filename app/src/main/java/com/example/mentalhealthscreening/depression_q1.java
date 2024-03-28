package com.example.mentalhealthscreening;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

public class depression_q1 extends AppCompatActivity {

    private TextView questionTextView;
    private RadioGroup choicesRadioGroup;
    private Button nextButton;

    private ImageView next;

    public int userScore = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depression_q1);

        // Initialize UI elements
        questionTextView = findViewById(R.id.dep_q1);
        choicesRadioGroup = findViewById(R.id.choicesRadioGroup);
        next = findViewById(R.id.next);


        // Set click listener for the "Next" button
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Check the selected answer
                int selectedAnswerId = choicesRadioGroup.getCheckedRadioButtonId();
                if (selectedAnswerId != -1) {
                    checkAnswer(selectedAnswerId);


                    Intent intent = new Intent(depression_q1.this, depression_q2.class);
                    intent.putExtra("user_score", userScore);
                    startActivity(intent);



                }
            }
        });
    }



    private void checkAnswer(int selectedAnswerId) {

//        int correctAnswer = correctAnswers[currentQuestionIndex];
        if (selectedAnswerId == R.id.choice1RadioButton) {
            userScore=4;
            // The answer is correct
            // You can keep track of the user's score here
        } else if (selectedAnswerId == R.id.choice2RadioButton) {
            userScore=2;
        }
        else if (selectedAnswerId == R.id.choice3RadioButton) {
            userScore=3;
        }
        else if (selectedAnswerId == R.id.choice4RadioButton) {
            userScore=1;
        }
    }

}