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
public class SocketClassAdapter extends Socket implements SocketAdapter{

    @Override
    public Volt get240Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = getVolt();
        return convertVolt(v,20);
    }

    @Override
    public Volt get3Volt() {
        Volt v = getVolt();
        return convertVolt(v,80);
    }
    
    public Volt convertVolt(Volt v, int i){
        return new Volt(v.getVolts()/i);
        
    }
    
}
