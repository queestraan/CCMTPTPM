/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.quanlylophoc;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Quanlylophoc {

    public static void main(String[] args) {
        Lop cl=new Lop();
        cl.nhapLop();
        cl.xuatLop();
        cl.tinhDTBlop();        
        System.out.println("--> diem trung binh cao nhat lop: " + cl.maxAvg());
        //cl.maxAvgStu();
        Scanner input = new Scanner(System.in);
        System.out.println("nhap ma sinh vien can tim: ");
        String ma=input.nextLine();
        cl.find(ma);
    }
}
