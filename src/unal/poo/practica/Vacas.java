/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;
import java.util.*;


import becker.robots.*;
import java.awt.Color;
/**
 *
 * @author pc 1
 */

public class Vacas {
    public Robot vaca;

    private Lote lote;
    private double ritmo;
    private double temperatura;
    private double pulso;
    private Color color;
    private boolean Embarazo;
    private int id;
    private String estadoGestacion;

    public void setEstadoGestacion(String estadoGestacion) {
        this.estadoGestacion = estadoGestacion;
    }

    public String getEstadoGestacion() {
        return estadoGestacion;
    }
    private Granjero granjero;
    public Vacas(City city,int i, int j, Direction direction, double ritmo, double temperatura, double pulso, Lote lote){
        this.vaca=new Robot(city,i,j,direction);
        this.lote=lote;
        this.pulso=pulso;
        this.ritmo=ritmo;
        this.temperatura=temperatura;

    }
    
    public void setEmbarazo(boolean Embarazo) {
        this.Embarazo = Embarazo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEmbarazo() {
        return Embarazo;
    }

    public int getId() {
        return id;
    }

    public Robot getVaca() {
        return vaca;
    }

    public Lote getLote() {
        return lote;
    }

    public double getRitmo() {
        return ritmo;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getPulso() {
        return pulso;
    }

    public Color getColor() {
        return color;
    }

    public void setVaca(Robot vaca) {
        this.vaca = vaca;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public void setRitmo(double ritmo) {
        this.ritmo = ritmo;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void setPulso(double pulso) {
        this.pulso = pulso;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Granjero getGranjero() {
        return granjero;
    }

    public void setGranjero(Granjero granjero) {
        this.granjero = granjero;
    }
    
    void color(double ritmo,double temperatura, double pulso, boolean Embarazo){
        this.ritmo=ritmo;
        this.temperatura=temperatura;
        this.pulso=pulso;
        this.Embarazo=Embarazo;
        if (Embarazo){
            this.color=Color.BLUE;
        }else if(ritmo>160||temperatura>50||pulso>80){
            this.color=Color.RED;
        }else{
            this.color=Color.BLACK;
        }
        this.vaca.setColor(color);
        
    }
    public void move(){
        Random ran=new Random();
        if(this.color==Color.RED){
            this.granjero.gran_move(this.lote.getEntrada()[0], this.lote.getEntrada()[1]);
            this.granjero.gran_move(vaca.getAvenue(), vaca.getStreet());
            this.color=Color.BLACK;
            this.granjero.gran_move(vaca.getAvenue(), this.lote.getEntrada()[1]);
            this.granjero.gran_move(granjero.getLote().getEntrada()[0], granjero.getLote().getEntrada()[1]);
            this.granjero.gran_move(6, 10);
        }else{
            if(vaca.getStreet()==this.lote.getEntrada()[1]&&vaca.getAvenue()==this.lote.getEntrada()[0]&&vaca.getDirection()==Direction.EAST){
                vaca.turnLeft();
                vaca.move();
            }else{
                if(vaca.frontIsClear()==true){
                    if(ran.nextInt()%2==1){
                        vaca.turnLeft();
                    }else{
                        vaca.move();
                    }
                }else{
                    vaca.turnLeft();
                }
            }
        }
        
    }
}
