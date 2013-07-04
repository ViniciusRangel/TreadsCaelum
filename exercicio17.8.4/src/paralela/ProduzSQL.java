package paralela;

import java.util.ArrayList;
import java.util.Collection;

public class ProduzSQL implements Runnable {

	private int comeco;
	private int fim;
	private ArrayList<String> sqls;
	
	public ProduzSQL(int comeco, int fim, ArrayList<String> sqls) {
		this.comeco = comeco;
		this.fim = fim;
		this.sqls = sqls;
	}
	
	public void run() {
		for (int i = comeco; i < fim; i++) {
			sqls.add("SQL"+i);
		}
	}

}
