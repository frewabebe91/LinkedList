package com.hcl;
import java.util.LinkedList;
import java.util.List; 
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<String> classes = new LinkedList<>();
        classes.add("Biology");
        classes.add("Math");
        classes.add("English");
        classes.add("Chemistry");
        
        // Displaying the current list
        System.out.println(classes); 
 

        // Use removeFirst() remove the first item from the list 
        ((LinkedList<String>) classes).addLast("Physics"); 
        System.out.println("new lists are " + classes); 
       
    }
}
