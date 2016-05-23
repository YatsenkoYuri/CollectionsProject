
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsproject;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ListTest listTest = new ListTest();
           listTest.printList();
           
           listTest.printEmployeeList();
       
    SetTest setTest = new SetTest();
    setTest.printSet();
    
    setTest.printLinkedHashSet();
    
    setTest.printEmployeeList();
    
    People people = new People();
    people.printAddress();
    
    
        System.out.println("Ivanov".equalsIgnoreCase("ivaNov"));
    }
    
}
