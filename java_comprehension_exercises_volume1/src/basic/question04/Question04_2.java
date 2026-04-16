package basic.question04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第7章 配列
 */

public class Question04_2 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] ageGroup = { 23, 44, 26, 21, 25, 22 };
		System.out.println("４番目の人の年齢を入力してください");
		String i = reader.readLine();
		int temporaryAge = Integer.parseInt(i);
		ageGroup[3] = temporaryAge;
		System.out.println("４番目の人の年齢は" + ageGroup[3] + "歳です");
		System.out.println("人数は" + ageGroup.length + "人です。");

	}

}
