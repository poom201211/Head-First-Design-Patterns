package headfirst.designpatterns.state.gumballstatewinner;

import java.util.Random;

public class JackpotState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());

    GumballMachine gumballMachine;

    public JackpotState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a Gumball");
    }

    public void ejectQuarter() {
        System.out.println("Please wait, we're already giving you a Gumball");
    }

    public void turnCrank() {
        System.out.println("Turning again doesn't get you another gumball!");
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            for(int i = 0; i < 20; i++){
                gumballMachine.releaseBall();
                System.out.println("YOU'RE A WINNER! You got two gumballs for your quarter");
                if (gumballMachine.getCount() > 0) {
                    gumballMachine.setState(gumballMachine.getNoQuarterState());
                } else {
                    System.out.println("Oops, out of gumballs!");
                    gumballMachine.setState(gumballMachine.getSoldOutState());
                }
            }
        }
    }

    public void tryMyLuck() { System.out.println("You can't try your luck without inserting a coin"); }

    public void refill() {

    }
    public String toString() {
        return "despensing twenty gumballs for your quarter, because YOU'RE A WINNER!";
    }
}
