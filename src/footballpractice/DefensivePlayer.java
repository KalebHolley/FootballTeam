/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballpractice;

/**
 *
 * @author kalebholley
 */
public class DefensivePlayer extends FootballPlayer {
    private int sacks;
    private int tackles;
    private int strips;
    
    
    public DefensivePlayer(){
        super();
        this.sacks = 0;
        this.tackles = 0;
        this.strips = 0;
    }
    

    /**
     * @return the sacks
     */
    public int getSacks() {
        return sacks;
    }

    /**
     * @param sacks the sacks to set
     */
    public void setSacks(int sacks) {
        this.sacks = sacks;
    }

    /**
     * @return the tackles
     */
    public int getTackles() {
        return tackles;
    }

    /**
     * @param tackles the tackles to set
     */
    public void setTackles(int tackles) {
        this.tackles = tackles;
    }

    /**
     * @return the strips
     */
    public int getStrips() {
        return strips;
    }

    /**
     * @param strips the strips to set
     */
    public void setStrips(int strips) {
        this.strips = strips;
    }
    
        /**
     * @return all attributes
     */
    public String toString(){
    String output;
    
    output = super.toString()+","+getSacks()+","+getTackles()+","+getStrips();
    
    return output;
    }
    
}
