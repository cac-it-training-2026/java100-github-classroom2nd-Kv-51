/**
 * 第3章 探検隊のお仕事
 *
 * 問題4  歩いて橋を渡る
 *
 * 進行方向に全長3mの吊り橋を発見しました。
 * 5人の隊員は一人50cmの歩幅で歩かなければならず
 * また吊り橋は老朽化しているため一人ずつしか渡れません。
 *
 * コメントの位置にwhile文を利用した処理を記述して
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  隊長：
 *  吊り橋発見！
 *
 *  隊長：
 *  1人目が渡り始めたよ
 *
 *  隊長：
 *  まだ渡ってるよ
 *
 *  隊長：
 *  まだ渡ってるよ
 *
 *  隊長：
 *  まだ渡ってるよ
 *
 *  隊長：
 *  まだ渡ってるよ
 *
 *  隊長：
 *  まだ渡ってるよ
 *
 *  隊長：
 *  2人目が渡り始めたよ
 *
 *  隊長：
 *  まだ渡ってるよ
 *
 *  ～～～～～～～～ 中略 ～～～～～～～～～
 *
 *  隊長：
 *  まだ渡ってるよ
 *
 *  隊長：
 *  まだ渡ってるよ
 *
 *  全員渡り終わったよ！
 *
 */

package lesson03.challenge04;

import java.io.IOException;

public class Explorer {

	public static void main(String[] args) throws IOException {

		System.out.println("隊長：");
		System.out.println("吊り橋発見！\n");

		int fullLength = 300; //橋の終わりまでの距離
		int member = 0; //渡る人

		//ここにwhile文を利用した処理を記述
		while (member < 5) {

			if (fullLength == 300) { //残りの距離が300なら
				System.out.println((member + 1) + "人目が渡り始めたよ\n");
				fullLength -= 50;
			} else if (fullLength > 0) { //残りの距離が0より大きいなら
				System.out.println("隊長：\nまだ渡ってるよ\n");
				fullLength -= 50;
			} else { //残りの距離が0なら
				member++;
				fullLength = 300;
				//fullLengthに距離を補充しないと2人目に行かずにループ処理が終わる
			}

			//if・else if・elseのいずれかが該当する限り、
			//if・else if・elseのいずれかをmemberが5になるまでループする
		}

		System.out.println("全員渡り終わったよ！");

	}
}
