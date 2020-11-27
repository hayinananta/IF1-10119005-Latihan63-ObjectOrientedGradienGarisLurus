/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan63.objectorientedgradiengarislurus;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program ini menampilkan garis yang memiliki gradien
 *                     dengan berbasis objek
 */
public class Koordinat implements GarisLurus{
    private int x1,y1,x2,y2;
    
    public Koordinat(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public int getX1() {
        return this.x1;
    }
    
    public int getY1() {
        return this.y1;
    }
    
    public int getX2() {
        return this.x2;
    }
    
    public int getY2() {
        return this.y2;
    }
    
    public int hitungGradien() {
        return (y2-y1)/(x2-x1);
    }
}