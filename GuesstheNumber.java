package com.kirti.packages.JavaOOPsQuestion;

import java.util.Random;
import java.util.Scanner;

class Guess{
    public int Number;
    public int inputNumber;
    public int noofGUess=0;

    public int getNoofGUess() {
        return noofGUess;
    }

    public void setNoofGUess(int noofGUess) {
        this.noofGUess = noofGUess;
    }

     Guess(){
        Random rand= new Random();
        this.Number= rand.nextInt(100);
    }
    public void takeUserInput(){
        System.out.println("Enter the the value");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noofGUess++;
      if(inputNumber==Number){
          System.out.println("You guessed the right number that is :" + inputNumber+ " " +
                  "And the no of times: "+ noofGUess);
          return true;
      }
      else if(inputNumber<Number){
          System.out.println("No is less try greator number");
      }
      else if(inputNumber>Number){
          System.out.println("No is high try lessor number");
      }

          return false;
    }
        }

public class GuesstheNumber {
    public static void main(String[] args) {
      Guess g =new Guess();
      boolean b=false;
      while(!b){
      g.takeUserInput();
       b= g.isCorrectNumber();
      System.out.println(b);}


    }
}
