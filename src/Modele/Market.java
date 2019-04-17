/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.sql.Time;
import java.util.Calendar;
import java.util.logging.Logger;

/**
 *
 * @author acol authors
 */
abstract public class Market {
     public Calendar openingHour ;
     public Calendar closingHour;

    public void setOpeningHour() {
        // Creating a calendar 
        Calendar cal = Calendar.getInstance(); 
        cal.set(Calendar.HOUR, 9);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        this.openingHour = cal;
    }

    public void setClosingHour(Calendar closingHour) {
        Calendar cal = Calendar.getInstance(); 
        cal.set(Calendar.HOUR, 21);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        this.closingHour = closingHour;
    }

  
    
    
    
}
