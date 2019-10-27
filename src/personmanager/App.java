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
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // List<person> persons = new Arraylist<>();
        
        System.out.println("Hello World");
        Person person = new Person("Jeppe");
        
        System.out.println(person.getName());
        Person person1 = new Person("Peter");
        System.out.println(person1.getName());
        Person person2 = new Person("Tobias");
        System.out.println(person2.getName());
     
       /* Record record1 =new Record();
       record1.setId(2);
       record1.setEmail("");
       
       Record record2 = new Record();
       record2.setName("Jeeppe");
       record2.setId(3);
       record2.setEmail("LarsHold");
       
        
        
        
        
        
        ArrayList<String> personer;
        personer = new ArrayList<String>();
        personer.add(person.getName());
        personer.add(person1.getName());
        personer.add(person2.getName());
        
        
        System.out.println (personer.toString()); */
        
        Student s = new Student("Martin");
        System.out.println("Name of student is " + s.getName());
        
    }
    public static void Person(String[] args) {
        
    }
}
