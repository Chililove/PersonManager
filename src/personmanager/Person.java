/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personmanager;

/**
 *
 * @author mega_
 */
public class Person {
 protected String name;
 
 public Person(String n)
 {
     name=n;
     
 }
    public String getName(){
        return name;
    }
}
