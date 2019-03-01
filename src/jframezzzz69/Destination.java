/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframezzzz69;

/**
 *
 * @author linzcar20
 */
public class Destination
{
    private String location;
    private int numPeople;
    
    public Destination (String location, int numPeople) {
        this.location = location;
        this.numPeople = numPeople;
    }
    public Destination (String location) {
        this.location = location;
    }
    
    public String toString() {
        return "Loc: " + location + ", Ppl: " + numPeople;
    }

    public String getLocation()
    {
        return location;
    }

    public int getNumPeople()
    {
        return numPeople;
    }
    
    
}
