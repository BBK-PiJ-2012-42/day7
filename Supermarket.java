/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;

/**
 *
 * @author tnealo01
 */
public class Supermarket {
    private Person front = null;
    private Person back = null;
    private int count = 0; 
    
    public void addPerson(Person person) {
        this.insert(person);
        count++;
    }
    
    public Person servePerson() {
        count--;
        return this.retrieve();
    }
    
    public void insert(Person person) {
        if(back!=null) {
            back.nextPerson = person;
            back = person;
        } else {
            back = person;
            front = person;
            back.nextPerson = back;
        }
    }
    
    public Person retrieve() {
        Person returnPerson = front;
        front = front.nextPerson;
        return returnPerson;
    }
    
    public void launch() {
        this.addPerson(new Person("Adam"));
        this.addPerson(new Person("Bill"));
        this.addPerson(new Person("Charlie"));
        
        //this.front.forwardPrint();
        
        this.servePerson().printPerson();
        this.servePerson().printPerson();
        
        this.addPerson(new Person("Franz"));
        this.servePerson().printPerson();
        this.servePerson().printPerson();
    }
    
    public static void main(String[] args) {
        new Supermarket().launch();
    }
}
