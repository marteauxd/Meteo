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


    /**
     * @param args the command line arguments
     */

import javax.swing.event.EventListenerList;

 

public class Meteo {

 

    private double temperature;

 

    public Meteo(double temperature) {

        this.temperature = temperature;

    }

 

    public double getTemperature() {

        return temperature;

    }

 

    public void setTemperature(double temperature) {

        if (temperature != this.temperature) {

            double oldTemperature = this.temperature;

            this.temperature = temperature;

            fireTemperatureChanged(oldTemperature, temperature);

        }

    }

 

    // un seul objet pour tous les types d'écouteurs

    private final EventListenerList listeners = new EventListenerList();

 

    public void addTemperatureListener(IfTemperatureListener listener) {

        listeners.add(IfTemperatureListener.class, listener);

    }

 

    public void removeTemperatureListener(IfTemperatureListener listener) {

        listeners.remove(IfTemperatureListener.class, listener);

    }

 

    public IfTemperatureListener[] getTemperatureListeners() {

        return listeners.getListeners(IfTemperatureListener.class);

    }

 

    protected void fireTemperatureChanged(double oldTemperature, double newTemperature) {

        for (IfTemperatureListener listener : getTemperatureListeners()) {

            listener.temperatureChangee(oldTemperature, newTemperature);

        }

    }
}

