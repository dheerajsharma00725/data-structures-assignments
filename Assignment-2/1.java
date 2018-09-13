import java.util.Scanner;
class Palindrome {
  public boolean palindrome(String p)
  {
    int i,j,c=0;
    for(i=0,j=p.length()-1;i<p.length()/2;i++,j--)
    {
      if(p.charAt(i)==p.charAt(j))
        c++;
      else
        break;
    }
    if(c==(p.length()/2))
    { 
    return true;
    }
    else
    return false;
}
  public static void main(String[] args) {
    Scanner o=new Scanner(System.in);
    Palindrome q=new Palindrome();
    System.out.println("Enter string:");
    String a=o.nextLine();
    if(q.palindrome(a))
        System.out.println("True");
    else
        System.out.println("False");
  }
}