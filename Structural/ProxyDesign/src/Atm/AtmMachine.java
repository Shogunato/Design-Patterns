package Atm;

import java.util.Scanner;

public class AtmMachine implements GetAtmData {
    
    Card card;
    private int money;


    public AtmMachine() {
        this.money = 9000;
    }

    
    public void insertCard(Card card) {

        if(this.card == null){
            System.out.println("Please insert pin: ");
            Scanner scanner = new Scanner(System.in);
            if(card.insertPin(scanner.nextInt())==true) {
                this.card = card;
            }else{
                System.out.println("Incorrect pin refusing card...");
            }
            scanner.close();
        }else{
            System.out.println("Card already inserted...");
        }

    }

    void ejectCard() {
        this.card = null;
        System.out.println("Card Ejected");
    }

    public void requestCash(int requestCash) {

        if(card != null){
            if(requestCash < this.money) {

                this.money =- requestCash;
                System.out.println("Money delivered");
            } else{
                System.out.println("Not enough money in ATM");
            }
        } else{
            System.out.println("Please insert card.");
        }

    }

    @Override
    public int getMoneyinAtm() {
        return this.money;
    }


    @Override
    public String getData() {
        return "[Money in ATM="+money+", Card in ATM="+card+"]";
    }

    public void setCash(int money) {
        this.money = money;
    }

}
