package geometricobject;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Scanner input = new Scanner(System.in);       
        double alas;
        double tinggi;
        double sisiMiring;
        String warna;
        String choices;
        
        System.out.println("=======T R I A N G L E=======");       
        System.out.print("Masukkan alas segitiga : ");
        alas = input.nextDouble();
        System.out.print("Masukkan tinggi segitiga : ");
        tinggi = input.nextDouble();
        System.out.print("Masukkan sisi miring segitiga : ");
        sisiMiring = input.nextDouble();
        System.out.print("Masukkan warna segitiga : ");
        warna = input.next();
        input.nextLine();
        System.out.print("Is it filled or not? (Y/N) : ");
        choices = input.nextLine();
        
        Triangle data = new Triangle(warna, choices, alas, tinggi, sisiMiring);
        System.out.println(data); 
        System.out.println("");
        
        System.out.println("=======C I R C L E=======");
	Circle circle1 = new Circle(5, "red", "Y");		
        Circle circle2 = new Circle(5, "green", "N");
	Circle circle3 = new Circle(4, "green", "Y");

        System.out.println("Lingkaran 1 :");
        System.out.println(circle1);
        System.out.println("");
        System.out.println("Lingkaran 2 :");
        System.out.println(circle2);
        System.out.println("");
        System.out.println("Lingkaran 3 :");
        System.out.println(circle3);
        System.out.println("");
        
        System.out.println("Hasil : ");
	System.out.println("Lingkaran 1 " + (circle1.equals(circle2) ? "" : "tidak ") +
	"sama dengan Lingkaran 2");

	System.out.println("Lingkaran 1 " + (circle1.equals(circle3) ? "" : "tidak ") +
	"sama dengan Lingkaran 3");
        System.out.println("");
        
        System.out.println("=======O C T A G O N=======");
        Octagon octagon1 = new Octagon(5, "Purple", "N");
	System.out.println(octagon1);
        System.out.println("");

        System.out.println("Meng-kloning Octagon...");
	Octagon octagon2 = (Octagon)octagon1.clone();

	int result = (octagon1.compareTo(octagon2));
	if (result == 1){
            System.out.println("Hasil : Octagon lebih besar daripada kloningnya.");
        }
	else if (result == -1){
            System.out.println("Hasil : Octagon lebih kecil daripada kloningnya."); 
        }
        else{
            System.out.println("Hasil : Octagon sama dengan kloningnya.");
	}
    }   
}
