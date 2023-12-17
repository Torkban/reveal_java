import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Task4 {
	public static void main (String[] args){
 	    List<Integer> list_1 = new ArrayList<>();
	    List<Integer> list_11 = new ArrayList<>();
	    List<Integer> list_min = new ArrayList<>();
	    try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))){
String line;
while ((line = reader.readLine()) != null) {
        list_1.add(Integer.parseInt(line));
}
}
catch (IOException e) {
			e.printStackTrace();
		}
	    int sr=0;

		for (int lst : list_1 ) {
    	list_11.add(lst);    	}
 
		for (int j=0; j < list_1.size(); j++ ) {
		    int list_v=0;
		   	int count = 0;
		    int index_11=0;
	    for (int lst : list_1 ) {
    	list_11.set(index_11,lst);
    	index_11++;          }
    	
    	        sr=list_11.get(j);
		for (int i=0; i < list_11.size(); i++ ) {
		    boolean tr=true;
		while (tr) {
		    list_v=list_11.get(i);
		if (list_v == sr) {
		    tr=false;}
		else if (list_v > sr) { 
		    count++;
			    list_11.set(i, (list_v-1));
			    		}
		 else if (list_v < sr) {
		     count++;
		        list_11.set(i, (list_v+1));
			   		 }   
			    }
	                                            }
	                                            list_min.add(count);
	                               	}
	
		System.out.println(Collections.min(list_min));
			
	}
}