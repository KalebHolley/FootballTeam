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
public class QuarterBack extends Offensiveback {
    private int passingAttempts;
    private int completions;
    private int passingYards;
    private int interceptions;
    private int passingTouchdowns;
    
    
    public QuarterBack(){
        super();
        this.passingAttempts = 0;
        this.completions = 0;
        this.passingYards = 0;
        this.interceptions = 0;
        this.passingTouchdowns = 0;

    }
    
    public String toString(){
        String output = super.toString()+","+getPassingAttempts()+","+
            getCompletions()+","+getPassingYards()+","+
            getInterceptions()+","+getPassingTouchdowns();
    
        return output;
    }

    /**
     * @return the passingAttempts
     */
    public int getPassingAttempts() {
        return passingAttempts;
    }

    /**
     * @param passingAttempts the passingAttempts to set
     */
    public void setPassingAttempts(int passingAttempts) {
        this.passingAttempts = passingAttempts;
    }

    /**
     * @return the completions
     */
    public int getCompletions() {
        return completions;
    }

    /**
     * @param completions the completions to set
     */
    public void setCompletions(int completions) {
        this.completions = completions;
    }

    /**
     * @return the passingYards
     */
    public int getPassingYards() {
        return passingYards;
    }

    /**
     * @param passingYards the passingYards to set
     */
    public void setPassingYards(int passingYards) {
        this.passingYards = passingYards;
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
     * @return the passingTouchdowns
     */
    public int getPassingTouchdowns() {
        return passingTouchdowns;
    }

    /**
     * @param passingTouchdowns the passingTouchdowns to set
     */
    public void setPassingTouchdowns(int passingTouchdowns) {
        this.passingTouchdowns = passingTouchdowns;
    }
}
