
public class SoccerPlayer {
	private String name;
	private int number;
	private SoccerTeam team;
	private int  goalsscored;
	private boolean redCard, yellowCard = false;
	
	public SoccerPlayer(String name) {
		this.name =name;
	}
	public void redCard() {
		redCard=true;
	}
	public void yellowCard() {
		if(yellowCard) {
			redCard();
		}
		else {
			yellowCard = true;
		}
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}
	public SoccerTeam getTeam() {
		return team;
	}
	public void increaseGoalCount() {
		goalsscored+=1;
	}
	public void setTeam(SoccerTeam team) {
		this.team=team;
	}
	public String toString() {
		String a = name;
		SoccerTeam b=team;
		int n =number, g= goalsscored;
		String result = a+ ", " +b.getName()+ ", " +n+ ", " +"Goals: "+g;
		return result;
	}

}
