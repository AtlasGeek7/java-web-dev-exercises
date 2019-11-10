package exercises;
import java.util.Scanner;
public class GasMileage {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter miles driven: ");
        double miles = in.nextDouble();
        System.out.println("Enter gas consumed:");
        double gas = in.nextDouble();
        System.out.println("Your miles-per-gallon is: " + miles / gas);
    }
}