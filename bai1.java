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
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Họ tên sinh viên:");
        String hoTen = scanner.nextLine();
        System.out.print("Điểm TB:");
        double diemTB = scanner.nextDouble();
        System.out.printf("%s %f điểm",hoTen,diemTB);
    }
}
