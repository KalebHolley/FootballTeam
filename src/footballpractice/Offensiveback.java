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
public class Offensiveback {
    private int rushes;
    private int rushingYards;
    private int receptions;
    private int receptionYards;
    
   
    
    public Offensiveback(){
        super();
        this.rushes = 0;
        this.rushingYards = 0;
        this.receptions = 0;
        this.receptionYards = 0;
    }

    /**
     * @return the rushes
     */
    public int getRushes() {
        return rushes;
    }

    /**
     * @param rushes the rushes to set
     */
    public void setRushes(int rushes) {
        this.rushes = rushes;
    }

    /**
     * @return the rushingYards
     */
    public int getRushingYards() {
        return rushingYards;
    }

    /**
     * @param rushingYards the rushingYards to set
     */
    public void setRushingYards(int rushingYards) {
        this.rushingYards = rushingYards;
    }

    /**
     * @return the receptions
     */
    public int getReceptions() {
        return receptions;
    }

    /**
     * @param receptions the receptions to set
     */
    public void setReceptions(int receptions) {
        this.receptions = receptions;
    }

    /**
     * @return the receptionYards
     */
    public int getReceptionYards() {
        return receptionYards;
    }

    /**
     * @param receptionYards the receptionYards to set
     */
    public void setReceptionYards(int receptionYards) {
        this.receptionYards = receptionYards;
    }
    
    public String toString(){
        String output = super.toString()+getRushes()+","+getRushingYards()+","+getReceptions()+","+getReceptionYards();
        return output;
    }
    
    
}
