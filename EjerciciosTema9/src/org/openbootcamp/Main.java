package org.openbootcamp;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(45);
        cliente.setTelefono("687192836");
        cliente.setNombre("Pepito");
        System.out.println("El cliente se llama "+ cliente.getNombre()+ ", tiene "+ cliente.getEdad()+ " años y su teléfono es " +cliente.getTelefono()+".");
    }
}
    class Persona {
        private int edad;
        private String nombre;
        private String telefono;

        public int getEdad() {
            return this.edad;
        }
        public void setEdad(int edad){
            this.edad=edad;
        }
        public String getNombre(){
            return this.nombre;
        }
        public void setNombre(String nombre){
            this.nombre=nombre;
        }
        public String getTelefono(){
            return this.telefono;
        }
        public void setTelefono(String telefono){
            this.telefono=telefono;
        }
    }
    class Cliente extends Persona{
        private float credito;

        public float getCredito(){
            return this.credito;
        }
        public void setCredito(float credito){
            this.credito=credito;
        }

    }
    class Trabajador extends Persona{
        private float salario;
        public float getSalario(){
            return this.salario;
        }
        public void setSalario(float salario){
            this.salario=salario;
        }
    }