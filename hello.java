
import java.util.Scanner;

public class hello{



    public static void main(String[]args){



        int num1,num2,result;


        Scanner sc = new Scanner(System.in);     

        System.out.println("Addition of two num");

        System.out.println("num1");

        num1=sc.nextInt();

        System.out.println("num2");
        num2=sc.nextInt();

        

        result=num1+num2;
        {
            System.out.println("addition: "+result);
        }

    }
}