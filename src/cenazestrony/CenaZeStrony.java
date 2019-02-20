/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cenazestrony;

/**
 *
 * @author oem
 */
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class CenaZeStrony {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Podaj nazwę gry");
        String wybranaGra;
        Scanner odczyt = new Scanner(System.in);
        wybranaGra = odczyt.nextLine();
        String gramPlSearch = "http://www.gram.pl/sklep.asp#s/query/";
        URL znalezioneGry = null;
        try {
            znalezioneGry = new URL(gramPlSearch + wybranaGra + "/");
            BufferedReader in = new BufferedReader (new InputStreamReader (znalezioneGry.openStream()));
            String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
