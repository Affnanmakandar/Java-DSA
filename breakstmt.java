// break statement using for loop
class JavaBasics{
    public static void main (String args[]){
        for(int i = 1; i<=5; i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of the box"); //break stmt in java
        // The output will be 1 and 2 after that it will break the statement automatically
    }
}
