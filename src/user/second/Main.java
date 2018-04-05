package user.second;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final user.first.Number num = new user.first.Number(Math.random());
		boolean watcher = false;
		int counter = 1;
		while(!watcher) {
			double tempNum  = Math.random();
			if(num.isInThreshold(tempNum)) {
				watcher = true;
			}
			counter ++;
		}
		System.out.println(counter);
	}

}
