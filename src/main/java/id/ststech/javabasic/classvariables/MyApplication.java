/**
 * 
 */
package id.ststech.javabasic.classvariables;

/**
 * @author Ali Irawan (boylevantz@gmail.com)
 *
 */
public class MyApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Count = " + BomberMan.getCount());
		
		BomberMan player1 = new BomberMan();
		
		System.out.println("Count = " + BomberMan.getCount());
		
		BomberMan player2 = new BomberMan();
		
		System.out.println("Count = " + BomberMan.getCount());
		
		BomberMan player3 = new BomberMan();
		
		System.out.println("Count = " + BomberMan.getCount());
		
		player1.setBomb(1);
		player1.setFire(2);
		player1.setBoot(1);
		
		player2.setBomb(3);
		player2.setFire(3);
		player2.setBoot(1);
		
		player3.setBomb(4);
		player3.setFire(1);
		player3.setBoot(2);
		
		System.out.println(player1);
		System.out.println(player2);
		System.out.println(player3);
	}

}
