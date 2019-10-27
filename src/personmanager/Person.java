/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personmanager;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mega_
 */
public class Person {
 protected String name;
 private int id;
 private String email;
 
 public int getId(){
     return id;
 }
 public void setId(int id){
     
 }
 public String getEmail(){
     return email;
 }
 public void setEmail(String email){
     this.email = email;
 }
 /*Record person = new Record();
 person.setId(25);*/
 
 
 
 public static void main(String[] args){
     List<Person> list = new ArrayList<Person>();
     
     list.add(new Person(0, "Peter", "35", "Peter@hotmail.com"));
     list.add(person1(1, "Jeppe", "25", "Jeppe@hotmail.com"));
     list.add(Person2(2, "Tobias", "15", "Tobias@hotmail.com"));
 
 }
 public Person(String n)
 {
     name=n;
     
 }
    public String getName(){
        return name;
    }
}
