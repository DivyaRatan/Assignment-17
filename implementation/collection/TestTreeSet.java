//Creating a Treeset and adding string to it 
package implementation.collection; 
  
 import java.util.TreeSet; 
  
 public class TestTreeSet { 
  
 public static void main(String args[])  
 { 
 TreeSet<String> treeset = new TreeSet<>(); 
  
 treeset.add("Ryan"); 
 treeset.add("John"); 
 treeset.add("Anna"); 
 treeset.add("Emma"); 
 treeset.add("Jake"); 
  
 treeset.stream().forEach((name) -> System.out.println(name)); 
  
 } 
  
 } 
