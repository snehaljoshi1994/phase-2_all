package collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		
		 map1.put("item1", 100);
		 map1.put("item2", 200);
		 map1.put("item3", 100);
		 map1.put("item4", 50);
		 
		 System.out.println(map1);

		 //update the value of existing item
		 map1.put("item2", 300);
		 System.out.println(map1);
	
		 //find the value of item4
		 System.out.println("The value of item4 is " + map1.get("item4"));
	
		 //remove item 2
		 
		 map1.remove("item2");
		 System.out.println(map1);
		 
		 //itrate through map
		 for(int value:map1.values()) {
			 System.out.println("Value is " + value);
			
		 }
		 for(String key:map1.keySet()) {
				
				System.out.println("The key is " + key);
				System.out.println("The value is " + map1.get(key));
			}
		 
		 
		// find out occurrence of each word in the string using hashmap
			
			
			String str1 = "clean world green world happy world";
		 
	        HashMap<String, Integer> wordCountMap = new HashMap<>();

	        String[] words = str1.split(" ");
	        
	        int count;
	        for (String word : words) {
	            
	        	count = wordCountMap.getOrDefault(word, 0);
	        	wordCountMap.put(word, count+1);
	        }
	        
	        // ("clean",1) , count = 0
	        // ("green",1) , count = 0
	        // ("happy",1) , count = 0
	        // ("world",3) , count = 2
	        
	        System.out.println(wordCountMap);		 
	}

}
