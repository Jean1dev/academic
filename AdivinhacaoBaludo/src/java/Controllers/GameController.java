/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.*;
import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author jeanfernandes
 */
@ManagedBean(name = "gameController")
//@SessionScoped
@ViewScoped
public class GameController {

    private int fase = 1;
    private int numberChoise;
    private Integer secretNumber;
    private int chances;
    private String cMensagem;
    private String cAviso = "Chuta um numero ai parca";
    
    public void iniciar(){
        this.chances = 10;
        this.cMensagem = "Tente um numero";
        this.geraNumeroAleatorio();
    }

    public void validaNumero() {
        //validar aki se o tipo e int
        this.verificaNumero();
        // this.geraNumeroAleatorio();
    }

    private void finalizaSessao(boolean lLossWin) {
        if (lLossWin) {
            this.cMensagem = "Voce ganhou";
        } else {
            this.cMensagem = "voce perdeu";
        }

       // this.reiniciar();
    }
    
    private void controlaFase(){
        if(this.fase == 10){
            this.finalizaSessao(true);
            return;
        }
        
        this.fase++;
        this.reiniciar();
        this.chances = 10 - this.fase;
        this.manipulaAviso(true);
    }
    
    private void manipulaAviso(boolean flPulaFase){
        String msg = "";
        
        if(flPulaFase){
            this.cAviso = "voce avancou de fase :" + this.fase ;
            return;
        }
        
        msg = "o numero " + this.getNumberChoise() + " " + this.maiorOuMenor();
        this.cAviso = msg;
    }
    
    private String maiorOuMenor(){
        if(this.getNumberChoise() < this.getSecretNumber()){
            return "é menor";
        }else{
            return "é maior";
        }
    }

    private void verificaNumero() {
        if (this.chances == 0) {
            this.finalizaSessao(false);
        } else {
            if (this.secretNumber == this.numberChoise) {
                this.controlaFase();
            } else {
                this.manipulaAviso(false);
                this.chances--;
            }
        }
    }

    public void reiniciar() {
        this.chances = 10;
        this.geraNumeroAleatorio();
    }

    @PostConstruct
    private void geraNumeroAleatorio() {
        Random r = new Random();
        this.secretNumber = r.nextInt(101);
    }

    public int getNumberChoise() {
        return numberChoise;
    }

    public void setNumberChoise(int numberChoise) {
        this.numberChoise = numberChoise;
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public void setSecretNumber(int secretNumber) {
        this.secretNumber = secretNumber;
    }

    public int getChances() {
        return chances;
    }

    public void setChances(int chances) {
        this.chances = chances;
    }

    public String getcAviso() {
        return cAviso;
    }

    public void setcAviso(String cAviso) {
        this.cAviso = cAviso;
    }

    
    
    public String getcMensagem() {
        return cMensagem;
    }

    public void setcMensagem(String cMensagem) {
        this.cMensagem = cMensagem;
    }
    /**
     * Creates a new instance of GameController
     */
    public GameController() {
    }

}
