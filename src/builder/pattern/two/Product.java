package builder.pattern.two;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	private List<String> parts;
	
	public Product() {
		parts = new ArrayList<>();
	}
	
	public void add(String part){
		parts.add(part);
	}
	
	public void show(){
		for (int i = 0; i < parts.size(); i++) {
			System.out.println(parts.get(i));
		}
	}
	
}
