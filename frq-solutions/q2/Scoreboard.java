public class Scoreboard {
  private String team1;
  private String team2;
  private int score1;
  private int score2;
  private int activeTeam;
  
  public Scoreboard(String t1,String t2){
    team1 = t1;
    team2 = t2;
    score1 = 0;
    score2 = 0;
    activeTeam = 1;
  }
  
  public void recordPlay (int scoreEarn){
    if (scoreEarn == 0){
      if (activeTeam == 1){
        activeTeam = 2;
      }
      else{
        activeTeam = 1;
      }
    }
  
    if (activeTeam == 1){
      score1 += scoreEarn;
    }
    else{
      score2 += scoreEarn;
    }
  }
  
  public String getScore(){
    String result ="" + score1 + "-" + score2 + "-";
    if (activeTeam == 1){
      return result + team1;
    }
    return result + team2;
  }
}
