/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_juanmembreno;

/**
 *
 * @author usuario
 */
public class electrico {
       private String modelo;
    private String vin;
    private String carroceria;
    private int cantpasajeros;
    private int capacidadmaletero;
    private int cantidaddekilometros;
    private int cantidaddebaterias;
    private int acceleracion;
    private int tiempodecarga;

    public electrico() {
    }

    public electrico(String modelo, String vin, String carroceria, int cantpasajeros, int capacidadmaletero, int cantidaddekilometros, int cantidaddebaterias, int acceleracion, int tiempodecarga) {
        this.modelo = modelo;
        this.vin = vin;
        this.carroceria = carroceria;
        this.cantpasajeros = cantpasajeros;
        this.capacidadmaletero = capacidadmaletero;
        this.cantidaddekilometros = cantidaddekilometros;
        this.cantidaddebaterias = cantidaddebaterias;
        this.acceleracion = acceleracion;
        this.tiempodecarga = tiempodecarga;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public int getCantpasajeros() {
        return cantpasajeros;
    }

    public void setCantpasajeros(int cantpasajeros) {
        this.cantpasajeros = cantpasajeros;
    }

    public int getCapacidadmaletero() {
        return capacidadmaletero;
    }

    public void setCapacidadmaletero(int capacidadmaletero) {
        this.capacidadmaletero = capacidadmaletero;
    }

    public int getCantidaddekilometros() {
        return cantidaddekilometros;
    }

    public void setCantidaddekilometros(int cantidaddekilometros) {
        this.cantidaddekilometros = cantidaddekilometros;
    }

    public int getCantidaddebaterias() {
        return cantidaddebaterias;
    }

    public void setCantidaddebaterias(int cantidaddebaterias) {
        this.cantidaddebaterias = cantidaddebaterias;
    }

    public int getAcceleracion() {
        return acceleracion;
    }

    public void setAcceleracion(int acceleracion) {
        this.acceleracion = acceleracion;
    }

    public int getTiempodecarga() {
        return tiempodecarga;
    }

    public void setTiempodecarga(int tiempodecarga) {
        this.tiempodecarga = tiempodecarga;
    }

    @Override
    public String toString() {
        return "electrico{" + "modelo=" + modelo + ", vin=" + vin + ", carroceria=" + carroceria + ", cantpasajeros=" + cantpasajeros + ", capacidadmaletero=" + capacidadmaletero + ", cantidaddekilometros=" + cantidaddekilometros + ", cantidaddebaterias=" + cantidaddebaterias + ", acceleracion=" + acceleracion + ", tiempodecarga=" + tiempodecarga + '}';
    }
    
}
