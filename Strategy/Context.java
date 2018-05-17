/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author Felipe Mello           <https://github.com/FelipeMello>
 */
public class Context {
    private Strategy strategy;
    
    public Context(Strategy startegy){
        this.strategy = startegy;
    }
    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
