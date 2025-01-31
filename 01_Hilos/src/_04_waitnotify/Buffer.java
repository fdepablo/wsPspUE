package _04_waitnotify;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
	
	private final static int NUMERO_MAX_ELEMENTOS = 3; 
	
	private Queue<String> cola = new LinkedList<String>();
	
	public synchronized void addMensaje(String mensaje) {
		while(cola.size() == NUMERO_MAX_ELEMENTOS) {
			try {
				wait();
				//A diferencia del metodo sleep, el wait se queda esperando
				//una cantidad indefinida de tiempo, solamente se activará
				//cuando se invoque el metodo notify() sobre dicho objeto.
				//wait y notify solamente se puede poner en contextos
				//sincronizados
				//debemos de poner el wait dentro de un blucle en vez
				//de dentro de un if, ya que cuando se hace un notify
				//despertamos todos los hilos que esten en wait, es decir
				//despertaremos tanto los hilos wait de addMensaje como
				//los hilos wait de getMensaje
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		cola.offer(mensaje);//add un elemento a la cola
		//cuando ponemos un elemento a la cola, notificamos por si hay
		//algun hilo en wait en el getmensaje, ya que queremos que
		//lo consuma
		//De todos los hilos en estado wait, solamente uno se levantará
		//generalmente al azar
		notify();
	}
	
	public synchronized String getMensaje() {
		while(cola.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String mensaje = cola.poll();
		notify();
		return mensaje;
	}
	
}
