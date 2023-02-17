package org.openbootcamp;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Coche coche = new Coche();
        coche.velocidadMaxima=20;
        coche.matricula="MI 2007 CAT";
    }
}
    class Vehiculo{
        int velocidadMaxima;
        String matricula;
    }
    class Coche extends Vehiculo{

    }
    class CocheElectrico extends Coche{

    }
