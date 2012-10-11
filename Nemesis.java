package NemesisRobocode;
import robocode.*;
import java.awt.Color;

/**
 * Nemesis
 * 
 * tasks:
 *  - use getBearing when hitting a wall to not hit the wall again?
 *  - find a good algorithm for movement. is circle strafing around oppenent possible?
 *  - make a method to find position that current robot is in.
 *  - mimic ememy robot color
 *  - mimic actions?
 */
public class Nemesis extends AdvanceRobot
{
	// implement these after we find location and rotation.
	int posX;
	int posY;
	int rot;
	
	/**
	 * run: Nemesis's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here
		setColors(Color.DARK_GRAY,Color.DARK_GRAY,Color.DARK_GRAY); // body,gun,radar

		// Robot main loop
		while(true) {
			ahead(100);
			turnGunRight(360);
			back(100);
			turnGunRight(360);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		setColors(Color.RED,Color.RED,Color.RED);
		fire(1);
		
	}
	
	/**
	 * Method to find position
	 * 
	 * first find two walls, measure distance, than from this point on, take note of location(?)
	 */
	public void positionFind(){
		return;
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		back(10);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		back(20);
	}	
}
								