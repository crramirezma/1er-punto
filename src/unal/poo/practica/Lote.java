/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

/**
 *
 * @author pc 1
 */
public class Lote {
    private int[] entrada;
    private int[] limites;
    private Vacas[] vacas;
    private int identificador;
    public void setLimites(int[] limites) {
        this.limites = limites;
    }

    public int[] getLimites() {
        return limites;
    }
    public Lote(){
        entrada=new int [2];
        limites=new int [8];
        vacas=new Vacas[10];
    }
    public void asignar_en(int x, int y){
        this.entrada[0]=x;
        this.entrada[1]=y;
    }
    public void asignar_li(int x1,int x2,int x3, int x4,int y1,int y2,int y3, int y4){
        this.limites[0]=x1;
        this.limites[1]=y1;
        this.limites[2]=x2;
        this.limites[3]=y2;
        this.limites[4]=x3;
        this.limites[5]=y3;
        this.limites[6]=x3;
        this.limites[7]=y3;
    };
    public int[] getEntrada() {
        return entrada;
    }

    public void setEntrada(int[] entrada) {
        this.entrada = entrada;
    } 
}
