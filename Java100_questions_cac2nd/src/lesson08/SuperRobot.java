package lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Chef {
	ArrayList<String> makeDishes(int rice, int fish, int egg, int seaweed) {
		ArrayList<String> result = new ArrayList<>();

		while (true) {
			if (rice >= 200 && fish >= 150 && egg >= 1 && seaweed >= 1) {
				result.add("海鮮丼");
				rice -= 200;
				fish -= 150;
				egg -= 1;
				seaweed -= 1;
			} else if (rice >= 150 && fish >= 150) {
				result.add("焼き魚定食");
				rice -= 150;
				fish -= 150;
			} else if (rice >= 100 && egg >= 1) {
				result.add("卵かけご飯");
				rice -= 100;
				egg -= 1;
			} else if (rice >= 80 && seaweed >= 1) {
				result.add("おにぎり");
				rice -= 80;
				seaweed -= 1;
			} else {
				break;
			}
		}

		return result;
		//return書くとその時点で処理終わっちゃうので繰り返し文の中にはループが終わっていいタイミングでしか書かない
	}

	public String topping(int num) {
		switch (num) {
		case 1:
			return "なし";
		case 2:
			return "ゆで卵";
		case 3:
			return "チーズ";
		case 4:
			return "刻みのり";
		case 5:
			return "刻みねぎ";
		case 6:
			return "大根おろし";
		case 7:
			return "明太子";
		default:
			return "なし";
		}
	}
}

public class SuperRobot {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("ごはんの量を入力してください（グラム）＞");
		int rice = Integer.parseInt(reader.readLine());

		System.out.print("\n魚の個数を入力してください（グラム）＞");
		int fish = Integer.parseInt(reader.readLine());

		System.out.print("\n卵の個数を入力してください＞");
		int egg = Integer.parseInt(reader.readLine());

		System.out.print("\n海苔の枚数を入力してください（グラム）＞");
		int seaweed = Integer.parseInt(reader.readLine());

		Chef chef = new Chef(); //インスタンス作成
		ArrayList<String> result = chef.makeDishes(rice, fish, egg, seaweed); //return受け取り配列に代入　=　makeDishesに値渡し

		System.out.print("\nトッピング選択(1~7): ");
		int num = Integer.parseInt(reader.readLine());
		String answer = chef.topping(num);

		if (result.size() == 0) {
			System.out.println("作れる料理がありませんでした。");
		} else {
			for (int i = 0; i < result.size(); i++) {
				System.out.println(result.get(i) + "を作りました。(トッピング：" + answer + ")");
			}
		}
	}

}
