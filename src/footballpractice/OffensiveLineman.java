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
public class OffensiveLineman extends OffensivePlayer {
    private int pancakes;
    private int holdingPenalties;
    
    
    public OffensiveLineman(){
        super();
        this.pancakes = 0;
        this.holdingPenalties = 0;
    }
    
    


    /**
     * @return the pancakes
     */
    public int getPancakes() {
        return pancakes;
    }

    /**
     * @param pancakes the pancakes to set
     */
    public void setPancakes(int pancakes) {
        this.pancakes = pancakes;
    }

    /**
     * @return the holdingPenalties
     */
    public int getHoldingPenalties() {
        return holdingPenalties;
    }

    /**
     * @param holdingPenalties the holdingPenalties to set
     */
    public void setHoldingPenalties(int holdingPenalties) {
        this.holdingPenalties = holdingPenalties;
    }
    
    public String toString (){
        String output = super.toString()+","+getPancakes()+","+getHoldingPenalties();
        return output;
    }
    
}
