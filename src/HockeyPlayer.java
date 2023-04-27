
public class HockeyPlayer {
//instance variables
private String name;
 private int jersey;
 private int goals;
 private int assists;
 private int gamesPlayed;

 //constructor
 public HockeyPlayer(String initName, int initJersey) {
	 name = initName;
	 jersey = initJersey;
 }
 //modifies
 public void gamePlay(int initGoals, int initAssists) {
	 gamesPlayed++;
	 System.out.println(name +  " scored " + initGoals + " goals and " + initAssists + " assists.");
	 goals+=initGoals;
	 assists+=initAssists;
 }
 public int totalPoints() {
	 return goals + assists;
 }
 public int gamesPlayed() {
	 return gamesPlayed;
 }
	public static void main(String[] args) {
		HockeyPlayer KaiCho = new HockeyPlayer("Kai Cho", 24);
		HockeyPlayer BerkayElcik = new HockeyPlayer("Berkay Elcik", 3);
		HockeyPlayer MylesFB = new HockeyPlayer("Myles FB", 69);
		KaiCho.gamePlay(1,3);
		KaiCho.gamePlay(2,3);
		System.out.println(KaiCho.totalPoints());
		System.out.println(KaiCho.gamesPlayed());

	}

}
