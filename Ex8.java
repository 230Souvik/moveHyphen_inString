
package ex8;
import java.util.*;

public class Ex8 {
public String moveHyphen (String str, int n) 
    {
        String res = "";
        String res1 = "";
        String res2 = "";
        for (int i = 0; i < n; i++)
        {
            if (str.charAt (i) == '-')
                res1 = str.charAt (i)+res1;
    	    else
                res2 =  res2+str.charAt (i);
        }
        res=res1+res2;
        return res;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Ex8 e=new Ex8();
        Scanner sc = new Scanner (System.in);
        System.out.println("enter string with hypen(-)");
String str = sc.next ();
String str1=e.moveHyphen (str, str.length ());
//System.out.println (moveHyphen (str, str.length ()));
System.out.println("new stru=ing"+str1);
    }
    
}
