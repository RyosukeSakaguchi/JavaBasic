package practice12;

/*
 * PTra12_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
import practice12.common.Student;

public class PTra12_01 {
	public static void main(String[] args) {

		/*
		 * common.Studentにアクセサを追加し、
		 * ★ フィールドのアクセス修飾子を外部クラスからのアクセスを禁止させるようにしてください
		 *
		 * ★ 下記、インスタンスフィールドへのアクセスをアクセサ経由に変更してください
		 */
		Student student = new Student();
		student.setpro(10001, "リゾーム太郎", "株式会社リゾーム", "Z教室", "rhizome@hogehoge.com", "1qazxcvb");

		System.out.println("受講生ID　：" + student.getId());
		System.out.println("受講生名　：" + student.getStName());
		System.out.println("会社名　　：" + student.getCoName());
		System.out.println("教室名　　：" + student.getClName());
		System.out.println("メール　　：" + student.getMail());
		System.out.println("パスワード：" + student.getPass());
	}
}
