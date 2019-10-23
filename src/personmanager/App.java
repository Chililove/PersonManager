/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personmanager;

import java.util.ArrayList;

/**
 *
 * @author mega_
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        Person person = new Person("Jeppe");
        System.out.println(person.getName());
        Person person1 = new Person("Peter");
        System.out.println(person1.getName());
        Person person2 = new Person("Tobias");
        System.out.println(person2.getName());
        ArrayList<String> personer;
        personer = new ArrayList<String>();
        personer.add(person.getName());
        personer.add(person1.getName());
        personer.add(person2.getName());
        System.out.println (personer.toString());
        
    }
    public static void Person(String[] args) {
        
    }
}
