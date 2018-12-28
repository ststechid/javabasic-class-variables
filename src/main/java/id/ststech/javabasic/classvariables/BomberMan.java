/**
 * 
 */
package id.ststech.javabasic.classvariables;

/**
 * @author Ali Irawan (boylevantz@gmail.com)
 *
 */
public class BomberMan {

	private int bomb;
	private int fire;
	private int boot;

	private static int count;

	// Using static initializer
	static {
		BomberMan.count = 0;
	}
	
	/**
	 * @return the bomb
	 */
	public int getBomb() {
		return bomb;
	}

	/**
	 * @param bomb the bomb to set
	 */
	public void setBomb(int bomb) {
		this.bomb = bomb;
	}

	/**
	 * @return the fire
	 */
	public int getFire() {
		return fire;
	}

	/**
	 * @param fire the fire to set
	 */
	public void setFire(int fire) {
		this.fire = fire;
	}

	/**
	 * @return the boot
	 */
	public int getBoot() {
		return boot;
	}

	/**
	 * @param boot the boot to set
	 */
	public void setBoot(int boot) {
		this.boot = boot;
	}

	/**
	 * @return the count
	 */
	public static int getCount() {
		return count;
	}

	/**
	 * This is default constructor
	 */
	public BomberMan() {
		super();
		
		this.bomb = 1;
		this.fire = 1;
		this.boot = 1;
		
		// Add one, every object created
		BomberMan.count++;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BomberMan [bomb=" + bomb + ", fire=" + fire + ", boot=" + boot + "]";
	}
}
