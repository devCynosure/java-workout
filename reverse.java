import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

class revMethods{
     String strRev(String val){
        System.out.println("val is "+val.charAt(0)+val.);
        return null;
    }

}

class reverse{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string to be converted..");
        String val = br.readLine();
        revMethods rm = new revMethods();
        rm.strRev(val);

    }
}