/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author Felipe Mello           <https://github.com/FelipeMello>
 */
public class AdapterDemo {
    public static void main(String[]args){
        testClassAdapter();
        testObjectAdapter();
    }
    public static void testObjectAdapter(){
        SocketAdapter sockAdapter = new SocketObjectAdapter();
        Volt v3 = getVolt(sockAdapter,3);
        Volt v12 = getVolt(sockAdapter,12);
        Volt v240 = getVolt(sockAdapter, 240);
        System.out.println("v3 volts using Object Adapter = "+v3.getVolts());
        System.out.println("v12 volts using Object Adapter = "+v12.getVolts());
        System.out.println("v240 volts using Object Adapter = "+v240.getVolts());
    }
    public static void testClassAdapter(){}
    
    public static Volt getVolt(SocketAdapter sockAdapter, int i){
        switch(i){
            case 3: return sockAdapter.get3Volt();
            case 12 : return sockAdapter.get12Volt();
            case 240 : return sockAdapter.get240Volt();
            default : return sockAdapter.get240Volt();
        }
    }
}
