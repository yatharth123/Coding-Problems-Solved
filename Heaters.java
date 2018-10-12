import java.util.*;
public class Heaters
{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[] = new int[n];
        boolean flag=false;
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int total=0;
        for(int i=0;i<n;i++)
        {
            flag=false;
            for(int j=Math.min(n-1,i+k-1);j>=Math.max(0,i-k+1);j--)
            {
                if(arr[j]==1)
                {
                    total+=1;
                    flag=true;
                    i=j+k-1;
                    break;
                }
               // System.out.println(flag);
            }
            if(!flag){System.out.println("-1");break;}
        }
        if(flag)System.out.println(total);
    }
}