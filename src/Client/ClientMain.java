package Client;

import java.net.InetAddress;
import java.rmi.Naming;
import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args){
        try{
            String url = "rmi://"+ InetAddress.getLocalHost().getHostAddress() + ":"+ 1900+"/TestRMI2";
            System.out.println("lookup : "+ url);
            Server.Calculation calc = (Server.Calculation) Naming.lookup(url);

            Scanner scan = new Scanner(System.in);
            System.out.println("input a :");
            int a = scan.nextInt();
            System.out.println("input b :");
            int b = scan.nextInt();
            System.out.println("input operator + - / * :");
            String op = scan.next();

            switch(op){
                case "+":
                    System.out.println("Result of remote method invocation addition : " + calc.addition(a,b));
                    break;

                case "-":
                    System.out.println("Result of remote method invocation subtraction : " + calc.subtraction(a,b));
                    break;
                case "/":
                    System.out.println("Result of remote method invocation division : " + calc.division(a,b));
                    break;
                case "*":
                    System.out.println("Result of remote method invocation multiplication : " + calc.multiplication(a,b));
                    break;
            }

//            System.out.println("Result of remote method invocation subtraction: " + calc.subtraction(2,1));
//            System.out.println("Result of remote method invocation division : " + calc.division(4,2));
//            System.out.println("Result of remote method invocation multiplication : " + calc.multiplication(3,2));
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
