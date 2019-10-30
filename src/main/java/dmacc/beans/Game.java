package dmacc.beans;

import java.util.Random;

public class Game {
	private String player1, computerPlayer, winner;
	
	public Game() {
		super();
	}
	
	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayer();
		this.determineWinner();
	}

	public String getPlayer1() {
		return player1;
	}
	public void setPlayer1(String player1) {
		this.player1 = player1;
	}
	public String getComputerPlayer() {
		return computerPlayer;
	}
	public void setComputerPlayer() {
		String[] choices = {"rock", "paper", "scissors", "lizard", "spock"};
		Random rand = new Random();
		int choice = rand.nextInt(choices.length);
		this.computerPlayer = choices[choice];
	}
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}
	
	private void determineWinner() {
		int flag = -1;
		if (player1.equals(computerPlayer)) {
			flag = 0;
		} else if (player1.equals("rock")) {
			if (computerPlayer.equals("lizard") || computerPlayer.equals("scissors")) {
				flag = 1;
			} else { flag = 2; }
		} else if (player1.equals("scissors")) {
			if (computerPlayer.equals("lizard") || computerPlayer.equals("paper")) {
				flag = 1;
			} else { flag = 2; }
		} else if (player1.equals("paper")) {
			if (computerPlayer.equals("spock") || computerPlayer.equals("rock")) {
				flag = 1;
			} else { flag = 2; }
		} else if (player1.equals("lizard")) {
			if (computerPlayer.equals("spock") || computerPlayer.equals("paper")) {
				flag = 1;
			} else { flag = 2; }
		} else if (player1.equals("spock")) {
			if (computerPlayer.equals("scissors") || computerPlayer.equals("rock")) {
				flag = 1;
			} else { flag = 2; }
		}
		
		switch(flag) {
			case 0: winner = "neither of you. It's a tie!"; break;
			case 1: winner = "Player 1!"; break;
			case 2: winner = "Player 2!"; break;
			default: winner = "Something went wrong!";
		}
	}
}