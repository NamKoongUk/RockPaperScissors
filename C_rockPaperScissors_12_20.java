// ���������� ����

package com.one.day;

import java.util.Random;
import java.util.Scanner;

public class C_rockPaperScissors_12_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ 0��, ������ 1��, ���ڱ�� 2���� �����ּ��� : ");
		int inum = sc.nextInt();

		int ynum = new Random().nextInt(3);   // ���� �Լ��� ���� 0~2 ������ ���ڸ� �������� ȣ��

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
