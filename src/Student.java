import javax.swing.*;

public class Student extends Person
{
  private int stuno;
    
  public Student()
  {
   super();
   stuno =0;
  }	

  public Student(String aname, int id, int stuno)
   {
   	 super(aname, id);
   	 this.stuno = stuno;
   }
  
  public void set(int stuno)
   {
   	this.stuno = stuno;
   }

  public int getstuno()
  {
   	return stuno;
  }


 //Overridden method to store name,id & stuno in string
  public String toString()
  {
    String s = super.toString() + "Student No: " + stuno;
    
    //Alternate way of creating the string:
    //String s = "Name: " + getname() + "\nID: "+getid() + "\n" + "Student No: " + stuno;
    
    return s;
  }
  
}
