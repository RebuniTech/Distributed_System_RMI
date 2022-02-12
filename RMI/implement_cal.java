import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class implement_cal extends UnicastRemoteObject implements cal {


   public implement_cal() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a+b;
    }
}
