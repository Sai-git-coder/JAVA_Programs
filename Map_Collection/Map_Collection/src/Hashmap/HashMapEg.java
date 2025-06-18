package Hashmap;
import java.util.HashMap;
public class HashMapEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<String,Integer> marks = new HashMap<>();
        marks.put("Niki",85);
        marks.put("Nisa",99);
        marks.put("mike",78);
        System.out.println("Niki's marks:"+marks.get("Niki"));
	}

}
