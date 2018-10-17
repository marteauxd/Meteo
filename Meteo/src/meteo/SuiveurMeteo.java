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
public class SuiveurMeteo implements IfTemperatureListener {

 

    private String nom;

 

    public SuiveurMeteo(String _nom) {

        nom = _nom;

    }

 

    @Override

    public void temperatureChangee(double ancienneTemperature, double nouvelleTemperature) {

        System.out.println(nom + " : ça change de " + ancienneTemperature + " vers " + nouvelleTemperature);

    }

}