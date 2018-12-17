package practice09;

import practice09.util.Util;

public class PTra09_02 {
	public static void main(String[] args) {
		String[] array = {"Plain", "Island", "Mountain", "Swamp", "Forest"};

		// ★ 配列arrayを、Util内のメソッドを用いてランダムに並び替えてください
		// ※ Utilはインポートしても良いし、完全限定名で記述しても良いです


		// ★ ランダムに並び替えた後の配列を前から順に全て表示してください

		for (String aaa : Util.shuffleArray(array)) {
            System.out.print(aaa);
        }
	}
}

		//どちらでも
		//String[] aaa = Util.shuffleArray(array);
		//System.out.println(aaa[0] + aaa[1] + aaa[2] + aaa[3] + aaa[4]);
