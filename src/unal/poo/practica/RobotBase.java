package unal.poo.practica;

import becker.robots.*;
import java.awt.Color;
import java.util.*;
/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public  static Vacas estudiante;
        public static Vacas vallejo;
        public static Robot alguien;
        public static Granjero Granjero;
        
        ArrayList<Robot> vacas;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            Lote lote;
            Random ran=new Random();
            int na1=1+ran.nextInt(5);
            int na1_2=ran.nextInt(3);
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);

            
            
            estudiante.getVaca().setColor(Color.yellow);
            
            estudiante.getVaca().setSpeed(2);
            alguien=new Robot (objetos,8,8,Direction.WEST);
            
            alguien.setColor(Color.PINK);
            estudiante.setGranjero(Granjero);

        }
}

