/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsproject;

import java.util.HashMap;
import java.util.Map;


public class People {
   public void printAddress(){
        Map<String, String> people = new HashMap<>();
        people.put("Ivanov", "Moscow");
        people.put("Petrov", "Odessa");
        people.put("Sidorov", "Kiev");
        
//        System.out.println(put.toString());
        
        String address = people.get("Petrov");
        System.out.println(address);
   }  
}
