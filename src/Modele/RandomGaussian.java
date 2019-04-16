/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modele;
import java.util.Random;

/**
 *
 * @author 
 */

public final class RandomGaussian {


  public static float getGaussian(float aMean, float aVariance){
    Random fRandom = new Random();
    return (float) (aMean + fRandom.nextGaussian() * aVariance);
  }

  private static void log(Object aMsg){
    System.out.println(String.valueOf(aMsg));
  }
} 