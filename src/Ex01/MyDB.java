package Ex01;

import java.util.HashMap;
import java.util.Iterator;

public class MyDB {
	private HashMap<String, String> table;
	public MyDB() {
		table = new HashMap<>();
		table.put("if", "if1234");
		table.put("else", "else1234");
		table.put("while", "while1234");
		table.put("for", "for1234");
		table.put("admin", "admin1234");
	}
	public HashMap<String, String> getTable() {
		return table;
	}
	public void setTable(HashMap<String, String> table) {
		this.table = table;
	}

}
