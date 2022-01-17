import java.util.*;

public class Tokenizer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String here: ");
        String sr = sc.nextLine();
        System.out.println("str: "+sr.toString());
        StringTokenizer st = new StringTokenizer(sr," ");
        System.out.println("Number of tokens: "+st.countTokens());
        System.out.println("===Display the tokens===");
        while(st.hasMoreTokens()){
            String tk = st.nextToken();
            System.out.println("Token:"+tk);
            System.out.println("Number of tokens:"+st.countTokens());
        }
        sc.close();
    }
}
