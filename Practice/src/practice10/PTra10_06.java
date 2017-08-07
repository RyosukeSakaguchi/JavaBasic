package practice10;

import java.util.Arrays;

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ★ carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * ★ 各carインスタンスのrunメソッドを実行して、200km先の目的地に到達した順位を出力してください
		 */
		Car[] cars = new Car[3];
		int[] count = new int[3];
		
		cars[0] = new Car();
		cars[0].color = "赤";
		cars[0].gasoline = 200;
		
		cars[1] = new Car();
		cars[1].color = "青";
		cars[1].gasoline = 200;
		
		cars[2] = new Car();
		cars[2].color = "緑";
		cars[2].gasoline = 200;
		
		for(int i = 0; i < cars.length; i++) {
			int distance = 200;
			for(int j = 0; ; j++) {
				distance -= cars[i].run();
				cars[i].count = count[i] = j+1;
				if(distance <= 0) {
					break;
				}
			}
		}
		Arrays.sort(count);
		for(int i = 0; i < cars.length; i++) {
			for(int j = 0; j < count.length; j++) {
				if(count[i] == cars[j].count) {
					System.out.println((i+1) + "位は" + cars[j].color + "色の車");
				}
			}
		}

	}
}
