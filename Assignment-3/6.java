import java.util.*;
class UniqueCharacters
{
  public String remove(String s)
{
    if ( s.length() <= 1 ) return s;
    if( s.substring(1,2).equals(s.substring(0,1)) )
      return remove(s.substring(1));
    else
     return s.substring(0,1) + remove(s.substring(1));
}  
  public static void main(String[] args) {
    UniqueCharacters m=new UniqueCharacters();
    int n,i;
    String num;
    Scanner o=new Scanner(System.in);
    System.out.println("enter string");
    num=o.nextLine();
    String a=m.remove(num);
    System.out.println(a);
    
  }
}