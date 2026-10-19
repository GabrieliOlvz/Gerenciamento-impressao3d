/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.awt.Dimension;
import javax.swing.JDesktopPane;

import view.Cadastro;
import view.Calculadora;
import view.Impressoes;
import view.Inicio;

/**
 *
 * @author Gabrieli
 */
public class ControladorTela {
    JDesktopPane jDesktopPane;

    public ControladorTela(JDesktopPane jDesktopPane) {
        this.jDesktopPane = jDesktopPane;
    }
        
    public void carregarInicio(){
        
        jDesktopPane.removeAll();
        jDesktopPane.updateUI();
        Dimension resolucao = jDesktopPane.getSize();
        Inicio inicio = new Inicio();
        inicio.setSize(resolucao);
        inicio.setLocation(0, 0);
        jDesktopPane.add(inicio);
        inicio.setVisible(true);
    }
    
    public void carregarCadastro(){
        
        jDesktopPane.removeAll();
        jDesktopPane.updateUI();
        Dimension resolucao = jDesktopPane.getSize();
        Cadastro cadastro = new Cadastro();
        cadastro.setSize(resolucao);
        cadastro.setLocation(0, 0);
        jDesktopPane.add(cadastro);
        cadastro.setVisible(true);
        
    }
    
    public void carregarImpressoes(){
        
        
        
    }
    
    public void carregarCalculadora(){
    
        
        
    }
    } 
