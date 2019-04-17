/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.List;

/**
 *
 * @author hatifiw
 */
public class Utilisateur {
    private String username;
    private float cash;
    private List<Stock> stoksHolding;
    private History historyTrades;

    public Utilisateur(String username, float cash, List<Stock> stoksHolding) {
        this.username = username;
        this.cash = cash;
        this.stoksHolding = stoksHolding;
    }

    public void setCash(float cash) {
        this.cash = cash;
    }
    
    public void makeATradeBuy(Trade e){
        
    }
    
    
}
