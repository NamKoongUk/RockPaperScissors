// 가위바위보 게임

package com.one.day;

import java.util.Random;
import java.util.Scanner;

public class C_rockPaperScissors_12_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위는 0번, 바위는 1번, 보자기는 2번을 눌러주세요 : ");
		int inum = sc.nextInt();

		int ynum = new Random().nextInt(3);   // 랜덤 함수를 통해 0~2 까지의 숫자를 무작위로 호출

		if(inum == 0 && ynum == 1) { 
			System.out.println("you Lose");
		}
		else if(inum == 1 && ynum == 2) {
			System.out.println("you Lose");	
		}
		else if(inum ==  2 && ynum == 0) {
			System.out.println("you Lose");
		}
		else if(inum == ynum) {
			System.out.println("Draw");
		}
		else if(inum == 0 && ynum == 2) {
			System.out.println("you Win");
		}
		else if(inum == 1 && ynum == 0) {
			System.out.println("you Win");
		}
		else if(inum == 2 && ynum == 1) {
			System.out.println("you Win");

		}

	}

}
