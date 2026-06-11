package oops_encapsulation;

public class Match {
	
	private int matchId;
	private String matchType;
	
	
	public Match() {
	}

	public Match(int matchId, String matchName) {
		this.matchId = matchId;
		this.matchType = matchType;
		
	}

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public String getMatchType() {
		return matchType;
	}

	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}
	

}
