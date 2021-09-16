import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class swapNoExtra {
    public static void main(String[] args) throws IOException{
        
        int a, b; // 10 20
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        System.out.println("Enter the 2 no's to be swapped ");
        a = Integer.parseInt(br.readLine());
        b =  Integer.parseInt(br.readLine());
        System.out.println("Swapping starts from here.");
        a = a + b;
        b = b - a;
        a = a - b;
        System.out.printf("After swapping values are A = %d, B = %d", a,b);
        
    }
}
