import java.util.*;
class JavaBasics{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        // example of switch statement
        // int number = 4 ;
        // switch (number){
        //     case 1:
        //         System.out.println("burger");
        //         break;
        //          case 2:
        //         System.out.println("samosa");
        //         break;
        //          case 3 :
        //         System.out.println("momos");
        //         break;
        //         default:
        //             System.out.print("Sapne se uth jaa bacche");
                
        // }
        // building a calculator using switch stmt
        int a , b;
        System.out.println("enter a : ");
        a = sc.nextInt();
           System.out.println("enter b : ");
        b = sc.nextInt();
           System.out.println("enter operator : ");
        char operator = sc.next().charAt(0);
        switch (operator){
            case '+': System.out.print(a+b);
            break;
            case '-':System.out.print (a-b);
            break;
             case '*':System.out.print (a*b);
            break;
             case '/':System.out.print (a/b);
            break;
             case '%':System.out.print (a%b);
            break;
        }
    }
}