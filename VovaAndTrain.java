import java.util.*;
public class VovaAndTrain
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            long L = sc.nextLong();
            long v = sc.nextLong();
            long l = sc.nextLong();
            long r = sc.nextLong();
            long temp=0;
            if(l<v)
                temp=r/v;
            else
                temp=r/v-(long)Math.ceil((double)l/v)+1;
            System.out.println(L/v-temp);
        }
        
    }
}