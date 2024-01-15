import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner n= new Scanner(System.in);
        System.out.println("DIgite um numero para tabular:");
        int num = n.nextInt();
        for(int i=0; i<=10; i++) {

            System.out.println(i+" X "+ num +" = " +i*num);

        }
    }
}