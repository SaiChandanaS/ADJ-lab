package rmiconcept;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer extends UnicastRemoteObject implements Multiplication {
	public RMIServer() throws RemoteException {
		super();
	}

	public int multiply(int a,int b) throws RemoteException {
		return a*b;
	}

	public static void main(String[] args) throws Exception {
		RMIServer server = new RMIServer();
		System.out.println("RMI Server is running");
		Naming.rebind("multiplicationServer", server);
	}
}