import java.rmi.*;
import java.rmi.RemoteException;
import java.rmi.registry.*;
import java.rmi.server.*;


public class Server {
    public static void main(String[] args) {
        try{

            implement_cal imp = new implement_cal();
            Registry r = LocateRegistry.createRegistry(2015);
            r.rebind("cal",imp);
            System.out.println("Server is running");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
