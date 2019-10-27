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
     this.id = id;
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
     ArrayList<String> liste;
     liste = new ArrayList<String>();
     List<Person> list = new ArrayList<Person>();
    /* 
     liste.add(person(0, "Peter", "35", "Peter@hotmail.com"));
     liste.add(person1(1, "Jeppe", "25", "Jeppe@hotmail.com"));
     liste.add(Person2(2, "Tobias", "15", "Tobias@hotmail.com"));
     liste.add(Person3(3, "Gabi", "10", "Gabi@hotmail.com"));*/
     
 }
 /*public Person(String n){
 
 
     name=n;*/
 public Person (int id , String name , String age, String email){

this.name =name;
}
     
 }
    public String getName(){
        return name;

}
