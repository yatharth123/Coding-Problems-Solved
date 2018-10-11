package myFastReader;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileNotFoundException; 
import java.util.StringTokenizer; 
public class FastReader 
{ 
    BufferedReader br; 
    StringTokenizer st; 
  
    public FastReader(String abc) 
	{ 
		try{
        br = new BufferedReader(new
    	InputStreamReader(new FileInputStream(abc))); 
    	}catch(FileNotFoundException e){
    		System.out.println("No such file is present on your system");
            //e.printStackTrace();
    	}
    }
    public FastReader()
    {
        br = new BufferedReader(new InputStreamReader(System.in));
    } 
    public String next() 
	{ 
        while (st == null || !st.hasMoreElements()) 
		{ 
            try
            { 
		        st = new StringTokenizer(br.readLine()); 
            } 
		    catch (IOException  e) 
            { 
            	e.printStackTrace(); 
        	} 
		} 
        return st.nextToken(); 
	} 
  
    public int nextInt() 
    { 
    return Integer.parseInt(next()); 
    } 
  
    public long nextLong() 
    { 
    	return Long.parseLong(next()); 
    } 
  
    public double nextDouble() 
	{ 
    	return Double.parseDouble(next()); 
    } 
  
    public String nextLine() 
    { 
        String str = ""; 
        try
        { 
                str = br.readLine(); 
        } 
        catch (IOException e) 
        { 
                e.printStackTrace(); 
    	} 
    	return str; 
    } 
}