package com.chisepo.reversetally;

import java.util.Random;

class ComputerPlayer extends Game {
    private Random random = new Random();

    @Override
    public void addPoints(int points, boolean isPlayer1Turn) {
        if (isPlayer1Turn) {
            player1Score += points;
        } else {
            int computerPoints = random.nextInt(5) + 1;
            player2Score += computerPoints;
        }
    }
}