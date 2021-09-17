import java.lang.*;
public class largesno {
   public static void main(String[] args){
    int max=0;   
    int length = args[0].length();
       for(int i = 0; i<length; i++){
        if(Integer.parseInt(String.valueOf(args[0].charAt(i))) > max){
           max = Integer.parseInt(String.valueOf(args[0].charAt(i)));
        }

       }
       System.out.println(max);
       
   } 
}
