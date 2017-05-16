/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppConPat;

import java.util.Scanner;

/**
 *
 * @author Matthew
 */
public class Demo {
    public static void main (String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose BigBang or Brooklyn99 or ModernFamily to get the Synopsis.");
        AppCon app = new AppCon();
        app.dispatchReq(input.next());
        
    }
}
