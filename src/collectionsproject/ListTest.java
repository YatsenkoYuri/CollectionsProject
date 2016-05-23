/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListTest {
    public void printList(){
        List list = new ArrayList();
        list.add(5);
        list.add(88);
        list.add(3);
        list.add(8);
        list.add(5);
        list.add(1);
        list.add(74);
        list.add(41);
        list.add(25);
        list.add(548);
        
        Integer index = (Integer) list.get(8);
        System.out.println(index);
        
        System.out.println("printList "+list.toString());
        
         Collections.sort(list);
        System.out.println("sort List"+ list.toString());
        
        Collections.reverse(list);
        System.out.println("reverse " + list.toString());
    }
//    String sql = "select fio, age from students s inner join marks m on s.id = m.id";
    
//    String sql2 = "select * from students where age > 20 order by desc age";
     public void printEmployeeList(){
        List<String> list = new ArrayList<>();
        list.add("Aaa");
        list.add("Bbb");
        list.add("Ddd");
        list.add("Ccc");
        list.add("Aaa");
        System.out.println(list.toString());
        
        String index =  list.get(2);
        System.out.println(index);
        
        
    }
    
}