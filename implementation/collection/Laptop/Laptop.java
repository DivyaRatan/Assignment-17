package implementation.collection.Laptop; 
  
 public class Laptop { 
  
 private String company; 
 private String model; 
 private String operatingSystem; 
 private String processor; 
  
  
 public Laptop(String company, String model, String operatingSystem, String processor) { 
 this.company=company; 
 this.model=model; 
 this.operatingSystem=operatingSystem; 
 this.processor=processor; 
 } 
  
  
 @Override 
 public int hashCode() { 
 final int prime = 31; 
 int result = 1; 
 result = prime * result + ((company == null) ? 0 : company.hashCode()); 
 result = prime * result + ((model == null) ? 0 : model.hashCode()); 
 return result; 
 } 
  
  
 @Override 
 public boolean equals(Object obj) { 
 if (this == obj) 
 return true; 
 if (obj == null) 
 return false; 
 if (getClass() != obj.getClass()) 
 return false; 
 Laptop other = (Laptop) obj; 
 if (company == null) { 
 if (other.company != null) 
 return false; 
 } else if (!company.equals(other.company)) 
 return false; 
 if (model == null) { 
 if (other.model != null) 
 return false; 
 } else if (!model.equals(other.model)) 
 return false; 
 return true; 
 } 
  
  
 public String getCompany() { 
 return company; 
 } 
 public void setCompany(String company) { 
 this.company = company; 
 } 
  
  
 public String getModel() { 
 return model; 
 } 
 public void setModel(String model) { 
 this.model = model; 
 } 
  
  
 public String getOperatingSystem() { 
 return operatingSystem; 
 } 
 public void setOperatingSystem(String operatingSystem) { 
 this.operatingSystem = operatingSystem; 
 } 
  
  
 public String getProcessor() { 
 return processor; 
 } 
 public void setProcessor(String processor) { 
 this.processor = processor; 
 } 
  
 @Override 
 public String toString()  
 { 
 return "Laptop [company= "+getCompany()+", model= "+getModel()+", Operating System= "+getOperatingSystem()+", processor= "+getProcessor()+"]"; 
 } 
  
  
 } 
