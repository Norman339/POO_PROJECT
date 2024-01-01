
package Exo1_project;

public class Main {

	public class MainClass {

	    public static void main(String[] args) {
	        Voiture voiture1 = new Voiture("Toyota",11923,2020);
	        Client client1 = new Client("noeman","guidom",19);
	        System.out.println("Informations sur la voiture :");
	        System.out.println(voiture1.toString());

	        System.out.println("\n Informations sur le client :");
	        System.out.println(client1.toString());
	        Client client2 = new Client("noeman","guidom",19);

	        System.out.println("\nComparaison entre deux clients :");
	        System.out.println("Les deux clients sont-ils égaux ? " + client1.equals(client2));
	    }
	}

}
