package com.gmail.ozyura1985;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int a,b,c;
		  double d;
	      System.out.println("������ ����� � �� �������� Enter");
		  a = sc.nextInt();
	      System.out.println("������ ����� b �� �������� Enter");
	      b = sc.nextInt();
	      System.out.println("������ ����� c �� �������� Enter");
	      c = sc.nextInt();
	      d = Math.pow(b, 2) - 4 * a * c;
	      System.out.println(d);
	      double x,x1,x2;
	      
	      if (d < 0) {
	         System.out.println("��������� �������");
	      }
	      if (d == 0) {
	         x = -b / 2 * a;
	         System.out.println("x = " + x);
	      }
	      if (d > 0) {
	         x1 = (-b + Math.sqrt(d)) / 2 * a;
	         x2 = (-b - Math.sqrt(d)) / 2 * a;
	         System.out.println("x1 = " + x1);
	         System.out.println("x2 = " + x2);
	         
	         sc.close();
	      }
	   }

	}