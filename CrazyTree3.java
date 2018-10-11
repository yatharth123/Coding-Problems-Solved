
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int temp=l;
        long arr[][] = new long[l][(int)Math.pow(2,l-1)];
        int m=1299709;
        while(temp>0)
        {
            for(int i=0;i<(int)Math.pow(2,temp-1);i++)
            {
                if(temp==l)
                {
                    arr[temp-1][i]=i+1;
                }
                else
                {
                    arr[temp-1][i]=(long)((arr[temp][2*i]%m)*arr[temp][2*i+1]%m)%m;
                }
                //System.out.print(arr[temp-1][i]+" ");
            }
            temp--;
        }
        temp=l;
        while(temp>0)
        {
            for(int i=0;i<(int)Math.pow(2,temp-1);i++)
            {
                if(i>0)
                {
                    arr[temp-1][i]= (long)(arr[temp-1][i]+arr[temp-1][i-1])%m;
                }
            }
            temp--;
        }
        //System.out.println();
        int q = sc.nextInt();
        for(int i=0;i<q;i++)
        {
            long sum=0;
            int row = sc.nextInt()-1;
            int start = sc.nextInt()-1;
            int last = sc.nextInt()-1;
            sum+=arr[row][last];
            if(start>0)
            {
                sum-=arr[row][start-1];
            }
            sum = sum%m;
            if(sum<0)
            {
                sum+=m;
            }
            System.out.println(sum);
        }
    }
}
