//Creating a class collection for creating list and adding objects in it
package implementation.collection; 
  
 import java.util.LinkedList; 
 import java.util.List; 
  
 import implementation.collection.Car.Car; 
 import implementation.collection.CellPhone.CellPhone; 
 import implementation.collection.Laptop.Laptop; 
 import implementation.collection.School.School; 
 import implementation.collection.Television.Television; 
  
 public class Collection { 
 public static void main(String args[]) 
 { 
	 //Creating the linked list
 List<Object> list = new LinkedList<>(); 
 list.add(new Car("Ford Mustang", 300000, 1990, "Ford")); 
 list.add(new Car("Baleno", 200000, 1890, "Maruti Suzuki")); 
 list.add(new Car("Mercedes S-class", 600000, 1998, "Mercedes Benz")); 
  
 list.add(new CellPhone("OnePlus", "OnePlus6", "Improved Features", "Android", 500000)); 
 list.add(new CellPhone("Samsumg", "J7", "Improved features", "Android", 8000000)); 
 list.add(new CellPhone("Apple", "IPhone6", "Improved features", "ios", 3000000)); 
  
 list.add(new Laptop("Dell", "Dell", "Windows", "i5")); 
 list.add(new Laptop("lenovo", "lenovo", "Windows", "i3")); 
 list.add(new Laptop("Vision", "Vision", "Linux", "i3")); 
  
  
 list.add(new School("St. Anne's", "Mumbai", "Mumbai", "First")); 
 list.add(new School("Mary Mculet", "Mumbai", "Mumbai", "Second")); 
 list.add(new School("St. Francis", "Mumbai", "Mumbai", "third")); 
  
 list.add(new Television("Sony Bravia", "LED", true, 500000)); 
 list.add(new Television("Videocon", "LCD", false, 100000)); 
 list.add(new Television("LG", "Plasma", true, 300000)); 
  
  //Printing the list
 list.stream().forEach((list1) -> System.out.println(list1)); 
 }  
 } 
