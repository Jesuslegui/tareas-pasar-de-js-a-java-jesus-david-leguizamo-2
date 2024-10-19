public class ejecutador {
    public static void main(String[] args) {
     
        pasaar suma = new pasaar();

        int numerosNaturalesASumar = suma.solicitarNumero();

        // calcula la suma
        int resultado = suma.sumarNumerosNaturales(numerosNaturalesASumar);

        // resultado 
        suma.mostrarResultado(numerosNaturalesASumar, resultado);
    }
}
