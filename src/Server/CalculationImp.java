package Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculationImp extends UnicastRemoteObject implements Calculation {
    protected CalculationImp() throws RemoteException {
        super();
    }

    @Override
    public int addition(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int subtraction(int a, int b) throws RemoteException {
        return a-b;
    }

    @Override
    public int division(int a, int b) throws RemoteException {
        return a/b;
    }

    @Override
    public int multiplication(int a, int b) throws RemoteException {
        return a*b;
    }
}
