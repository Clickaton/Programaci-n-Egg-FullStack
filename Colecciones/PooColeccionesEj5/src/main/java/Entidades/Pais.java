/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.TreeSet;

/**
 *
 * @author chris
 */
public class Pais {
    
    private TreeSet<String> pais;

    public Pais() {
    }

    public Pais(TreeSet<String> pais) {
        this.pais = pais;
    }

    public TreeSet<String> getPais() {
        return pais;
    }

    public void setPais(TreeSet<String> pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Pais{" + "pais=" + pais + '}';
    }
    
    
}
