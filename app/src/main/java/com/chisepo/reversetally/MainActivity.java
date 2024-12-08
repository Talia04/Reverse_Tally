package com.chisepo.reversetally;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int targetScore = 15;
    private boolean isPlayer1Turn = true;
    private Game game;

    private TextView scoreText, resultText;
    private EditText numberInput;
    private Button submitButton, playerVsPlayerButton, playerVsComputerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        scoreText = findViewById(R.id.scoreText);
        resultText = findViewById(R.id.resultText);
        numberInput = findViewById(R.id.numberInput);
        submitButton = findViewById(R.id.submitButton);
        playerVsPlayerButton = findViewById(R.id.playerVsPlayerButton);
        playerVsComputerButton = findViewById(R.id.playerVsComputerButton);

        // Handle Game Mode Selection
        playerVsPlayerButton.setOnClickListener(v -> startPlayerVsPlayerGame());

        playerVsComputerButton.setOnClickListener(v -> startPlayerVsComputerGame());

        // Handle submitting player input
        submitButton.setOnClickListener(v -> handleTurn());
    }

    // Start Player vs Player game
    private void startPlayerVsPlayerGame() {
        game = new HumanPlayer(); // Assuming your HumanPlayer class is set up elsewhere
        resetGame();
        updateUI();
    }

    // Start Player vs Computer game
    private void startPlayerVsComputerGame() {
        game = new ComputerPlayer();
        resetGame();
        updateUI();
    }

    // Reset game scores
    private void resetGame() {
        game.reset();
        resultText.setText("");
        updateUI();
    }

    // Handle player turn
    private void handleTurn() {
        if (numberInput.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter a number between 1 and 5", Toast.LENGTH_SHORT).show();
            return;
        }

        int points = Integer.parseInt(numberInput.getText().toString());

        if (points < 1 || points > 5) {
            Toast.makeText(this, "Invalid input, choose a number between 1 and 5", Toast.LENGTH_SHORT).show();
            return;
        }

        // Process turn based on whose turn it is
        if (isPlayer1Turn) {
            game.addPoints(points, true); // Add points for Player 1
            if (game.hasLost(true)) {
                resultText.setText("Player 1 loses! Player 2 wins!");
                return;
            }
            isPlayer1Turn = false;
        } else {
            game.addPoints(points, false); // Add points for Player 2 (or computer)
            if (game.hasLost(false)) {
                resultText.setText("Player 2 loses! Player 1 wins!");
                return;
            }
            isPlayer1Turn = true;
        }

        updateUI();
    }

    // Update UI elements like score and result
    private void updateUI() {
        // Update score text
        scoreText.setText("Player 1 Score: " + game.getPlayer1Score() + " | Player 2 Score: " + game.getPlayer2Score());
    }
}
