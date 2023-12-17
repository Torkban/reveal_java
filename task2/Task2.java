import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Task2{
	public static void main (String[] args){
 	    List<String> list_1 = new ArrayList<>();
	    List<String> list_2 = new ArrayList<>();
	    List<Float> list_21 = new ArrayList<>();
	    try (BufferedReader reader1 = new BufferedReader(new FileReader(args[0]))){
String line1;
while ((line1 = reader1.readLine()) != null) {
     list_1.add(line1);						}
		}
catch (IOException e) {
			e.printStackTrace();
		}
	
	 try (BufferedReader reader2 = new BufferedReader(new FileReader(args[1]))){
String line2;
while ((line2 = reader2.readLine()) != null) {
       list_2.add(line2);						}
		}
catch (IOException e) {
			e.printStackTrace();
		}
	
		 String[] center = list_1.get(0).split(" ");
      float x_center=Float.parseFloat(center[0]);
      float y_center=Float.parseFloat(center[1]);
      float rad= Float.parseFloat(list_1.get(1));
	int index=0;
	for (String per : list_2){
	    String[] dot = list_2.get(index).split(" ");
      float x_i=Float.parseFloat(dot[0]);
      float y_i=Float.parseFloat(dot[1]);
	    if ((x_i-x_center)*(x_i-x_center)*(y_i-y_center)*(y_i-y_center)> rad*rad)
	    {	        System.out.println(2);	    }
	    
	    else if ((x_i-x_center)*(x_i-x_center)*(y_i-y_center)*(y_i-y_center) < rad*rad)
	    {	        System.out.println(1);	    }
	    else if ((x_i-x_center)*(x_i-x_center)*(y_i-y_center)*(y_i-y_center)== rad*rad)
	    {	        System.out.println(0);	    }
	    index++;
	   }
				}
}