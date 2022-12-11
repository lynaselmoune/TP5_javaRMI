package Server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculation extends Remote {
    public int addition(int a, int b) throws RemoteException;
    public int subtraction(int a, int b) throws RemoteException;
    public int division(int a, int b) throws RemoteException;
    public int multiplication(int a, int b) throws RemoteException;
}
