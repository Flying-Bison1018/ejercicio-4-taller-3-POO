/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche;

/**
 *
 * @author PC
 */
public class Coche {
   private String color;
    private String marca;
    private String modelo;
    private int numeroCaballos;
    private int numeroPuertas;
    private String matricula;
 public Coche(){
        this.color = "";
        this.marca = "";
        this.matricula = "";
        this.modelo = "";
        this.numeroCaballos = 0;
        this.numeroPuertas = 0;                
    }
    
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getMatricula(){
        return matricula;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }
    public void setNumeroCaballos(int numeroCaballos){
        this.numeroCaballos = numeroCaballos;
    }
    public int getNumeroCaballos(){
        return numeroCaballos;
    }
    public void setNumeroPuertas(int numeroPuertas){
        this.numeroPuertas = numeroPuertas;
    }
}
