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
public class OffensivePlayer extends FootballPlayer{
    private int keyBlocks;
    
    public OffensivePlayer(){
    super();
    this.keyBlocks = 0;
    }

    /**
     * @return the keyBlocks
     */
    public int getKeyBlocks() {
        return keyBlocks;
    }

    /**
     * @param keyBlocks the keyBlocks to set
     */
    public void setKeyBlocks(int keyBlocks) {
        this.keyBlocks = keyBlocks;
    }
    
    public String toString(){
        
        String output = super.toString() + getKeyBlocks();
        return output;
    }
}
