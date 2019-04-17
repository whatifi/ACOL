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
public class History {
     private List<Trade> oldTrades;
     
    public void addTrade(Trade t){
        oldTrades.add(t);
    }
    
    public List<Trade> getOldTrades() {
        return oldTrades;
    }
     
     
}
