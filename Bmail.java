import java.util.*;
public class Bmail
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a1[] = new int[n+1];
        a1[0]=0;
        a1[1]=0;
        for(int i=2;i<=n;i++)
        {
            a1[i]=sc.nextInt();
        }
        Stack<Integer> st = new Stack<Integer>();
        st.push(n);
        for(int i=n;i>1;i=a1[i])
        {
            st.push(a1[i]);
        }
        while(!st.empty())
            System.out.print(st.pop()+" ");
    }
}