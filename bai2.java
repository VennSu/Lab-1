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
public class bai2 {
    public static void main(String[] args) {
        int chieuDai,chieuRong;
        int chuVi,dienTich;
        int canhnhonhat;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chiều dài:");
        chieuDai = scanner.nextInt();
        System.out.print("Chiều rộng:");
        chieuRong = scanner.nextInt();
        chuVi = (chieuDai + chieuRong)*2;
        dienTich = (chieuDai * chieuRong);
        System.out.println("Chu vi:"+chuVi);
        System.out.println("Diện tích:" +dienTich);
        canhnhonhat = Math.min(chieuDai,chieuRong);
        System.out.print("Cạnh nhỏ nhất:"+ canhnhonhat);
    }
 
}
