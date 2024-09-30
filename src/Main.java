import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
dados d = new dados();
        System.out.print("Name: ");
        d.nome = sc.nextLine();

        System.out.print("Gross salary: ");
        d.salario = sc.nextDouble();

        System.out.print("Tax: ");
        d.taxa = sc.nextDouble();

        System.out.println("Employee: " + d);

        System.out.print("Which percentage to increase salary? ");
        double percent = sc.nextDouble();

        System.out.print("Updated data: " + d.nome + ", $ " + d.salario(percent) );




    }
}