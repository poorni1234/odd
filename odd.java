import java.util.Scanner;
public class Oddno
{
  public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int i;
        for(i=a;i<b;i++)
        {
            if(i%2!=0)
            {
                System.out.println("odd numbers"+i);
            }
        }
    }
}
