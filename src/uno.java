import java.text.DecimalFormat;
import java.util.Scanner;

public class uno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat dcm = new DecimalFormat("#0.00");
        double peso = 0, altura = 0, imc=0;

        System.out.print(">Ingrese el peso en kg del alumno: ");
        peso=sc.nextDouble();

        System.out.print(">Ingrese la altura en m del alumno: ");
        altura = sc.nextDouble();

        imc = (peso)/(altura * altura);

        System.out.print("IMC = " + dcm.format(imc) );

    }

}
