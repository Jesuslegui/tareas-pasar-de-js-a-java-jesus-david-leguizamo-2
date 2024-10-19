
/* 
var numerosNaturalesASumar=0, control=1, sumaNumerosNaturales=0;

numerosNaturalesASumar= prompt("Ingrese el valor de los primeros números naturales que desea sumar");
while (numerosNaturalesASumar>=control) {
    sumaNumerosNaturales=sumaNumerosNaturales+control;
    control=control+1;

}
alert("La suma de los "+numerosNaturalesASumar + " primeros números naturales es igual a "+ sumaNumerosNaturales);
*/
import javax.swing.JOptionPane;

public class pasaar {
    public int sumarNumerosNaturales(int numerosNaturalesASumar) {
        int control = 1;
        int sumaNumerosNaturales = 0;

        while (numerosNaturalesASumar >= control) {
            sumaNumerosNaturales += control;
            control++;
        }
        
        return sumaNumerosNaturales;
    }

    public int solicitarNumero() {
        String input = JOptionPane.showInputDialog("Ingrese el valor de los primeros números naturales que desea sumar");
        return Integer.parseInt(input);
    }
 
    public void mostrarResultado(int numerosNaturalesASumar, int sumaNumerosNaturales) {
        JOptionPane.showMessageDialog(null, "La suma de los " + numerosNaturalesASumar + " primeros números naturales es igual a " + sumaNumerosNaturales);
    }
}
