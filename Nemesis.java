package NemesisRobocode;
import robocode.*;
import java.awt.Color;

/**
 * Nemesis - a robot by (your name here)
 */
public class Nemesis extends AdvanceRobot
{
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
		fire(1);
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
								