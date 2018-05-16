/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibilityCCT;

/**
 *
 * @author felipe mello
 */
public class CashDispenser implements DispenseChain {

    private int value;

    public CashDispenser(int value) {
        this.value = value;
    }

    ;
    
    public int getValue() {
        return value;
    }

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= getValue()) {
            int num = cur.getAmount() / getValue();
            int remainder = cur.getAmount() % getValue();
            System.out.println("Dispensing " + num + " €" + getValue() + " note");
            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(cur);
        }
    }

}
