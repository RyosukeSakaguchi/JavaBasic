/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_03 {

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

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
		ArrayList<Player> array2 = new ArrayList<Player>();
		for (Player a : array) {
			if (a.getTeam().equals("レアル・マドリード") || a.getTeam().equals("バルセロナ")) {
				continue;
			} else {
				array2.add(a);
			}

		}

		// ★ 削除後のArrayListの中身を全件出力してください
		for (Player a : array2) {
			System.out.println(a.toString());
		}

	}
}
