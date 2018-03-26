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
public class DefensiveBack {
    private int interceptions;
    private int interferencePenalties;
    
    public DefensiveBack(){
        super();
        this.interceptions = 0;
        this.interferencePenalties = 0;
    }

    /**
     * @return the interceptions
     */
    public int getInterceptions() {
        return interceptions;
    }

    /**
     * @param interceptions the interceptions to set
     */
    public void setInterceptions(int interceptions) {
        this.interceptions = interceptions;
    }

    /**
     * @return the interferencePenalties
     */
    public int getInterferencePenalties() {
        return interferencePenalties;
    }

    /**
     * @param interferencePenalties the interferencePenalties to set
     */
    public void setInterferencePenalties(int interferencePenalties) {
        this.interferencePenalties = interferencePenalties;
    }
    public String toString(){
    String output;
    
    output = super.toString()+","+getInterceptions()+","+getInterferencePenalties();
    return output;
    }
    
}
