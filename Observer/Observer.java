/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author Felipe Mello           <https://github.com/FelipeMello>
 * @ref <https://www.tutorialspoint.com/design_pattern/observer_pattern.htm>
 */
public abstract class Observer {
    protected Subject suject;
    public abstract void update();
    
}
