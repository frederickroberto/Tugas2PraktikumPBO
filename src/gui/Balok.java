/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author ASUS
 */
public class Balok extends PersegiPanjang implements HitungRuang {
    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public Balok(double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    double tinggi;
    @Override
    public double volume() {
    return this.luas() * this.tinggi; 
    }

    @Override
    public double luaspermukaan() {
    return 2 * (this.luas() + this.lebar * this.tinggi + this.panjang * this.tinggi);
    }
    
}
