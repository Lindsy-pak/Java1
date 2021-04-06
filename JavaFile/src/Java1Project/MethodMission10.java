package Java1Project;

import java.util.Scanner;

import Java2Project.Drink;

public class MethodMission10 {

	public static void main(String[] args) { /* 클래스와 배열은 그릇이다. */

		Scanner scan = new Scanner(System.in);

		String[] menuNmArr = { "콜라", "사이다", "환타", "스트라이트", "망고주스", "포도주스" };
		int[] menuPriceArr = { 1000, 1200, 1300, 1500, 2000, 3000 };

		Drink[] drinkArr = new Drink[6]; /* 여기서 타입은 드링크 타입이다. */
		/*
		 * 위 문장은 Drink타입의 배열만 올 수 있고 그 배열의 이름은 drinkArr이다. 이 Drink배열의 방을 6개 만들고 그 6개의 방을
		 * drinkArr에 넣어준다.
		 */
		/* 그 6개의 배열의 방을 만들기 위해서 반복문을 사용해 준다. */
		for (int i = 0; i < drinkArr.length; i++) {
			Drink beverage = new Drink(); /* 여기서 또 Drink 타입만 올 수 있는 drink라는 이름에 변수에 외부 파일 Drink에서 속성을 사용한다. */
			beverage.nm = menuNmArr[i];
			beverage.price = menuPriceArr[i];

			drinkArr[i] = beverage;
		}
		// printMenu(menuNmArr, menuPriceArr);

		printMenu3(drinkArr);

	}

	public static void printMenu(String[] name, int[] price) {
		String result = "<메뉴>\n0. 종료 \n";

		for (int i = 0; i < name.length; i++) {
//			System.out.printf("%d. %s (%,d원)\n",i+1, name[i], price[i]);
//			result += (i+1) + ". " + name[i] + " (" + price[i] + "원)\n";
			result += String.format("%d. %s (%,d원)\n", i + 1, name[i], price[i]); /* 이 방법으로 하는게 중요!! */
		}
		System.out.println(result);
	}
	public static void printMenu3 (Drink[] arr) {
		String result = "<메뉴>\n0. 종료 \n";
		for(int i = 0; i < arr.length; i++) {
			result += String.format("%d. %s (%,d원)\n", i+1, arr[i].nm, arr[i].price);
		}
		System.out.println(result);
	}



}
