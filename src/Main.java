import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("porfavor digite los grados centigrados en celsius");
       double gradosC = scanner.nextDouble();

        double fahrenheit = (gradosC * 9/5) + 32;

        double kelvin = gradosC + 273.15;

        System.out.println(gradosC+" celsius en fahrenheit es igual a\n "+fahrenheit
        +" grados fahrenheit y a \n"+kelvin+"grados kelvin");

    }
}