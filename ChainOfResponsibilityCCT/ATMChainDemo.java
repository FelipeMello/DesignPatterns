/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibilityCCT;

import java.util.Scanner;

/**
 *
 * @author Felipe Mello <https://github.com/FelipeMello>
 */
public class ATMChainDemo 
{

    private final DispenseChain hundred;

    public ATMChainDemo() 
    {
        // Setting the notes that the atm will dispense.
        hundred = new CashDispenser(100); 
        DispenseChain fifith = new CashDispenser(50);
        DispenseChain twenty = new CashDispenser(20);
        DispenseChain teen = new CashDispenser(10);
        DispenseChain five = new CashDispenser(5);

        // set the order of the chain of responsibility
        hundred.setNextChain(fifith);
        fifith.setNextChain(twenty);
        twenty.setNextChain(teen);
        teen.setNextChain(five);
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
            atmDispenser.hundred.dispense(new Currency(amount));
        }
	}
}
