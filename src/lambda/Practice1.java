package lambda;

import java.util.ArrayList;

public class Practice1 {

	public static void main(String[] args) {
		// ラムダ式の簡単な使い方を記述する
		// 準備
		String message = "中身 = ";

		ArrayList<String> numList = new ArrayList<>();
		numList.add("１個目");
		numList.add("２個目");
		numList.add("３個目");

		// ラムダ式の実行
		numList.stream().forEach(num -> System.out.print(message + num));
		System.out.print("\r\n\r\n");


		// 解説
		// ラムダ式は次の内容と同義である
		for (String num : numList) {
			System.out.print(message + num);
		}

		/*
		 * numList.stream().forEach(num
		 * この記載は以下に該当する
		 * for (String num : numList) {
		 * stream()のメソッドで一個ずつ取り出す仕組みを使用する
		 * （StreamAPI機能）
		 * ->
		 * この矢印がラムダ式の部分
		 * System.out.print(message + num);
		 * 説明するまでもないがコンソール出力
		 * よくある使い方のごくほんの一部
		 */

	}

}
