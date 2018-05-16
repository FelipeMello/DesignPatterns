/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototypeCCT;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felip
 */
public class Names implements Cloneable{
    private List<String> listOfNames; //using generic ListType
    
    public Names(){
        listOfNames = new ArrayList<>();
    }
    
    public Names(List<String> list){
        this.listOfNames = list;
    }
    
    public void loadData(){
        //simulated - read all data from storage and put into data structure
        listOfNames.add("Felipe");
        listOfNames.add("Git");
        listOfNames.add("Hub");
        listOfNames.add("Push");
        listOfNames.add("Master");
    }
    public List<String> getListOfNames(){
        return listOfNames;
    }
    
    //default clone method from Object class - shallow copy
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
    @Override
    public String toString(){
        return "Names {"+ "nameList = "+getListOfNames()+ '}';
 
    }
    
}
