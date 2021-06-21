package Lesson1;

public class Team {
    private String teamName = "Старт";
    private final String[] players = new String[] {"player1 Джо", "player2 большой Майк", "player3 маленький Бил", "player4 толстый Чип"};
    int count;


    public Team() {
        this.teamName = teamName;
    }

    public String getPlayer(int p){
        return players[p];
    }

    public String getTeamName(){
        return teamName;
    }

    public void setTeamName(String teamName){
        this.teamName=teamName;
    }


}
