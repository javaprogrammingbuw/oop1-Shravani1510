
public class SoccerTeam {
	private String name;
	private SoccerTrainer trainer;
	private int tableposition;
	private int goalsscored;
	private int goalsagainst;
	SoccerPlayer[ ] players = new SoccerPlayer[11] ;
	public SoccerTeam(String name,  SoccerTrainer trainer, int tableposition) {
		this.name = name;
		this.trainer = trainer;
		this.tableposition = tableposition;
	}
	public String getName() {
		return name;
	}
	public boolean addPlayer(SoccerPlayer player) {
		
		//look for entry with value null
		//a) there exists no entry null: return false
		//b) insert player at corresponding position and set Team and number (position+1) for the player
		//players[i] = player
		for(int i=0; i<players.length;i++) {
			if(players[i]==null) {
				players[i] = player;
				player.setTeam(this);
				player.setNumber(i+1);
				return true;
			}
			
		}
		
		return false;
	}
	public void goal(int playerNumber) {
		// 1. increase goalsscored
		// 2. increase goalcount of player with number playernumber
		goalsscored +=1;
		if(players[playerNumber-1]!=null) {
		players[playerNumber-1].increaseGoalCount();
		}
		
	}
	public void goalAgainst() {
		goalsagainst += 1;
	}
	public String ratioString() {
		String Re = goalsscored + ":" + goalsagainst;
		return Re;
	}
	public String toString(){
		String a= name, Rs= ratioString();
		SoccerTrainer T = trainer;
		
		String result = a+ ","+T+ ","+Rs+ ","+ "\n";
		for(int i =0; i<players.length;i++) {
			if(players[i]!=null) {
			result += players[i].toString();
			result += "\n";
			  }
			}
		return result;
	}
	
	
}
