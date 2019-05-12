/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import java.util.*;


import becker.robots.*;
import java.awt.Color;
import static unal.poo.practica.RobotBase.Granjero;
/**
 *
 * @author pc 1
 */
public class Granjero {
    private Robot granjero;
    private int edad;
    private Lote lote;
    TreeMap<Integer,Robot>vacas;
    public Granjero(City city, int i, int j,Direction direction,int edad, Lote lote){
        this.granjero=new Robot(city,i,j,direction);
        this.lote=lote;
        this.edad=edad;
        this.vacas=new TreeMap<>();
    }
    public Granjero(){
        this.vacas=new TreeMap<>();
    }
    public void setGranjero(Robot granjero) {
        this.granjero = granjero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public void setVacas(TreeMap<Integer, Robot> vacas) {
        this.vacas = vacas;
    }

    public Robot getGranjero() {
        return granjero;
    }

    public int getEdad() {
        return edad;
    }

    public Lote getLote() {
        return lote;
    }

    public TreeMap<Integer, Robot> getVacas() {
        return vacas;
    }
    public void gran_move(int X, int Y){
        int j=granjero.getAvenue();
        int k=granjero.getStreet();
        while(k!=Y||j!=X){
                j=granjero.getAvenue();
                
                k=granjero.getStreet();
                
                if(k<Y&&j==X){
                    while(granjero.getDirection()!=Direction.SOUTH){
                        granjero.turnLeft();
                    }
                    granjero.move();
                }else if(k>Y&&j==X){
                    while(granjero.getDirection()!=Direction.NORTH){
                        granjero.turnLeft();
                    }
                    Granjero.getGranjero().move();
                }else if(k==Y&&j<X){
                    while(granjero.getDirection()!=Direction.EAST){
                        granjero.turnLeft();
                    }
                    granjero.move();
                }else if(k==Y&&j>X){
                    while(granjero.getDirection()!=Direction.WEST){
                        granjero.turnLeft();
                    }
                    granjero.move();
                //}else if(){
                    
                }else{
                        j=granjero.getAvenue();
                        k=granjero.getStreet();
                        if(j<X){
                            while(granjero.getDirection()!=Direction.EAST){
                               granjero.turnLeft(); 
                            }
                            granjero.move();
                        }else if (j>X){
                            while(granjero.getDirection()!=Direction.WEST){
                                granjero.turnLeft();
                            }
                            granjero.move();
                        }else if(k<Y){
                            while(granjero.getDirection()!=Direction.SOUTH){
                                granjero.turnLeft();
                            }
                            granjero.move();
                        }else if(k>Y){
                            while(granjero.getDirection()!=Direction.NORTH){
                                granjero.turnLeft();
                            }
                            granjero.move();
                        }
                }
        }
    }
}
