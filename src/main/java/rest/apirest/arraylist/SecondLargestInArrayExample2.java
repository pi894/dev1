package rest.apirest.arraylist;
import java.util.*;  
import java.util.*;  
public class SecondLargestInArrayExample2{  
public static int getSecondLargest(Integer[] a, int total){  
List<Integer> list=Arrays.asList(a);  
Collections.sort(list);  
int element=list.get(total-2);  
return element;  
}  
public static void main(String args[]){  
Integer a[]={1,2,5,6,3,2};  

System.out.println("Second Largest: "+getSecondLargest(a,7));  
}}  