package com.example.mentalhealthscreening;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ocd_q3 extends AppCompatActivity {

    private TextView questionTextView;
    private RadioGroup choicesRadioGroup;
    private Button nextButton;

    private TextView useruser;

    private ImageView next;

    public int userScore;



//    private String[] questions = {"1.Do you have persistent, unwanted, and distressing thoughts, images, or urges that intrude upon your mind despite your efforts to ignore or suppress them?", "Question 2?", "Question 3?"}; // Add your questions here
//    private int[] correctAnswers = {1, 2, 3}; // Specify the correct answer for each question
//    private int currentQuestionIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocd_q3);

        // Initialize UI elements
        questionTextView = findViewById(R.id.ocd_q3);
        choicesRadioGroup = findViewById(R.id.choicesRadioGroup);
        next = findViewById(R.id.next);
        useruser = findViewById(R.id.useruser);

//        Intent receivedIntent = getIntent();
//        if (receivedIntent != null) {
//            int intValue = receivedIntent.getIntExtra("user_score", 0);
//            String scoreText = String.valueOf(intValue);
//            useruser.setText(scoreText);
//        }


        // Set click listener for the "Next" button
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Check the selected answer
                int selectedAnswerId = choicesRadioGroup.getCheckedRadioButtonId();
                if (selectedAnswerId != -1) {
                    checkAnswer(selectedAnswerId);
//                    currentQuestionIndex++;

                    Intent receivedIntent = getIntent();
                    if (receivedIntent != null) {
                        int intValue = receivedIntent.getIntExtra("user_score", 0);
                        userScore+= intValue;
                    }



                    Intent intent2 = new Intent(ocd_q3.this, ocd_q4.class);
                    intent2.putExtra("user_score", userScore);
                    startActivity(intent2);


                    // Check if there are more questions
//                    if (currentQuestionIndex < questions.length) {
//                        showQuestion(currentQuestionIndex);
//                    } else {
//                        // All questions have been answered
//                        // You can show the user's score or perform other actions here
//                    }
                }
            }
        });
    }

//    private void showQuestion(int index) {
//        // Display the question and choices
//        questionTextView.setText(questions[index]);
//        String[] choices = getResources().getStringArray(R.array.choices_array); // Define your choices in resources
//        for (int i = 0; i < choicesRadioGroup.getChildCount(); i++) {
//            RadioButton radioButton = (RadioButton) choicesRadioGroup.getChildAt(i);
//            radioButton.setText(choices[index * 3 + i]); // Adjust the index accordingly
//        }
//
//    }

    private void checkAnswer(int selectedAnswerId) {

//        int correctAnswer = correctAnswers[currentQuestionIndex];
        if (selectedAnswerId == R.id.choice1RadioButton) {
            userScore=5;
            // The answer is correct
            // You can keep track of the user's score here
        } else if (selectedAnswerId == R.id.choice2RadioButton) {
            userScore=3;
        }
        else if (selectedAnswerId == R.id.choice3RadioButton) {
            userScore=2;
        }
        else if (selectedAnswerId == R.id.choice4RadioButton) {
            userScore=1;
        }
    }

}