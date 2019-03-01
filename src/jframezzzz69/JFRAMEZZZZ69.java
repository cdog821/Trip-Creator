/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframezzzz69;

import com.sun.xml.internal.ws.util.StringUtils;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author linzcar20
 */
public class JFRAMEZZZZ69
{

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        System.out.println(StringUtils.capitalize("aeLlo mAte"));
        ArrayList<Airport> ap = new ArrayList<Airport>();
        System.out.println("Loading Databases");
        loadAirports(ap);
        System.out.println(ap.get(5421));
        MyJFrame jf = new MyJFrame(ap);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    public static void loadAirports(ArrayList<Airport> ap) throws IOException
    {
        List<String> lines = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new FileReader("flights.txt"));
        String temp;
        Airport tempA = new Airport();
        while ((temp = reader.readLine()) != null)
        {
            lines.add(temp);
        }
        reader.close();
        for (int i = 0; i < lines.size(); i++)
        {
            String x = lines.get(i);
            String z = "";
            for (int y = 0; y < x.length(); y++)
            {
                switch (x.charAt(y))
                {
                    case ',':
                        z += " , ";
                        break;
                    case '"':
                        break;
                    default:
                        z += x.charAt(y);
                        break;
                }
            }
            Scanner sc = new Scanner(z);
            sc.next();
            sc.next();
            temp = "";
            while (!sc.hasNext(","))
            {
                temp += sc.next() + " ";
            }
            tempA.setName(temp.trim());
            sc.next();
            temp = "";
            while (!sc.hasNext(","))
            {
                temp += sc.next() + " ";
            }
            tempA.setCity(temp.trim());
            sc.next();
            temp = "";
            while (!sc.hasNext(","))
            {
                temp += sc.next() + " ";
            }
            tempA.setCountry(temp.trim());
            sc.next();
            tempA.setAbbrev(sc.next());
            for (int y = 0; y < 3; y++)
            {
                sc.next();
            }
            if (sc.hasNextDouble())
            {
                double lo = sc.nextDouble();
                sc.next();
                tempA.setC(new Coordinate(lo, sc.nextDouble()));
            }
            sc.nextLine();
            ap.add(tempA);
            tempA = new Airport();
        }
    }

}
