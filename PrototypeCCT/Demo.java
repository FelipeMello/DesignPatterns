/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototypeCCT;

import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author felip
 */
public class Demo {

    /**
     *
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main (String []args) throws CloneNotSupportedException{
        Names dudes = new Names();
        dudes.loadData();// get the data
        
        Names newDudes = (Names) dudes.clone(); //cast to Names type
        Names reallyNewDudes = (Names) dudes.clone();
        List<String> list = newDudes.getListOfNames(); //generic type List
        list.add("Mr Fox");
        List<String> list1 = reallyNewDudes.getListOfNames();
        list1.remove("Felipe");
        
        System.out.println("dudes List : "+dudes.getListOfNames()+"\n"
                            + "newDudes List: "+list+"\n"
                            + "reallyNewDudes List : "+ list1);
        
    }
}
