import java.io.*;
import java.util.*;

public class FindingPairWithDiff {

    public static void main(String[] args) {
        List<Integer> l =new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        
        for(int i=0;i<n;i++)
            l.add(sc.nextInt());
	/*
		for(int i: l)
		System.out.print(i);
		System.out.println();
        */
	sc.close();
	Collections.sort(l);
        int j= pairWithDiff(l,k);
        System.out.println(j);
    }
    public static int pairWithDiff(List<Integer> l,int k)
    {	
        int j=0;
        Map<Integer,Integer> m= new HashMap<>();
        for(int i: l)
        {
		//System.out.println(m);
        	//System.out.println(i);
                if(m.containsKey(i))
                j++;
                m.put(i+k,i);
	}    
            
        
        return j;
    }					    
}