package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	

	//2. create an array of 5 robots.
Robot[] r=new Robot[3];
System.out.println(r.length);
	//3. use a for loop to initialize the robots.
for(int i=0; i<r.length;i++) {
	r[i]=new Robot();
	r[i].setX(200 + (i * 100));
	r[i].setY(550);
	r[i].setAngle(45);
}
		//4. make each robot start at the bottom of the screen, side by side, facing up




//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
boolean racerunner=true;

while(racerunner) {
for(int i=0; i<r.length;i++) {
	Random random=new Random();
	int y=random.nextInt(200);
	r[i].move(y);
	
	
	if(r[i].getY()<100) {
		JOptionPane.showMessageDialog(null, "Someone won!!");
	System.exit(0);
	}
}
}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
			//FINISHED
	//7. declare that robot the winner and throw it a party!
			//FINSHED
	//8. try different races with different amounts of robots
		//FINSHED
	//9. make the robots race around a circular track.



}
}