package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	//line_race(); 

	//9. make the robots race around a circular track.
Robot[] solo = new Robot[2];
int [] way=new int[2];

for (int i = 0; i < solo.length; i++) {
	solo[i]=new Robot();
	solo[i].setSpeed(10);

		solo[i].setX(400);
		solo[i].setY(400);
		solo[i].setSpeed(100);
		solo[i].penDown();
		way[i]=0;
	
}

for (int i = 0; i < 100; i++) {
	for(int k=0;k<solo.length;k++) {
	Random rand2 = new Random();
	int N=rand2.nextInt(10);
	way[k]+=N;
	for (int j = 0; j < N; j++) {
		solo[k].move(3);
		solo[k].turn(1);
	}
	}
}
for(int k=0;k<solo.length;k++) {
	System.out.print(way[k]+" ");
}
int index_maximumvalue = 0;

for (int i = 1; i < way.length; i++) {
	if (way[i] > way[index_maximumvalue]) {
		index_maximumvalue = way[i];
	}
}
System.out.println((index_maximumvalue+1)+ " is the winner!");
solo[index_maximumvalue].sparkle();
}
public static void line_race() {
	Robot[] rob = new Robot[10];

	//2. create an array of 5 robots.
	
	//3. use a for loop to initialize the robots.
	for (int i = 0; i < rob.length; i++) {
		rob[i]=new Robot();
		rob[i].setSpeed(10);
	}
		//4. make each robot start at the bottom of the screen, side by side, facing up
for (int i = 0; i < rob.length; i++) {
	rob[i].setX(50+200*i);
	rob[i].setY(500);
}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50



	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
boolean flag=true;
int winner=-1;
while (flag) {
	for (int i = 0; i < rob.length; i++) {
		Random rand = new Random();
		rob[i].move(rand.nextInt(50));
		if(rob[i].getY()<=55) {
			flag=false;
			winner=i;
			
			break;
		}
		
	}
	
}

	//7. declare that robot the winner and throw it a party!
System.out.println(winner+1);
rob[winner].sparkle();
	//8. try different races with different amounts of robots.
}
}


