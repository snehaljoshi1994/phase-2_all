package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = {"abc", "pqr", "xyz"};
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("Snehal");
		list1.add("Shriram");
		list1.add("Shataxi");
		
		//print all data
		System.out.println(list1);
		
		//remove 0 th postion data
		list1.remove(0);
		
		System.out.println(list1);
		
		//access 3nd postion data
		System.out.println("the data at 2nd data " + list1.get(1));
		
        list1.add("vrushali");
        list1.add("vidhya");
        System.out.println(list1);
        
        //print the last postion name
        System.out.println("Last name is " + list1.get(list1.size()-1));
        
        //Change the value at 3rd position
        
        list1.set(2, "vrunda");
        System.out.println(list1);
        
        //itrate through the list 
        for(int i=0;i<list1.size();i++) {
        	//System.out.println("The value at index " + i + list1.get(i));
        	
        	if(list1.get(i).equals("Shataxi")) {
        		System.out.println("The Shataxi is at index " + i);
        	
        		
        	}
        	for(String name:list1) {
    			
    			System.out.println(name);
    		}
        }
     // Sorting of the data in ascending order
     		Collections.sort(list1);
     		System.out.println(list1);
     		
     		// Sorting of the data in descending order
     		Collections.sort(list1,Collections.reverseOrder());
     		System.out.println(list1);
     	}


	}


