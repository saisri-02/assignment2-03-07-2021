import java.util.*;
public class Main
{
public static void main(String args[ ])
{
Scanner sc=new Scanner(System.in);
int n,i,j,k;
System.out.println("Enter n value : ");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
    for(j=1;j<=(2*i-1);j++)
    {
         System.out.print("*");
    }
    System.out.println( );
}
}
}