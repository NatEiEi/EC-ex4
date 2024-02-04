/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statelesssessionclient;

import java.util.Scanner;
import javax.ejb.EJB;
import mybeans.SessionBeanRemote;


public class Main {

    @EJB
    private static SessionBeanRemote sessionBean;

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter degree in Fahrenheit: ");
        int input = in.nextInt();
        System.out.print(input + " Fahrenheit = " + sessionBean.fToC(input) +" Celsius");
        
    }
}
