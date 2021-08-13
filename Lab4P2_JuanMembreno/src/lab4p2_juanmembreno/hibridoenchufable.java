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
public class hibridoenchufable {
      private String modelo;
    private String vin;
    private String carroceria;
    private int cantpasajeros;
    private int capacidadmaletero;
    private int cantidaddekilometros;
    private int cantidaddemotores;
    private int capacidadderemolque;
    private String cuatropocuatro;

    public hibridoenchufable() {
    }

    public hibridoenchufable(String modelo, String vin, String carroceria, int cantpasajeros, int capacidadmaletero, int cantidaddekilometros, int cantidaddemotores, int capacidadderemolque, String cuatropocuatro) {
        this.modelo = modelo;
        this.vin = vin;
        this.carroceria = carroceria;
        this.cantpasajeros = cantpasajeros;
        this.capacidadmaletero = capacidadmaletero;
        this.cantidaddekilometros = cantidaddekilometros;
        this.cantidaddemotores = cantidaddemotores;
        this.capacidadderemolque = capacidadderemolque;
        this.cuatropocuatro = cuatropocuatro;
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

    public int getCantidaddemotores() {
        return cantidaddemotores;
    }

    public void setCantidaddemotores(int cantidaddemotores) {
        this.cantidaddemotores = cantidaddemotores;
    }

    public int getCapacidadderemolque() {
        return capacidadderemolque;
    }

    public void setCapacidadderemolque(int capacidadderemolque) {
        this.capacidadderemolque = capacidadderemolque;
    }

    public String getCuatropocuatro() {
        return cuatropocuatro;
    }

    public void setCuatropocuatro(String cuatropocuatro) {
        this.cuatropocuatro = cuatropocuatro;
    }

    @Override
    public String toString() {
        return "hibridoenchufable{" + "modelo=" + modelo + ", vin=" + vin + ", carroceria=" + carroceria + ", cantpasajeros=" + cantpasajeros + ", capacidadmaletero=" + capacidadmaletero + ", cantidaddekilometros=" + cantidaddekilometros + ", cantidaddemotores=" + cantidaddemotores + ", capacidadderemolque=" + capacidadderemolque + ", cuatropocuatro=" + cuatropocuatro + '}';
    }
    
}
