package headfirst.designpatterns.state.gumballstatewinner;

import java.util.Random;

public class NoQuarterState implements State {
	Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
 
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	}

	public void tryMyLuck() { System.out.println("You can't try your luck without inserting a coin"); }

	public void refill() { }
 
	public String toString() {
		return "waiting for quarter";
	}
}
