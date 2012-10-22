package day7;

public class Person {
    
    // The controlling manager.
    //private HospitalManager PersonManager;
            
    private String name;
    private int age;
    //private String illness;
    private Person prevPerson;
    private Person nextPerson;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        //this.illness = illness;
        this.prevPerson = null;
        this.nextPerson = null;
        // Link to HospitalMnager Object.
        //this.PersonManager = manager;
    }
    
    // Method to allow setting of prevPerson
    public void setPrevious(Person oldPerson) {
        prevPerson = oldPerson;
    }
    
    
    public void addPerson(Person newPerson) {
        if (this.nextPerson == null) {
                // At the end of the list set previousPerson to the Person at
                // the end of the list.
                newPerson.setPrevious(this);
                // Then add the new Person to the end.
                this.nextPerson = newPerson;
                // Finally set end of the list to the new Person.
                //PersonManager.PersonListEnd = newPerson;
                System.out.println(newPerson.name+" has been added.");
            } else {
                this.nextPerson.addPerson(newPerson);
                
            }
    }
    

//    public void deletePerson() {
//        // Check to see if Person is at the end or start of the list.
//        // Could have checked if next or previous was void but used reference
//        // to manager instead.
//        if (this.equals(PersonManager.PersonListStart)) {
//            PersonManager.PersonListStart = this.nextPerson;
//            this.nextPerson.prevPerson = this.prevPerson;
//        } else if (this.equals(PersonManager.PersonListEnd)) {
//            PersonManager.PersonListEnd = this.prevPerson;
//            this.prevPerson.nextPerson = this.nextPerson;
//        } else {
//            // Removes self from the list by connecting the previous and
//            // next Persons to each other.
//            this.nextPerson.prevPerson = this.prevPerson;
//            this.prevPerson.nextPerson = this.nextPerson;
//        }
//        System.out.println(this.name+" has been removed.");
//    }
    
    public void printPerson() {
        System.out.println(name+"\t"+age);
    }
    
    public void forwardPrint() {
        // Prints Person details and then goes forward in the list
        // printing the next Person details recursively.
        this.printPerson();
        if (this.nextPerson == null) {    
            System.out.println("End of Person list.");            
        } else {
            this.nextPerson.forwardPrint();
        }
    }
    
    
    public void backPrint() {
        // Prints Person details and then goes backward in the list
        // printing the previous Person details recursively.
        this.printPerson();
        if (this.prevPerson == null) {    
            System.out.println("Start of Person list.");            
        } else {
            this.prevPerson.backPrint();
        }
    }
    
    
}
