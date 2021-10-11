package CountListElement;
import java.util.*;
public class CountListElement {
	public static void main(String args[]) {
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(4);
		al.add("yogesh");
		long count=al.stream().count();
		System.out.println("Number of element in list : "+count);
	}

}
