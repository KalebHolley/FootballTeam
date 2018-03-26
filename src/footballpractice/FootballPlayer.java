/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballpractice;

import java.util.Date;

/**
 *
 * @author kalebholley
 */
public class FootballPlayer {
    private String firstName;
    private String lastName;
    private double height;
    private double weight;
    private int jerseyNumber;
    private Date birthDate;
    
    public FootballPlayer(){
        this.firstName = "";
        this.lastName = "";
        this.height = 0.0;
        this.weight = 0.0;
        this.jerseyNumber = 0;
        this.birthDate = new Date();
    }
    public FootballPlayer(String firstname,String lastname,double height,double weight,int jerseynumber,Date birthdate){
    this.firstName = firstname;
    this.lastName = lastname;
    this.height = height;
    this.weight = weight;
    this.jerseyNumber = jerseynumber;
    this.birthDate = birthdate;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return the jerseyNumber
     */
    public int getJerseyNumber() {
        return jerseyNumber;
    }

    /**
     * @param jerseyNumber the jerseyNumber to set
     */
    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    /**
     * @return the birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    public String toString(){
 
    String output = getFirstName()+","+getLastName()+","+getHeight()+","+getWeight()+","+getJerseyNumber()+","+getBirthDate();
    return output;
    }
    
}
