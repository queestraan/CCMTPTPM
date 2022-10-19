/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlylophoc;
import java.util.Scanner;
import java.util.LinkedList;
/**
 *
 * @author HP
 */
public class Lop {
    private String classID, className;
    private int iSiSo;
    private LinkedList<SinhVien> listStudent;

    public Lop() {
        this.classID = "";
        this.className = "";
        this.iSiSo = 0;
        this.listStudent = new LinkedList<SinhVien>();
    }

    public Lop(String classID, String className, int iSiSo, LinkedList<SinhVien> listStudent) {
        this.classID = classID;
        this.className = className;
        this.iSiSo = iSiSo;
        this.listStudent = listStudent;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getiSiSo() {
        return iSiSo;
    }

    public void setiSiSo(int iSiSo) {
        this.iSiSo = iSiSo;
    }

    public LinkedList<SinhVien> getListStudent() {
        return listStudent;
    }

    public void setListStudent(LinkedList<SinhVien> listStudent) {
        this.listStudent = listStudent;
    }
//nhập danh sách sinh viên   
    public void nhapDSSV(){
        for(int i=0; i<this.iSiSo  ;i++){
            System.out.println("sinh vien " + (i+1));
            SinhVien sv=new SinhVien();
            sv.nhapSV();
            this.listStudent.add(sv);
        }        
    }
//nhập thông tin lớp học   
    public void nhapLop(){
        Scanner input = new Scanner(System.in);
        System.out.println("nhap thong tin lop hoc: ");
        System.out.print("Ma lop: ");
        this.classID=input.nextLine();
        System.out.print("Ten lop: ");
        this.className=input.nextLine();
        System.out.print("Si so: ");
        this.iSiSo=input.nextInt();
        System.out.println("nhap danh sach sinh vien: ");
        this.nhapDSSV();
    }
//xuất danh sách sinh viên
    public void xuatDSSV(){
        for(SinhVien sv: this.listStudent){
            System.out.println("--sinh vien");
            sv.xuatSV();
        }
    }
//xuất thông tin lớp
    public void xuatLop(){
        System.out.println("-----Thong tin lop hoc-----");
        System.out.println("Ma lop: "+ this.classID);
        System.out.println("Ten lop: "+ this.className);
        System.out.println("Si so: " + this.iSiSo);
        System.out.println("Danh sach sinh vien:");
        this.xuatDSSV();
    }
//tính điểm trung bình chung cho lớp học
    public void tinhDTBlop(){
        float diem=0;
        for(SinhVien sv: this.listStudent)
            diem+=sv.diemTB();
        if(diem >0)
            System.out.println("--> diem trung binh chung: " + diem/(float)this.iSiSo);
    }
//tìm điểm trung bình cao nhất lớp
    public float maxAvg(){
        float diemmax=0;
        for(SinhVien sv: this.listStudent){            
            if(diemmax < sv.diemTB())
               diemmax=sv.diemTB();
        }
        return diemmax;
    }
//tìm Sinh Viên có điểm trung bình cao nhất lớp
    /*public void maxAvgStu(){
        float diem=maxAvg();
        for(SinhVien sv: this.listStudent){            
            if(diem == sv.diemTB())
               this.listStudent.add(sv);            
        }
        System.out.println("Sinh vien co DTB cao nhat lop: ");
        this.xuatDSSV();
    }*/
//tìm học sinh thoe mã
    public void find(String x){
        int count =0;
        for(SinhVien sv: this.listStudent){   
            if(sv.mssv == x)
            {
                sv.xuatSV();
                count++;
            }
        }
        if(count == 0 )
            System.out.println("NOT FOUND!");
    }
//tìm học sinh theo tên
//sắp xếp DSSV tăng dần theo điểm trung bình
    
}
