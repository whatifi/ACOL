/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.Calendar;

/**
 *
 * @author hatifiw
 */
public class TradeStock extends Trade {
    private Stock stock;
    private Order order;

    public TradeStock(Calendar time, int qty, Side side) {
        super(time, qty, side);
    }
    
    
}


