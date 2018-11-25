import java.util.HashMap;
import java.io.*;
class Typing
{
    public static void main(String args[])
    {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
            {
                HashMap<String,Integer> hm = new HashMap<String,Integer>();
                int n = Integer.parseInt(br.readLine());
                int sum=0;
    
                for(int j=0;j<n;j++)
                {
                    int count=0;
                    String str = br.readLine();
                    if(!hm.containsKey(str))
                    {
                        char c;
                        // boolean left=false,right=false;
                        for(int i=1;i<str.length();i++)
                        {
                            c = str.charAt(i);
                            if((c=='d'||c=='f')&&(str.charAt(i-1)=='d'||str.charAt(i-1)=='f')||(c=='j'||c=='k')&&(str.charAt(i-1)=='j'||str.charAt(i-1)=='k'))
                                    count+=2;
                            count+=2;
                         
                        }
                        System.out.print(str+" ");
                        
                        hm.put(str,count);
                        sum+=hm.get(str);
                    }
                    else{
                        sum+=hm.get(str)/2;
                    }
                }
                
                System.out.println(sum);
            }
        }catch(Exception e){e.printStackTrace();}
    }
}