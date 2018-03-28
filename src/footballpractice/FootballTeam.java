/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballpractice;

import java.util.ArrayList;

/**
 *
 * @author kalebholley
 */
public class FootballTeam {
    private String Teamname;
    private ArrayList<FootballPlayer> players; 

    public FootballTeam(){
        this.Teamname = "";
        this.players = new ArrayList<FootballPlayer>(); 

    }

    /**
     * @return the Teamname
     */
    public String getTeamname() {
        return Teamname;
    }

    /**
     * @param Teamname the Teamname to set
     */
    public void setTeamname(String Teamname) {
        this.Teamname = Teamname;
    }
    
    public int getNumFootballPlayer(){
        return this.players.size();
    }
    
    public FootballPlayer getFootballPlayer(int index){
        return this.players.get(index);
    }
    public void setFootballPlayer(int index,FootballPlayer item){
        this.players.add(index, item);
    }
    public void addFootballPlayer(FootballPlayer item){
        this.players.add(item);
    }
}
