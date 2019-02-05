/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentlist;

/**
 *
 * @author GURMAN
 */
public class Student {
 private String name;
    private int ID;
    
 private int maxHours;
 private int Marks;
 
    public Student()
    {
        name = "Name Not Set";
        ID = 0;
    }
    //defalut constructor for student class
    public Student(String givenName, int givenID)
    {
          this.name = givenName;
          this.ID = givenID;
    }
    public void setName(String givenName)
    {
       this.name = givenName;
    }
    
    public String getName()
    {
           return name;
    }
    
    public void setID (int givenID)
    {
        this.ID = givenID;
    }
    
    public int getID ()
    {   
        return ID;
    }
  //this is a to string method
    public String toString()
    {
       return "Student";
    }
}
