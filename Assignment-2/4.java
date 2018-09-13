import java.util.*;
class Sub
{
    public static void SubString(String str, int n)
    {
       for (int i = 0; i < n; i++) 
           for (int j = i+1; j <= n; j++)
             System.out.println(str.substring(i, j));
    }
 
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter String");
        String str=a.nextLine();
        SubString(str, str.length());
    }
}