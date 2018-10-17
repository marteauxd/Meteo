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
public interface IfTemperatureListener extends java.util.EventListener {

    void temperatureChangee(double ancienneTemperature, double nouvelleTemperature);

}
