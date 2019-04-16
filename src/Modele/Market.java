/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.sql.Time;
import java.util.logging.Logger;

/**
 *
 * @author acol authors
 */
abstract public class Market {
    public Time openingHour;
    public Time closingHour;

    public Time getOpeningHour() {
        return openingHour;
    }

    public Time getClosingHour() {
        return closingHour;
    }

    public void setOpeningHour(Time openingHour) {
        this.openingHour = openingHour;
    }

    public void setClosingHour(Time closingHour) {
        this.closingHour = closingHour;
    }
    
    
    
}
