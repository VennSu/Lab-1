/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class bai4 {
    public static void main(String[] args) {
        int a,b,c;
        int delta,x;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập x:");
        a = scanner.nextInt();
        System.out.print("nhập y:");
        b = scanner.nextInt();
        System.out.print("nhập c:");
        c = scanner.nextInt();
        delta = (int) (Math.pow(b,2)-4*a*c);
         x= (int) Math.sqrt(delta);
        System.out.println("Căn Delta:"+x);      
    }
}
