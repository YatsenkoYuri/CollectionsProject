 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsproject;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {
    public void printSet(){
        Set set = new HashSet();
        set.add(5);
        set.add(5);
        set.add(3);
        set.add(8);
        set.add(5);
        set.add(1);
        set.add(74);
        set.add(41);
        set.add(25);
        set.add(548);
        System.out.println("PrintSet "+set.toString());
    }
    public void printLinkedHashSet(){
        Set set = new LinkedHashSet();
        set.add(5);
        set.add(5);
        set.add(3);
        set.add(8);
        set.add(5);
        set.add(1);
        set.add(74);
        set.add(41);
        set.add(25);
        set.add(548);
        System.out.println(set.toString());
        
    }
    public void printEmployeeList(){
        Set<String> set = new LinkedHashSet<>();
        set.add("Aaa");
        set.add("Bbb");
        set.add("Ddd");
        set.add("Ccc");
        set.add("Aaa");
        System.out.println(set.toString());
}
}
