package Server;

import java.net.InetAddress;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServerMain {
    public static void main(String[] args) {
        try{
            LocateRegistry.createRegistry(1900);
            Calculation calc = new CalculationImp();
            String url = "rmi://" + InetAddress.getLocalHost().getHostAddress() + ":" + 1900 + "/TestRMI2";
            System.out.println("Enregistrement de l'objet avec l'url :" + url);
            Naming.rebind(url, calc);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
