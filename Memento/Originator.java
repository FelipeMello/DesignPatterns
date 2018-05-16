/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

/**
 *
 * @author felip
 */
public class Originator {
    private String nuclearCodes;
    private StringBuilder content;
    
    public Originator(String codes){
        this.nuclearCodes = codes;
        this.content = new StringBuilder();
        
    }
    
    @Override
    public String toString(){
        return this.content.toString();
    }
    
    public void write(String str){
        content.append(str);
    }
    public Memento saveIt(){
        return new Memento(this.nuclearCodes, this.content);
    }
    public void undoToLastSave(Object obj){
        Memento memento = (Memento) obj;
        this.content = memento.content;
    }
    
    private class Memento{
        private String nuclearCodes;
        private StringBuilder content;
        
        public Memento(String codes, StringBuilder content){
            //deep copy so that Memento and Orginator
            this.nuclearCodes = codes;
            
            //content variables don't refer to same object
            this.content = new StringBuilder(content);
        }
    }
}
