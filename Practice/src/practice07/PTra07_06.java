package practice07;
/*
 * PTra07_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
import java.util.Arrays;

public class PTra07_06 {
	public static void main(String[] args) {

		// ★ PTra07_05.javaで作成したランダム値が入った配列arrayを作成してください
		int[] array;
		array = new int[5];
		for(int i = 0; i < array.length  ; i++) {
			int index = new java.util.Random().nextInt(100001);
			array[i] = index;
			System.out.println(array[i]);
		}

		System.out.println("配列の中身を小さい順に並び替えます");

		// ★ 配列arrayの中身を、昇順(数値が小→大になるように)に並び替えてください
		// 並び替えにはArrays.sort(array);を使用してくださいb。
		
		Arrays.sort(array);
		for(int i = 0; i < array.length  ; i++) {
			System.out.println(array[i]);
		}
		

	}
}
