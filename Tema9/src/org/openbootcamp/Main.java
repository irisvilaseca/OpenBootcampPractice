package org.openbootcamp;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Coche coche = new Coche();
        coche.setSonido("BRR");
        System.out.println(coche.getSonido());
        cocheElectrico.velocidadMaxima=20;
        cocheElectrico.matricula="MI 2007 CAT";
        System.out.println(cocheElectrico.compruebaMatricula("XXX"));
    }
}
    abstract class Vehiculo{
        int velocidadMaxima;
        String matricula;
        String sonido;

        //Creamos un constructor para la clase
        public Vehiculo(){
            System.out.println("HOLA");
        }
        abstract public String getSonido();

        abstract public void setSonido(String sonido);
    }
    class Coche extends Vehiculo{
        public String getSonido(){
            return "Soy un supersonido: " + this.sonido;
        };
        public void setSonido(){
            this.sonido=sonido;
        }
    }
        class Moto extends Vehiculo{

        }
    //Si ponemos final delante del nombre de una clase, esta no podrá tener subclases que hereden de ella
    final class CocheElectrico extends Coche{
        //Tiene todas las propiedades y funciones heredadas de la clase Coche y la clase Vehiculo
    }
