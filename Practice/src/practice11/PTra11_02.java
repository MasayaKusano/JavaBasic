package practice11;
/*
 * PTra11_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

import java.util.Scanner;

public class PTra11_02 {
	public static void main(String[] args) {

		// ★ ReadFileClassのクラスメソッドreadBookDataFileを使い、本情報を取得します

		Book[] boook = FileReaderClass.readBookDataFile() ;



		System.out.println("探したい本のタイトル（又はその一部）を入力してください");

		// ★ ユーザが入力した文字列が、本情報のタイトル一部に含まれていた場合は、その本情報を出力してください
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();

		for (Book book : boook) {
			if (book.title.indexOf(line) >= 0) {
				System.out.println(book.dispBookInfo());
			}
		}
	}
}




