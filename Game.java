package com.chisepo.reversetally;

abstract class Game {
    protected int player1Score = 0;
    protected int player2Score = 0;
    protected int targetScore = 15;

    // Add points for the current player
    public abstract void addPoints(int points, boolean isPlayer1Turn);

    // Check if the current player has lost
    public boolean hasLost(boolean isPlayer1Turn) {
        if (isPlayer1Turn) {
            return player1Score >= targetScore;
        } else {
            return player2Score >= targetScore;
        }
    }

    // Get current player scores
    public int getPlayer1Score() {
        return player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }

    // Reset the game scores
    public void reset() {
        player1Score = 0;
        player2Score = 0;
    }
}
