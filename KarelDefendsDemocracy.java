package week1;
import stanford.karel.*;
public class KarelDefendsDemocracy extends SuperKarel {
	public void run(){
		move();
		checkBeeper();
		walkPastBallot();
	}
private void checkBeeper(){
		if (noBeepersPresent()){
			checkRight();
			checkLeft();
		}
	}
private void checkRight(){
		turnRight();
		move();
		if (beepersPresent()){
			while (beepersPresent()){
				pickBeeper();
			}
			turnAround();
			move();
			turnRight();
		} else {
			turnAround();
			move();
			turnRight();
		}
	}
private void checkLeft(){
		turnLeft();
		move();
		if (beepersPresent()){
			while (beepersPresent()){
				pickBeeper();
			}
			turnAround();
			move();
			turnLeft();
		} else {
			turnAround();
			move();
			turnLeft();
		}
	}
	private void walkPastBallot(){
		while (frontIsClear()){
			move();
			if (frontIsClear()){
				move();
			}
			checkBeeper();
		}
	}
}

