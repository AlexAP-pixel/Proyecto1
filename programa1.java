import java.util.Scanner; 

public class programa1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Ingresa la temperatura en grados Celsius: "); 
        double celsius = scanner.nextDouble(); 
        double fahrenheit = (celsius * 9/5) + 32; 

        System.out.println(celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit.");
        
        scanner.close(); 
    }
}
