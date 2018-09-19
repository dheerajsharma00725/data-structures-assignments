import java.util.*;
class Fibonacci
 {
  public int Fib(int n)
  {
    if(n<=1)
    return n;
    return Fib(n-1)+Fib(n-2);
  }
  public static void main(String[] args) 
  {
    Fibonacci m=new Fibonacci();
    int n,i,num;
    Scanner o=new Scanner(System.in);
    System.out.println("enter Number");
    n=o.nextInt();
    int a=m.Fib(n);
    System.out.println(a);
    
  }
}