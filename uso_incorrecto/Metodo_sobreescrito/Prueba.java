package uso_incorrecto.Metodo_sobreescrito;

public class Prueba {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Amira Gonzales", 1000);
        gerente.calcularSalario(); 
        
    }
}

