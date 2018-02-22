import javax.swing.*;

public class Test
{
  public static void main(String[] args)
    {
   	 Person p = new Person("Jack", 5678);
   	 Student s = new Student(p.getname(),p.getid(), 1234);
     
     //From Person
     JOptionPane.showMessageDialog(null, p.toString());
      
     //From Student
     JOptionPane.showMessageDialog(null, s.toString());
     
    }	
 
  
}