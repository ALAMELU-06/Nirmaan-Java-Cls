package oops_encapsulation;

public class Player {
	
	private int playerId;
	private String playerName;
	private int NOF;
	private int NOS;
	
	
	public Player() {
	}

	public Player(int playerId, String playerName, int NOF, int NOS) {
		this.playerId = playerId;
		this.playerName = playerName;
		this.NOF = NOF;
		this.NOS = NOS;
		
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getNOF() {
		return NOF;
	}

	public void setNOF(int nOF) {
		NOF = nOF;
	}

	public int getNOS() {
		return NOS;
	}

	public void setNOS(int nOS) {
		NOS = nOS;
	}

	
	
	

}
