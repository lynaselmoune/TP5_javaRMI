package Client;

import java.net.InetAddress;
import java.rmi.Naming;

public class ClientMain {
    public static void main(String[] args){
        try{
            String url = "rmi://"+ InetAddress.getLocalHost().getHostAddress() + ":"+ 1900+"/TestRMI2";
            System.out.println("lookup : "+ url);
            Server.Calculation calc = (Server.Calculation) Naming.lookup(url);
            System.out.println("Result of remote method invocation : " + calc.addition(1,2));
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
