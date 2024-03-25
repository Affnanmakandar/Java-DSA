import java.util.*;
class JavaBasics{
    public static void main(String args[]){
        // type conversion
// int a= 25;
// long b=a;
// System.out.println(b); 
// Type promotion 
// char a = 'a'; //ascii 98
// char b = 'b'; //ascii 97
// char c = a-b; It will give an error due to conversion from int a,b to char because we already typecast char into int
// Type cast char to int
// System.out.println((int) (b));
// System.out.println((int) (a));
// System.out.println(b-a);
// short a = 5;
// byte b = 25;
// char c = 'c';
// (byte )bt =( a + b + c); int se byte mei convert karnna possible nhi hai toh typecast kar sakte hai
int a = 10;
float b = 20.25f;
long c = 25;
double d = 30;
double ans = a + b+ c+d; //conversion of all datatypes of double 
System.out.println(ans);

    }
}