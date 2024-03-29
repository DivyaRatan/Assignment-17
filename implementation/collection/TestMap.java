//Creating hashmap and adding string to it
package implementation.collection; 
  
 import java.util.HashMap; 
 import java.util.Map; 
 import java.util.Map.Entry; 
 import java.util.Set; 
  
 public class TestMap { 
  
 public static void main(String args[]) 
 { 
 Map<String, String> map = new HashMap<>(); 
  
 map.put("Ryan", "Mango"); 
 map.put("John", "Apple"); 
 map.put("Anna", "Orange"); 
 map.put("Emma", "Pineapple"); 
 map.put("Jacob", "Plum"); 
  
 Set<Entry<String, String>> set = map.entrySet(); 
  
 set.stream().forEach((e) -> System.out.println(e.getKey()+" "+e.getValue())); 
  
 Set<String> keyset = map.keySet(); 
  
 String val = map.get("Ryan"); 
 System.out.println(val); 
  
 System.out.println("Key set values are: "+keyset); 
 } 
  
 } 
