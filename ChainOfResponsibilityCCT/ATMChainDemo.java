/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibilityCCT;

import java.util.Scanner;

/**
 *
 * @author felipe mello
 */
public class ATMChainDemo 
{

    private DispenseChain c0;

    public ATMChainDemo() 
    {
        // Setting the notes that the atm will dispense.
        c0 = new CashDispenser(100); 
        DispenseChain c1 = new CashDispenser(50);
        DispenseChain c2 = new CashDispenser(20);
        DispenseChain c3 = new CashDispenser(10);
        DispenseChain c4 = new CashDispenser(5);

        // set the chain of responsibility
        c0.setNextChain(c1);
        c1.setNextChain(c2);
        c2.setNextChain(c3);
        c3.setNextChain(c4);
    }

    public static void main(String[] args) 
    {
      ATMChainDemo atmDispenser = new ATMChainDemo();
      while (true) 
      {
        int amount = 0;
        System.out.println("Enter amount to dispense");
        Scanner input = new Scanner(System.in);
        amount = input.nextInt();
            
            if (amount % 5 != 0)
            {
                System.out.println("Amount should be in multiple of 5s.");
                return;
            }
            // process the request
            atmDispenser.c0.dispense(new Currency(amount));
        }
	}
}
