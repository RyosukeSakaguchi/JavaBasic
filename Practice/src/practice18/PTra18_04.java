/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

	/*
	 * PTra18_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ① ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください ★
		 * ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<Player>();
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				Player player = new Player();
				String line = scanner.nextLine();
				String[] lines = line.split(",");
				player.setPosition(lines[0]);
				player.setName(lines[1]);
				player.setCountry(lines[2]);
				player.setTeam(lines[3]);
				array.add(player);
			}

		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		Collections.shuffle(array);
		int i, j, k, l; 
		i = j = k = l = 0;
		for (Player a : array) {
			if (a.getPosition().equals("GK")) {
				if (i == 1) {
					continue;
				}
				i++;
				System.out.println(a.toString());
			}else if(a.getPosition().equals("DF")) {
				if (j == 4) {
					continue;
				}
				j++;
				System.out.println(a.toString());
			}else if(a.getPosition().equals("MF")) {
				if (k == 4) {
					continue;
				}
				k++;
				System.out.println(a.toString());
			}else if(a.getPosition().equals("FW")) {
				if (l == 2) {
					continue;
				}
				l++;
				System.out.println(a.toString());
			}

		}
		

	}
}
