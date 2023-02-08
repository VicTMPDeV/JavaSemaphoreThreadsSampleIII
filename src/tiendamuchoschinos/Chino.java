package tiendamuchoschinos;

import java.util.concurrent.Semaphore;

public class Chino extends Thread{
	//ATRIBUTOS
	public int numClientes;
	public Cliente colaDeClientes[];
	public Semaphore chinitoCobra;
	//CONSTRUCTOR
	public Chino(Cliente colaDeClientes [], Semaphore chinitoCobra) {
		this.colaDeClientes = new 
	}
	
	//MAIN
	public static void main(String[] args) {
		try {
			Thread.sleep(2000);
			System.out.println("CHINITO ABRE LOS OJOS Y VE LA COLA QUE TIENE...");
			Thread.sleep(2000);
			colaDeClientes = new Cliente [10];
			System.out.println("OTIA PUTA!!! CHINITO TIENE ..."+colaDeClientes.length+"... CLIENTES QUE COBLAL!!! ");
			Thread.sleep(2000);
			System.out.println("CHINITO TIENE QUE IL UNO POL UNO POLQUE SINO SE AGOBIA\n\n\n\n");
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		chinitoCobra = new Semaphore(1);
		
		for (int i = 0; i < 10 ; i++) {
			colaDeClientes[i] = new Cliente(chinitoCobra);
			colaDeClientes[i].start();
		} 
		for (int i = 0; i < 10 ; i++) {
			try {
				colaDeClientes[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("A VEL CUANTO DINELITO HA GANADO CHINITO???...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("OOOOOOOUUUUHHH!!!...CHINITO HA GANADO "+dineroDelChino+" EULITOOOOO");
	}

}
