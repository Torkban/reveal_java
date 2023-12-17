import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Task1 {
	public static void main (String[] args){
int n = Integer.parseInt(args[0]);
int m = Integer.parseInt(args[1]);
List<Integer> list = new ArrayList<>();
int[] array1 = new int[n];
for(int i = 0; i < n; i++) {
   array1[i]=i+1;
}

int ost=n;
int index=0;
boolean flagg = true;
list.add(array1[0]);
while(flagg) {
    
   if (ost >= m)  {ost=ost-m+1; index=n-ost;}
	else if (ost < m) { ost=n-m+ost+1; index=n-ost;}
			else {}
if (index==0){break;}
list.add(array1[index]);
}
for (int lst : list ) {
	System.out.print(lst);
		      }
		      				}
}