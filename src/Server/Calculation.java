package Server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculation extends Remote {
    public int addition(int a, int b) throws RemoteException;
}
