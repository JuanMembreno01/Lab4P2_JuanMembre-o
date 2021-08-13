/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_juanmembreno;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Lab4P2_JuanMembreno {

    static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op = 0;
        ArrayList<combustion> listacombustion = new ArrayList();
        ArrayList<hibrido> listahibrido = new ArrayList();
        ArrayList<hibridoenchufable> listahibridoenchufable = new ArrayList();
        ArrayList<electrico> listaelectrico = new ArrayList();
        while (op != 5) {
            System.out.println("1)Crear Carro");
            System.out.println("2)Modificar Carro");
            System.out.println("3)Eliminar Carro ");
            System.out.println("4)Listar Carro");
            System.out.println("5)Calculo");
            op = leer.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("Desea crear un Carro De:");
                    System.out.println("1)Combustion");
                    System.out.println("2)Hibrido");
                    System.out.println("3)Hibrido Enchufable");
                    System.out.println("4)Electrico");
                    int op2 = leer.nextInt();
                    switch (op2) {
                        case 1: {
                            System.out.println("Ingrese el modelo");
                            String modelo = leer.nextLine();
                            modelo = leer.nextLine();
                            System.out.println("Ingrese VIN");
                            String vin = leer.nextLine();
                            System.out.println("Carroceria:");
                            String carroceria = leer.nextLine();
                            carroceria = leer.nextLine();
                            System.out.println("Cantidad de pasajeros ");
                            int cantidadpa = leer.nextInt();
                            System.out.println("Capacidad de maletero");
                            int capacidadmaletero = leer.nextInt();
                            System.out.println("Consumo de combustible");
                            int consumocombustible = leer.nextInt();
                            System.out.println("Duracion del aceite en meses");
                            int aceite = leer.nextInt();
                            System.out.println("Velocidad maxima");
                            int vemax = leer.nextInt();
                            System.out.println("Cambio (automatico o manual)");
                            String cambio = leer.nextLine();
                            cambio = leer.nextLine();
                            listacombustion.add(new combustion(modelo, vin, carroceria, cantidadpa, capacidadmaletero, consumocombustible, aceite, vemax, cambio));
                        }
                        break;
                        case 2: {
                            System.out.println("Ingrese el modelo");
                            String modelo = leer.nextLine();
                            modelo = leer.nextLine();
                            System.out.println("Ingrese VIN");
                            String vin = leer.nextLine();
                            System.out.println("Carroceria:");
                            String carroceria = leer.nextLine();
                            carroceria = leer.nextLine();
                            System.out.println("Cantidad de pasajeros ");
                            int cantidadpa = leer.nextInt();
                            System.out.println("Capacidad de maletero");
                            int capacidadmaletero = leer.nextInt();
                            System.out.println("Capacidad de bateria");
                            int bateria = leer.nextInt();
                            System.out.println("Capacidad de motor");
                            int capacidadmotor = leer.nextInt();
                            listahibrido.add(new hibrido(modelo, vin, carroceria, cantidadpa, capacidadmaletero, capacidadmotor, capacidadmotor));

                        }
                        break;
                        case 3: {
                            System.out.println("Ingrese el modelo");
                            String modelo = leer.nextLine();
                            modelo = leer.nextLine();
                            System.out.println("Ingrese VIN");
                            String vin = leer.nextLine();
                            System.out.println("Carroceria:");
                            String carroceria = leer.nextLine();
                            carroceria = leer.nextLine();
                            System.out.println("Cantidad de pasajeros ");
                            int cantidadpa = leer.nextInt();
                            System.out.println("Capacidad de maletero");
                            int capacidadmaletero = leer.nextInt();
                            System.out.println("Cantiidad de kilometros en modo electrico");
                            int cantidadkilometros = leer.nextInt();
                            System.out.println("Cantidad de motores");
                            int cantidadademotors = leer.nextInt();
                            System.out.println("Capacidad de remolque");
                            int capacidadremolque = leer.nextInt();
                            System.out.println("Es 4x4");
                            String cuatroporcuatro = leer.nextLine();
                            cuatroporcuatro = leer.nextLine();
                            listahibridoenchufable.add(new hibridoenchufable(modelo, vin, carroceria, cantidadademotors, capacidadmaletero, cantidadkilometros, cantidadademotors, capacidadremolque, cuatroporcuatro));
                        }
                        break;
                        case 4: {
                            System.out.println("Ingrese el modelo");
                            String modelo = leer.nextLine();
                            modelo = leer.nextLine();
                            System.out.println("Ingrese VIN");
                            String vin = leer.nextLine();
                            System.out.println("Carroceria:");
                            String carroceria = leer.nextLine();
                            carroceria = leer.nextLine();
                            System.out.println("Cantidad de pasajeros ");
                            int cantidadpa = leer.nextInt();
                            System.out.println("Capacidad de maletero");
                            int capacidadmaletero = leer.nextInt();
                            System.out.println("Cantidad de kilometros a recorere");
                            int cantkilometros = leer.nextInt();
                            System.out.println("Cantidad de baterias que almacena");
                            int baterias = leer.nextInt();
                            System.out.println("Aceleracion de 0-100");
                            int aceleracion = leer.nextInt();
                            System.out.println("Duracion de carga completa en minutos");
                            int tiempodecarga = leer.nextInt();
                            listaelectrico.add(new electrico(modelo, vin, carroceria, cantkilometros, capacidadmaletero, cantkilometros, cantidadpa, aceleracion, tiempodecarga));
                        }
                        break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                }
                break;
                case 2: {
                    System.out.println("Desea modificar un Carro De:");
                    System.out.println("1)Combustion");
                    System.out.println("2)Hibrido");
                    System.out.println("3)Hibrido Enchufable");
                    System.out.println("4)Electrico");
                    int op2 = leer.nextInt();
                    switch (op2) {
                        case 1: {
                            String salida = "";
                            for (Object t : listacombustion) {
                                if (t instanceof combustion) {
                                    salida += listacombustion.indexOf(t) + ")" + t + "\n";
                                }
                            }
                            System.out.println(salida);
                            System.out.println("Ingrese el indice de que desea modificar");
                            int ind = leer.nextInt();
                            System.out.println("Que desea modificar");
                            System.out.println("1)Modelo");
                            System.out.println("2)VIN");
                            System.out.println("3)Carroceria");
                            System.out.println("4)Catidad de Pasajeros");
                            System.out.println("5)Capacidad de maleteros");
                            int op3 = leer.nextInt();
                            switch (op3) {
                                case 1: {
                                    System.out.println("Ingrese el modelo");
                                    String modelo = leer.nextLine();
                                    modelo = leer.nextLine();
                                    listacombustion.get(ind).setModelo(modelo);

                                }
                                break;
                                case 2: {
                                    System.out.println("Ingesev  el VIn");
                                    String vin = leer.nextLine();
                                    vin = leer.nextLine();
                                    listacombustion.get(ind).setVin(vin);
                                }
                                break;
                                case 3: {
                                    System.out.println("Ingrese carroceria");
                                    String carroceria = leer.nextLine();
                                    carroceria = leer.nextLine();
                                    listacombustion.get(ind).setCarroceria(carroceria);
                                }
                                break;
                                case 4: {
                                    System.out.println("Ingrese cantiiddad de pasaajeros");
                                    int cantp = leer.nextInt();
                                    listacombustion.get(ind).setCantpasajeros(cantp);
                                }
                                break;
                                case 5: {
                                    System.out.println("Capacidad de maletero en litros");
                                    int capacidadmaletero = leer.nextInt();
                                    listacombustion.get(ind).setCapacidadmaletero(capacidadmaletero);
                                }
                                break;
                                default:

                                    System.out.println("Opcion innvalida");
                                    break;

                            }

                        }
                        break;
                        case 2: {
                            String salida = "";
                            for (Object t : listahibrido) {
                                if (t instanceof hibrido) {
                                    salida += listahibrido.indexOf(t) + ")" + t + "\n";
                                }
                            }
                            System.out.println(salida);
                            System.out.println("Ingrese el indice de que desea modificar");
                            int ind = leer.nextInt();
                            System.out.println("Que desea modificar");
                            System.out.println("1)Modelo");
                            System.out.println("2)VIN");
                            System.out.println("3)Carroceria");
                            System.out.println("4)Catidad de Pasajeros");
                            System.out.println("5)Capacidad de maleteros");
                            int op3 = leer.nextInt();
                            switch (op3) {
                                case 1: {
                                    System.out.println("Ingrese el modelo");
                                    String modelo = leer.nextLine();
                                    modelo = leer.nextLine();
                                    listahibrido.get(ind).setModelo(modelo);

                                }
                                break;
                                case 2: {
                                    System.out.println("Ingesev  el VIn");
                                    String vin = leer.nextLine();
                                    vin = leer.nextLine();
                                    listahibrido.get(ind).setVin(vin);
                                }
                                break;
                                case 3: {
                                    System.out.println("Ingrese carroceria");
                                    String carroceria = leer.nextLine();
                                    carroceria = leer.nextLine();
                                    listahibrido.get(ind).setCarroceria(carroceria);
                                }
                                break;
                                case 4: {
                                    System.out.println("Ingrese cantiiddad de pasaajeros");
                                    int cantp = leer.nextInt();
                                    listahibrido.get(ind).setCantpasajeros(cantp);
                                }
                                break;
                                case 5: {
                                    System.out.println("Capacidad de maletero en litros");
                                    int capacidadmaletero = leer.nextInt();
                                    listahibrido.get(ind).setCapacidadmaletero(capacidadmaletero);
                                }
                                break;
                                default:

                                    System.out.println("Opcion innvalida");
                                    break;
                            }
                        }
                        break;
                        case 3: {
                            String salida = "";
                            for (Object t : listahibridoenchufable) {
                                if (t instanceof hibridoenchufable) {
                                    salida += listahibridoenchufable.indexOf(t) + ")" + t + "\n";
                                }
                            }
                            System.out.println(salida);
                            System.out.println("Ingrese el indice de que desea modificar");
                            int ind = leer.nextInt();
                            System.out.println("Que desea modificar");
                            System.out.println("1)Modelo");
                            System.out.println("2)VIN");
                            System.out.println("3)Carroceria");
                            System.out.println("4)Catidad de Pasajeros");
                            System.out.println("5)Capacidad de maleteros");
                            int op3 = leer.nextInt();
                            switch (op3) {
                                case 1: {
                                    System.out.println("Ingrese el modelo");
                                    String modelo = leer.nextLine();
                                    modelo = leer.nextLine();
                                    listahibridoenchufable.get(ind).setModelo(modelo);

                                }
                                break;
                                case 2: {
                                    System.out.println("Ingesev  el VIn");
                                    String vin = leer.nextLine();
                                    vin = leer.nextLine();
                                    listahibridoenchufable.get(ind).setVin(vin);
                                }
                                break;
                                case 3: {
                                    System.out.println("Ingrese carroceria");
                                    String carroceria = leer.nextLine();
                                    carroceria = leer.nextLine();
                                    listahibridoenchufable.get(ind).setCarroceria(carroceria);
                                }
                                break;
                                case 4: {
                                    System.out.println("Ingrese cantiiddad de pasaajeros");
                                    int cantp = leer.nextInt();
                                    listahibridoenchufable.get(ind).setCantpasajeros(cantp);
                                }
                                break;
                                case 5: {
                                    System.out.println("Capacidad de maletero en litros");
                                    int capacidadmaletero = leer.nextInt();
                                    listahibridoenchufable.get(ind).setCapacidadmaletero(capacidadmaletero);
                                }
                                break;
                                default:

                                    System.out.println("Opcion innvalida");
                                    break;
                            }
                        }
                        break;
                        case 4: {
                            String salida = "";
                            for (Object t : listaelectrico) {
                                if (t instanceof electrico) {
                                    salida += listaelectrico.indexOf(t) + ")" + t + "\n";
                                }
                            }
                            System.out.println(salida);
                            System.out.println("Ingrese el indice de que desea modificar");
                            int ind = leer.nextInt();
                            System.out.println("Que desea modificar");
                            System.out.println("1)Modelo");
                            System.out.println("2)VIN");
                            System.out.println("3)Carroceria");
                            System.out.println("4)Catidad de Pasajeros");
                            System.out.println("5)Capacidad de maleteros");
                            int op3 = leer.nextInt();
                            switch (op3) {
                                case 1: {
                                    System.out.println("Ingrese el modelo");
                                    String modelo = leer.nextLine();
                                    modelo = leer.nextLine();
                                    listaelectrico.get(ind).setModelo(modelo);

                                }
                                break;
                                case 2: {
                                    System.out.println("Ingesev  el VIn");
                                    String vin = leer.nextLine();
                                    vin = leer.nextLine();
                                    listaelectrico.get(ind).setVin(vin);
                                }
                                break;
                                case 3: {
                                    System.out.println("Ingrese carroceria");
                                    String carroceria = leer.nextLine();
                                    carroceria = leer.nextLine();
                                    listaelectrico.get(ind).setCarroceria(carroceria);
                                }
                                break;
                                case 4: {
                                    System.out.println("Ingrese cantiiddad de pasaajeros");
                                    int cantp = leer.nextInt();
                                    listaelectrico.get(ind).setCantpasajeros(cantp);
                                }
                                break;
                                case 5: {
                                    System.out.println("Capacidad de maletero en litros");
                                    int capacidadmaletero = leer.nextInt();
                                    listaelectrico.get(ind).setCapacidadmaletero(capacidadmaletero);
                                }
                                break;
                                default:

                                    System.out.println("Opcion innvalida");
                                    break;
                            }
                        }
                        break;
                        default:
                            System.out.println("opcion o valida");
                            break;
                    }
                }
                break;
                case 3: {
                    System.out.println("Que desea listar");
                    System.out.println("1)Combustion");
                    System.out.println("2)Hibrido");
                    System.out.println("3)Hibrido Enchufable");
                    System.out.println("4)Electrico");
                    int op2 = leer.nextInt();
                    switch (op2) {
                        case 1: {
                            String salida = "";
                            for (Object t : listacombustion) {
                                if (t instanceof combustion) {
                                    salida += listacombustion.indexOf(t) + ")" + t + "\n";
                                }
                            }
                            System.out.println(salida);
                        }
                        break;
                        case 2: {
                            String salida = "";
                            for (Object t : listahibrido) {
                                if (t instanceof hibrido) {
                                    salida += listahibrido.indexOf(t) + ")" + t + "\n";
                                }
                            }
                            System.out.println(salida);
                        }
                        break;
                        case 3: {
                            String salida = "";
                            for (Object t : listahibridoenchufable) {
                                if (t instanceof hibridoenchufable) {
                                    salida += listahibridoenchufable.indexOf(t) + ")" + t + "\n";
                                }
                            }
                            System.out.println(salida);
                        }
                        break;
                        case 4: {
                            String salida = "";
                            for (Object t : listaelectrico) {
                                if (t instanceof electrico) {
                                    salida += listaelectrico.indexOf(t) + ")" + t + "\n";
                                }
                            }
                            System.out.println(salida);
                        }
                        break;
                        default:
                            System.out.println("Opcion no valida");
                            break;

                    }
                }
                break;
                case 4: {
                    System.out.println("Que desea eliminar");
                    System.out.println("1)Combustion");
                    System.out.println("2)Hibrido");
                    System.out.println("3)Hibrido Enchufable");
                    System.out.println("4)Electrico");
                    int op2 = leer.nextInt();
                    switch (op2) {
                        case 1: {
                            String salida = "";
                            for (Object t : listacombustion) {
                                if (t instanceof combustion) {
                                    salida += listacombustion.indexOf(t) + ")" + t + "\n";
                                }
                            }
                            System.out.println(salida);
                            System.out.println("Ingrese el indice a eliminar");
                            int ind = leer.nextInt();
                            listacombustion.remove(ind);
                            System.out.println("Eliminado Exitosamente");
                        }
                        break;
                        case 2: {
                            String salida = "";
                            for (Object t : listahibrido) {
                                if (t instanceof hibrido) {
                                    salida += listahibrido.indexOf(t) + ")" + t + "\n";
                                }
                            }
                            System.out.println(salida);
                            System.out.println("Ingrese el indice a eliminar");
                            int ind = leer.nextInt();
                            listahibrido.remove(ind);
                            System.out.println("Eliminado Exitosamente");
                        }
                        break;
                        case 3: {
                            String salida = "";
                            for (Object t : listahibridoenchufable) {
                                if (t instanceof hibridoenchufable) {
                                    salida += listahibridoenchufable.indexOf(t) + ")" + t + "\n";
                                }
                            }
                            System.out.println(salida);
                            System.out.println("Ingrese el indice a eliminar");
                            int ind = leer.nextInt();
                            listahibridoenchufable.remove(ind);
                            System.out.println("Eliminado Exitosamente");
                        }
                        break;
                        case 4: {
                            String salida = "";
                            for (Object t : listaelectrico) {
                                if (t instanceof electrico) {
                                    salida += listaelectrico.indexOf(t) + ")" + t + "\n";
                                }
                            }
                            System.out.println(salida);
                            System.out.println("Ingrese el indice a eliminar");
                            int ind = leer.nextInt();
                            listaelectrico.remove(ind);
                            System.out.println("Eliminado Exitosamente");
                        }
                        break;
                        default:
                            System.out.println("Opcion no valida");
                            break;

                    }
                }
                break;
                case 5: {
                    System.out.println("Que desea Calcular");
                    System.out.println("1)Combustion");
                    System.out.println("2)Hibrido");
                    System.out.println("3)Hibrido Enchufable");
                    System.out.println("4)Electrico");
                    int op2 = leer.nextInt();
                    switch (op2) {
                        case 1: {
                            String salida = "";
                            for (Object t : listacombustion) {
                                if (t instanceof combustion) {
                                    salida += listacombustion.indexOf(t) + ")" + t + "\n";
                                }
                            }
                            System.out.println(salida);
                            System.out.println("Ingrese el indice a calcular ");
                            int ind = leer.nextInt();
                            try {
                                System.out.println("La cantidad de dias para la reparacion es de:" + validarcombustion(listacombustion.get(ind).getCantpasajeros(), listacombustion.get(ind).getConsumodecombustible(), listacombustion.get(ind).getDuracionaceite()));
                            } catch (exception e) {
                                System.out.println("Debe modificar Los valores no puede ser meenor ");
                                System.out.println(e.getMessage());
                                  System.out.println("Ingrese el modelo");
                                    String modelo = leer.nextLine();
                                    modelo = leer.nextLine();
                                    listacombustion.get(ind).setModelo(modelo);
                                    System.out.println("Ingesev  el VIn");
                                    String vin = leer.nextLine();
                                    vin = leer.nextLine();
                                    listacombustion.get(ind).setVin(vin);
                               
                                    System.out.println("Ingrese carroceria");
                                    String carroceria = leer.nextLine();
                                    carroceria = leer.nextLine();
                                    listacombustion.get(ind).setCarroceria(carroceria);
                                
                                    System.out.println("Ingrese cantiiddad de pasaajeros");
                                    int cantp = leer.nextInt();
                                    listacombustion.get(ind).setCantpasajeros(cantp);
                               
                                    System.out.println("Capacidad de maletero en litros");
                                    int capacidadmaletero = leer.nextInt();
                                    listacombustion.get(ind).setCapacidadmaletero(capacidadmaletero);
                            }
                        }
                        break;
                        case 2: {
                             String salida = "";
                            for (Object t : listahibrido) {
                                if (t instanceof hibrido) {
                                    salida += listahibrido.indexOf(t) + ")" + t + "\n";
                                }
                            }
                            System.out.println(salida);
                            System.out.println("Ingrese el indice a calcular ");
                            int ind = leer.nextInt();
                            try {
                                System.out.println("La cantidad de dias para la reparacion es de:" + validarhibrido(listahibrido.get(ind).getCapacidadbateria(), listahibrido.get(ind).getCapacidadmaletero(), listahibrido.get(ind).getCantpasajeros()));
                            } catch (exception e) {
                                System.out.println(e.getMessage());
                                System.out.println("Ingrese el modelo");
                                    String modelo = leer.nextLine();
                                    modelo = leer.nextLine();
                                    listahibrido.get(ind).setModelo(modelo);

                               
                                    System.out.println("Ingesev  el VIn");
                                    String vin = leer.nextLine();
                                    vin = leer.nextLine();
                                    listahibrido.get(ind).setVin(vin);
                              
                                    System.out.println("Ingrese carroceria");
                                    String carroceria = leer.nextLine();
                                    carroceria = leer.nextLine();
                                    listahibrido.get(ind).setCarroceria(carroceria);
                               
                                    System.out.println("Ingrese cantiiddad de pasaajeros");
                                    int cantp = leer.nextInt();
                                    listahibrido.get(ind).setCantpasajeros(cantp);
                             
                                    System.out.println("Capacidad de maletero en litros");
                                    int capacidadmaletero = leer.nextInt();
                                    listahibrido.get(ind).setCapacidadmaletero(capacidadmaletero);
                            }
                        }
                        break;
                        case 3: {
                             String salida = "";
                            for (Object t : listahibridoenchufable) {
                                if (t instanceof hibridoenchufable) {
                                    salida += listahibridoenchufable.indexOf(t) + ")" + t + "\n";
                                }
                            }
                            System.out.println(salida);
                            System.out.println("Ingrese el indice a calcular ");
                            int ind = leer.nextInt();
                            try {
                                System.out.println("La cantidad de dias para la reparacion es de:" + validarhibridoenchufable(listahibridoenchufable.get(ind).getCantpasajeros(), listahibridoenchufable.get(ind).getCantidaddemotores(), listahibridoenchufable.get(ind).getCantidaddekilometros(),listahibridoenchufable.get(ind).getCapacidadderemolque()));
                            } catch (exception e) {
                                System.out.println("Ingrese el modelo");
                                    String modelo = leer.nextLine();
                                    modelo = leer.nextLine();
                                    listahibridoenchufable.get(ind).setModelo(modelo);

                                    System.out.println("Ingesev  el VIn");
                                    String vin = leer.nextLine();
                                    vin = leer.nextLine();
                                    listahibridoenchufable.get(ind).setVin(vin);
                            
                                    System.out.println("Ingrese carroceria");
                                    String carroceria = leer.nextLine();
                                    carroceria = leer.nextLine();
                                    listahibridoenchufable.get(ind).setCarroceria(carroceria);
                               
                                    System.out.println("Ingrese cantiiddad de pasaajeros");
                                    int cantp = leer.nextInt();
                                    listahibridoenchufable.get(ind).setCantpasajeros(cantp);
                               
                                    System.out.println("Capacidad de maletero en litros");
                                    int capacidadmaletero = leer.nextInt();
                                    listahibridoenchufable.get(ind).setCapacidadmaletero(capacidadmaletero);
                                System.out.println(e.getMessage());
                            }
                        }
                        break;
                        case 4: {
                              String salida = "";
                            for (Object t : listaelectrico) {
                                if (t instanceof electrico) {
                                    salida += listaelectrico.indexOf(t) + ")" + t + "\n";
                                }
                            }
                            System.out.println(salida);
                            System.out.println("Ingrese el indice a calcular ");
                            int ind = leer.nextInt();
                            try {
                                System.out.println("La cantidad de dias para la reparacion es de:" + electrico(listaelectrico.get(ind).getCantidaddebaterias(), listaelectrico.get(ind).getTiempodecarga(), listaelectrico.get(ind).getCantpasajeros(),listaelectrico.get(ind).getAcceleracion()));
                            } catch (exception e) {
                                System.out.println(e.getMessage());
                                 System.out.println("Ingrese el modelo");
                                    String modelo = leer.nextLine();
                                    modelo = leer.nextLine();
                                    listaelectrico.get(ind).setModelo(modelo);

                                
                                    System.out.println("Ingesev  el VIn");
                                    String vin = leer.nextLine();
                                    vin = leer.nextLine();
                                    listaelectrico.get(ind).setVin(vin);
                                
                                    System.out.println("Ingrese carroceria");
                                    String carroceria = leer.nextLine();
                                    carroceria = leer.nextLine();
                                    listaelectrico.get(ind).setCarroceria(carroceria);
                                
                              
                                    System.out.println("Ingrese cantiiddad de pasaajeros");
                                    int cantp = leer.nextInt();
                                    listaelectrico.get(ind).setCantpasajeros(cantp);
                              
                                    System.out.println("Capacidad de maletero en litros");
                                    int capacidadmaletero = leer.nextInt();
                                    listaelectrico.get(ind).setCapacidadmaletero(capacidadmaletero);
                            }
                        }
                        break;
                        default:
                            System.out.println("opcion no valida");
                            break;
                    }
                }
                break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }

    }

    static int validarcombustion(int cantpasajeros, int consumodecombustible, int duracionaceite) throws exception {
        int dias = 0;
       // int mult1 = cantpasajeros * consumodecombustible;
       // int mult2 = duracionaceite * consumodecombustible;
       // int resta = mult1 - mult2;
        dias =(2021- (((cantpasajeros)*(consumodecombustible))-(duracionaceite)*consumodecombustible));
        if (dias > 30) {
            return dias;
        } else {
            throw new exception("El carro tengra una Falla en menos de 30 dias");
            // return false;
        }
    }

    static int validarhibrido(int capacidadbateria, int capacidadmaletero,  int cantidaddepasajeros) throws exception {
        int dias = 0;
        int mult1 = capacidadbateria * capacidadmaletero;
        int div = mult1 / cantidaddepasajeros;
        dias = 2021 - div;
        if (dias > 30) {
            return dias;
        } else {
            throw new exception("El carro tengra una Falla en menos de 30 dias");
        }

    }
      static int validarhibridoenchufable( int cantidaddepasajeros,int cantidadmotores,int cantk,int capremolque) throws exception {
        int dias = 0;
        int mult1 = cantidaddepasajeros*cantidadmotores;
        int div = cantk / capremolque;
        dias = 2021-(mult1+div);
        if (dias > 30) {
            return dias;
        } else {
            throw new exception("El carro tengra una Falla en menos de 30 dias");
        }

    }
      
     static int electrico( int cantidaddebateriA,int tiempodecarga,int cantp,int aceleracion) throws exception {
        int dias = 0;
        int mult1 = tiempodecarga*cantp;
        int div = mult1 / aceleracion;
        int suma=cantidaddebateriA+div;
        dias=2021-suma;
        if (dias > 30) {
            return dias;
        } else {
            throw new exception("El carro tengra una Falla en menos de 30 dias");
        }

    }
      
    
}
