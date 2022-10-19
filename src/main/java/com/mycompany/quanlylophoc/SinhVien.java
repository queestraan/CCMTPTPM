/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlylophoc;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class SinhVien {
    String mssv, name;
    float diemToan, diemVan; 

    public SinhVien() {
        this.mssv = "0000";
        this.name = "";
        this.diemToan = 0;
        this.diemVan = 0;
    }

    public SinhVien(String mssv, String name, float diemToan, float diemVan) {
        this.mssv = mssv;
        this.name = name;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
    }
    
    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(float diemVan) {
        this.diemVan = diemVan;
    }
//nhập học sinh
    public void nhapSV(){
        Scanner input = new Scanner(System.in);
        System.out.print("ID: ");
        this.mssv=input.nextLine();
        System.out.print("Name: ");
        this.name = input.nextLine();
        System.out.print("Math: ");
        this.diemToan = input.nextFloat();
        System.out.print("Literature: ");
        this.diemVan=input.nextFloat();
    }
//xuất sinh viên
    public void xuatSV(){
        System.out.println(" ID: " + this.mssv);
        System.out.println(" Name: " + this.name);
        System.out.println(" Math: " +this.diemToan);
        System.out.println(" Literature: " + this.diemVan);        
    }
//tính điểm trung bình 1 sinh viên
    public float diemTB(){
        return (this.diemToan+this.diemVan)/2;
    }
//xếp loại 1 sinh viên
    public void rank(){
        float diem = diemTB();
        if(diem<=3.5)
            System.out.println("Yeu");
        if(diem>3.5 && diem<5)
            System.out.println("Trung Binh");
        if(diem >=5 && diem<8)
            System.out.println("Kha");
        if(diem>=8)
            System.out.println("Gioi");
    }
            
}
