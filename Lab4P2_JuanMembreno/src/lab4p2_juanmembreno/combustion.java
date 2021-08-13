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
public class combustion {
    private String modelo;
    private String vin;
    private String carroceria;
    private int cantpasajeros;
    private int capacidadmaletero;
    private int consumodecombustible;
    private int duracionaceite;
    private int velocidadmax;
    private String tipocambio;

    public combustion() {
    }

    public combustion(String modelo, String vin, String carroceria, int cantpasajeros, int capacidadmaletero, int consumodecombustible, int duracionaceite, int velocidadmax, String tipocambio) {
        this.modelo = modelo;
        this.vin = vin;
        this.carroceria = carroceria;
        this.cantpasajeros = cantpasajeros;
        this.capacidadmaletero = capacidadmaletero;
        this.consumodecombustible = consumodecombustible;
        this.duracionaceite = duracionaceite;
        this.velocidadmax = velocidadmax;
        this.tipocambio = tipocambio;
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

    public int getConsumodecombustible() {
        return consumodecombustible;
    }

    public void setConsumodecombustible(int consumodecombustible) {
        this.consumodecombustible = consumodecombustible;
    }

    public int getDuracionaceite() {
        return duracionaceite;
    }

    public void setDuracionaceite(int duracionaceite) {
        this.duracionaceite = duracionaceite;
    }

    public int getVelocidadmax() {
        return velocidadmax;
    }

    public void setVelocidadmax(int velocidadmax) {
        this.velocidadmax = velocidadmax;
    }

    public String getTipocambio() {
        return tipocambio;
    }

    public void setTipocambio(String tipocambio) {
        this.tipocambio = tipocambio;
    }

    @Override
    public String toString() {
        return "combustion{" + "modelo=" + modelo + ", vin=" + vin + ", carroceria=" + carroceria + ", cantpasajeros=" + cantpasajeros + ", capacidadmaletero=" + capacidadmaletero + ", consumodecombustible=" + consumodecombustible + ", duracionaceite=" + duracionaceite + ", velocidadmax=" + velocidadmax + ", tipocambio=" + tipocambio + '}';
    }
    
}
