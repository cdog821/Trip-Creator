/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TripCreator;

/**
 *
 * @author linzcar20
 */
public class Destination
{
    private String airport; 
    private String location;
    private int numPeople;
    
    public Destination(String location, String airport, int numPeople) {
        this.location = location;
        this.airport = airport;
        this.numPeople = numPeople;
    }
    
    public Destination (String location, int numPeople) {
        this.location = location;
        this.numPeople = numPeople;
    }
    public Destination (String location) {
        this.location = location;
    }
    
    public String toString() {
        if (numPeople == 1) {
            return location + ", 1 person, at " + airport;
        }
        return location + ", " + numPeople + " people, at " + airport;
    }

    public String getLocation()
    {
        return location;
    }

    public int getNumPeople()
    {
        return numPeople;
    }

    public String getAirport() {
        return airport;
    }
    
    
}
