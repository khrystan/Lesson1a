package com.gmail.ozyura1985;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� ���� �� �������� enter");
		double radius = sc.nextDouble();
		double circumference= Math.PI * 2*radius;
		System.out.println("������� ���� �������: " + circumference);
		sc.close();
	}

}
