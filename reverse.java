import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

class revMethods{
     StringBuffer strRev(String val){
         StringBuffer returnVal = new StringBuffer();
         for(int i = (val.length()-1); i >=0; i--){
            returnVal =  returnVal.append(val.charAt(i));
         }
        
        return returnVal;
    }

//     StringBuffer strRevM1(String val){
//         StringBuffer strRev= new StringBuffer();
//         for(int i = 0; )
//     }

}

class reverse{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string to be converted..");
        String val = br.readLine();
        revMethods rm = new revMethods();
        System.out.println(rm.strRev(val));
    

    }
}