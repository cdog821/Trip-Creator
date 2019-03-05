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
public class Airport
{

    private static int idNum = 1;
    private int id;
    private String name;
    private String city;
    private String country;
    private String abbrev;
    private Coordinate c;

    public Airport()
    {
        id = idNum;
        idNum++;
    }

    public String toString()
    {
        return name + ": " + city + ", " + country + ": " + abbrev + ": " + id + ": " + c;
    }

    public Airport(String name, String city, String country, String abbrev, Coordinate c)
    {
        id = idNum;
        idNum++;
        this.name = name;
        this.city = city;
        this.country = country;
        this.abbrev = abbrev;
        this.c = c;
    }

    public Coordinate getCoordinates()
    {
        return c;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public static int getIdNum()
    {
        return idNum;
    }

    public static void setIdNum(int idNum)
    {
        Airport.idNum = idNum;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getAbbrev()
    {
        return abbrev;
    }

    public void setAbbrev(String abbrev)
    {
        this.abbrev = abbrev;
    }

    public Coordinate getC()
    {
        return c;
    }

    public void setC(Coordinate c)
    {
        this.c = c;
    }

    public String getName() {
        return name;
    }

}
