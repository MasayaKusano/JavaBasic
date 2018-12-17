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
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ① ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください ★
		 * ArrayListを作成して、Playerインスタンスを格納してください
		 */

		ArrayList<Player> array = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {

				String line = scanner.nextLine();

				Player player = new Player();

				String[] aaa = line.split(",");

				player.setPosition(aaa[0]);
				player.setName(aaa[1]);
				player.setCountry(aaa[2]);
				player.setTeam(aaa[3]);

				array.add(player);
			}

		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

		Collections.shuffle(array);
		int GKcount = 0 ;
		int DFcount = 0 ;
		int MFcount = 0 ;
		int FWcount = 0 ;

		for (int i = 0; i < array.size(); i++) {
			if (array.get(i).getPosition().equals("GK") && GKcount < 1) {
				System.out.println(array.get(i));
				GKcount++;
			}
		for (int d = 0; d < array.size(); d++) {
			if (array.get(d).getPosition().equals("DF") && DFcount < 4) {
				System.out.println(array.get(d));
				DFcount++;
			}
		for (int m = 0; m < array.size(); m++) {
			if (array.get(m).getPosition().equals("MF") && MFcount < 4) {
				System.out.println(array.get(m));
				MFcount++;
			}
		for (int f = 0; f < array.size(); f++) {
			if (array.get(f).getPosition().equals("FW") && FWcount < 2) {
				System.out.println(array.get(f));
				FWcount++;
			}
			}
		}
		}
		}
	}
}


