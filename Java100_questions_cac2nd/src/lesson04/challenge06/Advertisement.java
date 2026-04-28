package lesson04.challenge06;

public class Advertisement {

	public static void main(String[] args) {
		System.out.println("店員募集！\n");

		System.out.println("【勤務時間】\n");
		System.out.println("昼　9:00～17:00");
		System.out.println("夕　17:00～23:00");
		System.out.println("深夜　23:00～6:00");

		int nomalMoney = 1090;
		int nightMoney = (int) (nomalMoney * 1.25);

		System.out.println("\n【時給】\n");

		System.out.println("5:00～22:00 " + nomalMoney + "円");
		System.out.println("22:00～5:00 " + nightMoney + "円");

		System.out.println("\n・交通費全額支給");
		System.out.println("・制服は貸与いたします");
	}

}
