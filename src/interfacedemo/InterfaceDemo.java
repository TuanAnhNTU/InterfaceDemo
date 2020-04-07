/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacedemo;

import calculates.CasioCalculate;
import interfaces.ICalculate;



/**
 *
 * @author asus
 */
public class InterfaceDemo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        System.out.println("Hello Interface Demo");
        ICalculate calculator = new CasioCalculate();
        System.out.println("4 + 5 = " + calculator.cong(4, 5));
    }
    
}
