import java.util.Scanner;
public class checkthegreatestnumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        float a = sc.nextFloat();
        System.out.println("enter the second number:");
        float b = sc.nextFloat();
        if(a > b) {
            System.out.println("first number is greater");
        }
            else if(a<b){
            System.out.println("second number is greater");
            }
            else{
            System.out.println("both numbers are equal");
        }








    }
}
