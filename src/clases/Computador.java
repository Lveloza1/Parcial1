/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author lveloza1
 */
public class Computador {

    private String color;
    private double cdisco;
    private double cmemoria;
    private int nucleos;

    

    public Computador( String color, double cdisco, double cmemoria, int nucleos) {

        this.color = color;
        this.cdisco = cdisco;
        this.cmemoria = cmemoria;
        this.nucleos = nucleos;
    }

  

    public String getColor() {
        return color;
    }

    public double getCdisco() {
        return cdisco;
    }

    public double getCmemoria() {
        return cmemoria;
    }

    public int getNucleos() {
        return nucleos;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setCdisco(double cdisco) {
        this.cdisco = cdisco;
    }

    public void setCmemoria(double cmemoria) {
        this.cmemoria = cmemoria;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public Computador precioComputador() {
        Computador c;
        String  color;
        double cdisco, cmemoria;
        int nucleo;
        
        color=this.color;
        cdisco=this.cdisco;
        cmemoria=this.cmemoria;
        nucleo=this.nucleos;
        

        c = new Computador(color, cdisco, cmemoria, nucleo);
        return c;
    }

}
