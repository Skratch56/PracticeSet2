package vut.mambane.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnTeamA3, btnTeamA2, btnTeamAFree, btnTeamB3, btnTeamB2, btnTeamBFree, btnReset;
    private TextView txtTeamAScore, txtTeamBScore;
    private int highScoreA = 0, highScoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTeamA3 = (Button) findViewById(R.id.team13pts);
        btnTeamA2 = (Button) findViewById(R.id.team12pts);
        btnTeamAFree = (Button) findViewById(R.id.team1free);
        btnTeamB3 = (Button) findViewById(R.id.team23pts);
        btnTeamB2 = (Button) findViewById(R.id.team22pts);
        btnTeamBFree = (Button) findViewById(R.id.team2Free);
        btnReset = (Button) findViewById(R.id.reset);
        txtTeamAScore = (TextView) findViewById(R.id.team1Score);
        txtTeamBScore = (TextView) findViewById(R.id.team2Score);


    }

    public void onClick(View view) {


        if (btnTeamA3.isPressed()) {
            highScoreA += 3;
        } else if (btnTeamA2.isPressed()) {
            highScoreA += 2;
        } else if (btnTeamAFree.isPressed()) {
            highScoreA += 1;
        } else if (btnTeamB3.isPressed()) {
            highScoreB += 3;
        } else if (btnTeamB2.isPressed()) {
            highScoreB += 2;
        } else if (btnTeamBFree.isPressed()) {
            highScoreB += 1;
        } else if (btnReset.isPressed()) {
            highScoreA = 0;
            highScoreB = 0;
        }

        txtTeamAScore.setText(highScoreA + "");
        txtTeamBScore.setText(highScoreB + "");

    }

}
