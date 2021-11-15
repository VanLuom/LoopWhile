package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 11.1
		int i = 0;
		int tong = 0;
		while(i <= 100) {
			i ++;
			tong += i;
		}
		System.out.println("Tong tu 1 den 100:" + tong);
		System.out.println("i =" + i );
		// 11.2
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so tu nhien n: ");
		int n = sc.nextInt();
		i = 0;
		while (i <= n) {
			if(i % 3 == 0 ){
				tong += i;
				System.out.println(  "tong chia het cho 3 " + tong  );
			}
			i++;
		}
		// 11.3
		System.out.println("Fibonacci");
		int fist = 1;
		int last = 1;
		int count = 0;
		while(count <= 100) {
			last  = fist + last;
			System.out.println(last + "/t");
			count++;			
		}
		// 11.4		
		 n = sc.nextInt();
		 System.out.println("Nhap vao mot so nguyen n ");
		int temp = n;
		int reversed = 0;
			while(n > 100 ) {
			int mod = n % 10;
			n = n / 10;
			reversed = reversed * 10 + mod;
			System.out.println("phan du " + mod);
			System.out.println("phan nguyen" + n);
			if(reversed == temp)
				System.out.println(temp + " la so polinom");
			else
				System.out.println(temp + "khong phai la so polinom");

			}
			//11.5
			System.out.println("Nhap vao so nguyen n");
			n = sc.nextInt();
			temp = n;
			tong = 0;
			while(n > 0) {
			int m = n % 10;
			n = n / 10;
			tong += m;
			}
			if(tong % 3 == 0)
			System.out.println("So co tong cac chu so chia het cho 3");
			else
			System.out.println("Khong phai so co tong cac chu so chia het cho 3");
		}

		
		
	}
	
	
	

