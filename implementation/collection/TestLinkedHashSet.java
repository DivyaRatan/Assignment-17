//Creating hashset and adding string to it
package implementation.collection; 

  
 import java.util.LinkedHashSet; 
  
 public class TestLinkedHashSet { 
  
 public static void main(String args[]) { 
  
 LinkedHashSet<String> linkedhashset = new LinkedHashSet<>(); 
  
 linkedhashset.add("Ryan"); 
 linkedhashset.add("John"); 
 linkedhashset.add("Anna"); 
 linkedhashset.add("Emma"); 
 linkedhashset.add("Taylor"); 
  
 linkedhashset.stream().forEach((name) -> System.out.println(name)); 
 } 
 } 
