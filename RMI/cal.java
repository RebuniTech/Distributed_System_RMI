import java.rmi.*;

 interface cal extends  Remote{
     public int add(int a,int b) throws RemoteException;

}
