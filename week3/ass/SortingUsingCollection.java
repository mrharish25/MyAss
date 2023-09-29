package week3.ass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		List<String> comp=new ArrayList<String>();
		
		comp.add("HCL");
		comp.add("Wipro");
		comp.add("Aspire Systems");
		comp.add("CTS");
		System.out.println("Companies"+comp);
		Collections.sort(comp);
		System.out.println("Order in As"+comp);
		Collections.reverse(comp);
		System.out.println("Order in Rev"+comp);
	}

}
