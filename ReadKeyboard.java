import java.util.*;

public class ReadKeyboard
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		sc.useRadix(4);
		int x= sc.nextInt();
		System.out.println(x);
	}
}