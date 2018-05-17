/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibilityCCT;

/**
 * This class will store the amount to dispense 
 * @author Felipe Mello
 */
public class Currency 
{
	private int amount;
	
	public Currency(int amt)
        {
            this.amount=amt;
	}
	
	public int getAmount()
        {
            return this.amount;
	}
}

