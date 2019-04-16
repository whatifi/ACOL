/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;
import java.util.Random;
import java.lang.Math;

/**
 *
 * @author hatifiw
 */
class Stock {
    private String name;
    private float price;
    private static final float  volatility = (float) 0.34;
    private static final float  drift = (float) 0.17;

    public Stock(String name, float price) {
        this.name = name;
        this.price = price;
    }
    
    public void setThefirstStock(String name){
        this.setName(name);
        float random;
        random = 40 + 79 * (float)Math.random();
        this.setPrice(random);
    }
    
    public void updateSTock(String name, float tmps){
        float mbs_t = RandomGaussian.getGaussian((float) 0.0,  tmps);
        double blackS;
        blackS = Math.exp( (double) (  tmps*(drift - (volatility*volatility)/2) + volatility*mbs_t ));
        this.price = (float) ( (double)this.price*blackS );
        
        
    }
   
    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
    
}
