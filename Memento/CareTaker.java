/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

/**
 *
 * @author felip
 * Notice that caretaker object contains the saved state in the form of Object,
 * so it can't alter its data and also it has no knowledge of its structure
 */
public class CareTaker {
    private Object obj;
    public void save(Originator orig){
        this.obj = orig.saveIt();
    }
    public void undo(Originator orig){
        orig.undoToLastSave(obj);
    }
}
