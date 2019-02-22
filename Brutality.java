import java.util.*;

public class Brutality
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[][] = new int[n][2];
        long sum = 0;
        
        for(int i=0;i<n;++i){a[i][0] = sc.nextInt();}
        String s = sc.next();
        for(int i=0;i<n;++i)a[i][1] = s.charAt(i)-'a';
        // Arrays.sort(a, new SortByCol());
        // Arrays.parallelSort(a);
        int cnt = 1;

        for(int i=0;i<(n);)
        {
            cnt=1;
            int j = i+1;
            while(j<n&&a[j][1]==a[i][1])
            {
                cnt++;
                j++;
            }
            //System.out.println(cnt);
            if(cnt>k)
                Arrays.sort(a,i,j, new SortByCol());
            i=j;
        }
        // for(int i=0;i<n;++i) System.out.println(a[i][0]+" "+a[i][1]);
        for(int i=0;i<n;++i)
        {
            cnt = 1;
            int j=i+1;
            sum += 1L*a[i][0];
            while(j<n&&a[j][1]==a[i][1])
            {
                cnt++;
                if(cnt<=k) sum += 1L*a[j][0];
                j++;
                // System.out.println("Inner loop: "+sum);
            }
            i = j-1;
            // System.out.println(sum);
        }
        System.out.println(sum);
    }
    
}
class SortByCol implements Comparator<int[]>
{
    public int compare(final int[] e1, final int[] e2)
    {
        if(e1[0]<e2[0])return 1;
        return -1;
    }
}
