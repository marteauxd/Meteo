/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meteo;

/**
 *
 * @author marteauxd
 */
public class main {

 

    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {

        System.out.println("Debut");

        Meteo maMeteo = new Meteo(15d);

 

        maMeteo.setTemperature(25d);

        SuiveurMeteo suiveur1 = new SuiveurMeteo("Luke");

        maMeteo.addTemperatureListener(suiveur1);

        System.out.println("Après ajout suiveur1");

 

        maMeteo.setTemperature(20d);

        maMeteo.setTemperature(22d);

 

        SuiveurMeteo suiveur2 = new SuiveurMeteo("Obi");

        maMeteo.addTemperatureListener(suiveur2);

        System.out.println("Après ajout suiveur2");

 

        maMeteo.setTemperature(21d);

        maMeteo.setTemperature(25d);

 

        SuiveurMeteo suiveur3 = new SuiveurMeteo("Dark");

        maMeteo.addTemperatureListener(suiveur3);

        System.out.println("Après ajout suiveur3");

 

        maMeteo.setTemperature(30d);

        maMeteo.setTemperature(0d);

        maMeteo.removeTemperatureListener(suiveur1);

        System.out.println("Après retrait suiveur1");

 

        maMeteo.setTemperature(30d);

        maMeteo.setTemperature(0d);

 

    }

 

}
