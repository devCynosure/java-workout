import java.util.*;

class Name{
	public static void main(String[] args){
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("May I know your name please?");
		name = sc.nextLine();
		System.out.println("Welcome "+ name);
	}
}