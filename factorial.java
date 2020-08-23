import java.util.Scanner;
public class factorial {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System .in);
		int x=sc.nextInt();
		int fact=1;
		for(int i=x;x>=1;x--) {
			fact*=x;
		}System.out.println("factorial is "+fact);	
	}

}
