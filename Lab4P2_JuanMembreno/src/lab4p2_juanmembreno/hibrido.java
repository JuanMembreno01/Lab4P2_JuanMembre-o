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
public class hibrido {
    private String modelo;
    private String vin;
    private String carroceria;
    private int cantpasajeros;
    private int capacidadmaletero;
    private int capacidadbateria;
    private int capacidadmotorelectrico;

    public hibrido() {
    }

    public hibrido(String modelo, String vin, String carroceria, int cantpasajeros, int capacidadmaletero, int capacidadbateria, int capacidadmotorelectrico) {
        this.modelo = modelo;
        this.vin = vin;
        this.carroceria = carroceria;
        this.cantpasajeros = cantpasajeros;
        this.capacidadmaletero = capacidadmaletero;
        this.capacidadbateria = capacidadbateria;
        this.capacidadmotorelectrico = capacidadmotorelectrico;
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

    public int getCapacidadbateria() {
        return capacidadbateria;
    }

    public void setCapacidadbateria(int capacidadbateria) {
        this.capacidadbateria = capacidadbateria;
    }

    public int getCapacidadmotorelectrico() {
        return capacidadmotorelectrico;
    }

    public void setCapacidadmotorelectrico(int capacidadmotorelectrico) {
        this.capacidadmotorelectrico = capacidadmotorelectrico;
    }

    @Override
    public String toString() {
        return "hibrido{" + "modelo=" + modelo + ", vin=" + vin + ", carroceria=" + carroceria + ", cantpasajeros=" + cantpasajeros + ", capacidadmaletero=" + capacidadmaletero + ", capacidadbateria=" + capacidadbateria + ", capacidadmotorelectrico=" + capacidadmotorelectrico + '}';
    }
    
}
