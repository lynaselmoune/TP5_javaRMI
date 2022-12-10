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
}
