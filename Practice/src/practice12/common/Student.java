/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	/** 受講生ID */
	public int studentId;

	/** 受講生氏名 */
	public String studentName;

	/** 会社名 */
	public String companyName;

	/** 教室名 */
	public String className;

	/** メールアドレス */
	public String mail;

	/** パスワード */
	public String password;
	
	public int getId() {
        return this.studentId;
    }
	public String getStName() {
        return this.studentName;
    }
	public String getCoName() {
        return this.companyName;
    }
	public String getClName() {
        return this.className;
    }
	public String getMail() {
        return this.mail;
    }
	public String getPass() {
        return this.password;
    }
	
	public void setName(int studentId, String studentName, String companyName, String className, String mail, String password) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.companyName = companyName;
        this.className = className;
        this.mail = mail;
        this.password = password;
    }


}
