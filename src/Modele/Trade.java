/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import static java.lang.String.format;
import java.sql.Time;
import java.util.Calendar;

/**
 *
 * @author hatifiw
 */

enum Side {
    Buy, Sell
}

class Trade {
    Calendar time;
    int qty;
    Side side;

    Trade(Calendar time, int qty, Side side) {
        this.time = time;
        this.qty = qty;
        this.side = side;
    }

    @Override
    public String toString() {
        return format("Time: %s, Side: %s, Qty: %s", time, side, qty);
    }
}