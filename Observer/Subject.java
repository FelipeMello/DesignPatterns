/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Felipe Mello           <https://github.com/FelipeMello>
 */
public class Subject {
    private final List<Observer> observers = new ArrayList<>();
    private int state;

    /**
     * @return the state
     */
    public int getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
    public void notifyAllObservers(){
        observers.forEach((observer) -> {
            observer.update();
        });
    }
    public void attach(Observer observer){
        observers.add(observer);
    }
    
    
}
