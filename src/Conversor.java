
/**
 *
 * @author Jose
 */
import java.util.Scanner;

/**
 * Esta clase representa un conversor de temperatura que convierte grados Celsius a grados Fahrenheit.
 */
public class Conversor {
    /**
     * El método principal que ejecuta el conversor de temperatura.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " grados Celsius es equivalente a " + fahrenheit + " grados Fahrenheit");

        scanner.close();
    }
}

