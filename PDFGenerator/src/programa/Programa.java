package programa;

import java.lang.Thread;

 public class Programa implements Runnable {
	 
	 private int id;
	 
	 public void setId(int id){
		 this.id = id;
	 }
	 
	 public void run(){
		 for (int i = 0;i<1000;i++){
			 System.out.println("Programa " + id + " valor: " + i);

		 }
		 
	 }

}
