package com.example.agileapes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class IncorrectAnswerActivity extends AppCompatActivity {

    TextView tvIncorrectAnswerUserAnswer;
    TextView tvIncorrectAnswerCorrectAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incorrect_answer);

        tvIncorrectAnswerUserAnswer = (TextView)findViewById(R.id.tvIncorrectAnswerUserAnswer);
        tvIncorrectAnswerUserAnswer.setText(Global.userAnswer);

        tvIncorrectAnswerCorrectAnswer = (TextView)findViewById(R.id.tvIncorrectAnswerCorrectAnswer);
        tvIncorrectAnswerCorrectAnswer.setText(Global.qandaArrayList.get(Global.currentPosition).getAnswer());

        //this version has userinput passed to correctactivity and incorrectactivity


        //tvQuizScore.setText("" + Global.bananas);

//        Bundle bundle = getIntent().getExtras();
//        if (bundle != null) {
//            String userInput = bundle.getString("userInput");
//
//            tvIncorrectAnswerUserAnswer = (TextView) findViewById(R.id.tvIncorrectAnswerUserAnswer);
//            tvIncorrectAnswerUserAnswer.setText(userInput);

//        }
    }

    public void goToQuiz(View v) {
        Intent myIntent = new Intent(getBaseContext(), QuizActivity.class);
        startActivity(myIntent);
    }
}
