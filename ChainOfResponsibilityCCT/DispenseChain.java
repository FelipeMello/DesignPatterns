/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibilityCCT;

/**
 * @author felipe
 */
public interface DispenseChain 
{

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}
