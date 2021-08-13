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
public class exception extends Exception{
    private int dias;

    public exception() {
    }

    public exception(int dias, String string) {
        super(string);
        this.dias = dias;
    }

    public exception(String string) {
        super(string);
    }
    

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "exception{" + "dias=" + dias + '}';
    }

}
