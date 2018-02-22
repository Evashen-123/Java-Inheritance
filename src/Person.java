import javax.swing.*;

public class Person
{
  private String name;
  private int id;
    
  //default
  public Person()
  {
    id = 0;
    name = "";
  }	

  public Person (String name, int id)
   {
   	this.id = id;
   	this.name = name;
   }
  
  public void set(String name)
   {
   	this.name = name;
   }

  public String getname()
  {
   	return name;
  }
  
  public void set(int id)
   {
   	this.id = id;
   }

  public int getid()
  {
   	return id;
  }

  //Original method to store name & id into a string
  public String toString()
  {
    String s = "Name: " + name + "\nID: "+id + "\n";
    return s;
     
  }
  
}
