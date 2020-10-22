import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Substr1 { 
	
    

	public static void main(String args[]) 
    { 
  
        List<String> al = new ArrayList<String> (Arrays.asList("a","sdsds","sdsdsdasdas","sdsd","NULL","12132","NULL"));
         Set<String> al1 =new  LinkedHashSet<String>(al);
         
         System.out.println(al1);
         
     List<String> lh = new LinkedList<String> (al);
  //  [12132, NULL, a, sdsd, sdsds, sdsdsdasdas]
     
     System.out.println(lh);
     
  
     
     
         
         
  }
}
