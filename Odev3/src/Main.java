import java.util.LinkedHashMap;
import java.util.Scanner;


public class Main {


	static String isimal() 
	{
		Scanner k=new Scanner(System.in);
		String ism=k.next();
		return ism;
	}

    static void harfsay()
    {
    	String isim=isimal();
    	LinkedHashMap<Character, Integer> map=new LinkedHashMap();
    	for (int i = 0; i <isim.length() ;i++) 
    	{
    	     map.put(isim.charAt(i), 0);
    	}
    	for (int i = 0; i <isim.length() ;i++) 
    	{
    	     int sayac=map.get(isim.charAt(i));
    	     map.put(isim.charAt(i), sayac+1);
    	}
    	
    	System.out.println(map);
    }
    public static void main(String[] args) {
	
    	harfsay();

    }
}
