/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;

/**
 *
 * @author tnealo01
 */
public class Supermarket implements PersonQueue {
    
    public void addPerson(Person person) {
        this.insert(person);
    }
    
    public Person servePerson() {
        return this.retrieve();
    }
    
    public void insert(Person person) {
        
    }
    
    public Person retrieve() {
        return new Person("Jim", 800);
    }
}
