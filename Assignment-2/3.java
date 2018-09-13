import java.util.Scanner;
class Frequency {
  public char Val(String p)
  {
    int i,j,c=1,max=0,pos=0;
    char s[]=new char[p.length()];
    int a[]=new int[p.length()];
    for(i=0;i<p.length();i++)
    {
      for(j=i+1;j<p.length();j++)
      {
        if(p.charAt(i)==p.charAt(j))
        c++;
      }
      a[i]=c;
      s[i]=p.charAt(i);
      c=1;
    }
    for(i=0;i<p.length();i++)
    {
      if(a[i]>max)
      {
        max=a[i];
        pos=i;
      }
    }

    return s[pos];
}
  public static void main(String[] args) {
    Scanner o=new Scanner(System.in);
    Frequency q=new Frequency();
    System.out.println("Enter String:");
    String a=o.nextLine();
    char p=q.Val(a);
    System.out.println(p);
  }
}