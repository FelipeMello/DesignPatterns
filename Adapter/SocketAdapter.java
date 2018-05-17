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
public interface SocketAdapter {
    public Volt get240Volt();
    public Volt get12Volt();
    public Volt get3Volt();
}
