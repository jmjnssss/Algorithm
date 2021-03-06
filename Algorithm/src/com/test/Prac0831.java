package com.test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;
 

public class Prac0831 {

	/*
		백준 1181번 (단어정렬)
	
		알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
		
		길이가 짧은 것부터
		길이가 같으면 사전 순으로
		
	*/
		
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		String[] arr = new String[N];
 
		in.nextLine();	// 개행 버림
 
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				// 단어 길이가 같을 경우 
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} 
				// 그 외의 경우 
				else {
					return s1.length() - s2.length();
				}
			}
		});
 
 
		StringBuilder sb = new StringBuilder();
 
		sb.append(arr[0]).append('\n');
		
		for (int i = 1; i < N; i++) {
			// 중복되지 않는 단어만 출력
			if (!arr[i].equals(arr[i - 1])) {
				sb.append(arr[i]).append('\n');
			}
		}
		System.out.println(sb);
		
	
	
	
	}
}
