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
public class bai3 {
    public static void main(String[] args) {
        int canh,thetich;
       Scanner scanner = new Scanner(System.in);
       System.out.print("Cạnh khối lập phương:");
       canh = scanner.nextInt();
       thetich = canh*canh*canh;
       System.out.print("Thể tích của khối chữ nhật:"+thetich);
    }
}
