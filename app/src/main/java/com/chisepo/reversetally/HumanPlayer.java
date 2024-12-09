
package com.chisepo.reversetally;

class HumanPlayer extends Game {
    @Override
    public void addPoints(int points, boolean isPlayer1Turn) {
        if (isPlayer1Turn) {
            player1Score += points;
        } else {
            player2Score += points;
        }
    }
}