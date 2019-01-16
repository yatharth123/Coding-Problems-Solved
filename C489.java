import java.util.*;
public class C489{
    static String st ="";
    public static void greatest(int m,int s)
    {
        if(m==0) return;
        // System.out.println(m+" "+s);
        if(s>=9)
        {    st += '9';
            greatest(m-1,s-9);
        }
        else if(s>=0)
        {
            st += (char)(s+'0');
            greatest(m-1,0);
        }
    }
    
    public static void least(int m, int s)
    {
        // System.out.println(st+" "+s+" "+m);
        if(s>9)
        {
            least(m-1,s-9);
            st += '9';
        }    
        else if(s<=9)
        {
            if(m!=1)
            {
                least(m-1,1);
                st += (char)(s-1+'0');
            }
            else
            st += (char)(s+'0');
            
        }   
        // return least(m-1,s-9)*10+9;
    }
    
    public static void solve(int m,int s)
    {
        if(s>9*m||s==0&&m>1)
            System.out.println("-1 -1");
        else
        {
            least(m,s);
            System.out.println(st);
            
            st = "";
            
            greatest(m,s);
            System.out.println(st);
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int s = sc.nextInt();
        solve(m,s);
    }
}