//Creating treeset and adding object of Car
package implementation.collection; 
  
 import java.util.TreeSet; 
  
 import implementation.collection.Car.Car; 
  
 public class TestCarTreeSet { 
  
 public static void main(String args[]) 
 { 
 TreeSet<Car> treeset = new TreeSet<>(); 
  
 treeset.add(new Car("Benz", 600000, 1998, "Mercedes")); 
 treeset.add(new Car("Figo", 300000, 1990, "Fords")); 
 treeset.add(new Car("Suzuki", 200000, 1890, "Maruti")); 
  
  
 treeset.stream().forEach((name) -> System.out.println(name)); 
  
 } 
  
  
 } 
