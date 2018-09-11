import java.util.*;
class WaveForm {
  public static void main(String[] args) {
    Scanner o=new Scanner(System.in);
    int row,col,n,i,j=0,max=0,k=-1,n1;
    System.out.println("Enter number of rows and cols:");
    row=o.nextInt();
    col=o.nextInt();
    int arr[][]=new int[row][col];
    System.out.println("Enter elements of array:");
    for(i=0;i<row;i++)
    {
      for(j=0;j<col;j++)
      {
        arr[i][j]=o.nextInt();
      }
    }
    for(i=0;i<row;i++)
    {
      if(k==-1)
      {
        for(k=0;k<col;k++)
        {
          System.out.print(" "+arr[i][k]);
        }
      }
      else
      {
        for(k=col-1;k>=0;k--)
        {
          System.out.print(" "+arr[i][k]);
        }
      }
      
    }
    
  }
}