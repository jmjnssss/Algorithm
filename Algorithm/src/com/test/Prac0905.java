package com.test;

import java.util.HashMap;
import java.util.Scanner;

public class Prac0905 {

	
	/*
		백준 9375번 (패션왕 신해빈)

		해빈이는 패션에 매우 민감해서 한번 입었던 옷들의 조합을 절대 다시 입지 않는다. 
		예를 들어 오늘 해빈이가 안경, 코트, 상의, 신발을 입었다면, 다음날은 바지를 추가로 입거나 안경대신 렌즈를 착용하거나 해야한다. 
		해빈이가 가진 의상들이 주어졌을때 과연 해빈이는 알몸이 아닌 상태로 며칠동안 밖에 돌아다닐 수 있을까?

	*/
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
 
		int T = in.nextInt();	// 테스트 케이스 
 
		while (T -- > 0) {
			
			HashMap<String, Integer> hm = new HashMap<>();	// <종류, 개수>
			
			int N = in.nextInt();	// 입력받는 옷의 개수
			
			while (N-- > 0) {
				
				in.next();	// 옷 이름은 필요 없음 
				
				String kind = in.next();	// 옷 종류 
 
				/**
				 * 해당 종류의 옷이 해시맵에 있을경우
				 * 해시맵에 저장되어있던 해당 종류의 개수를 +1 증가시킨다.
				 *
				 * 해당 종류의 옷이 해시맵에 없을 경우
				 * 해당 종류와 개수 1을 넣는다.
				 */
				
				if (hm.containsKey(kind)) {
					hm.put(kind, hm.get(kind) + 1);
				} 
				else {
					hm.put(kind, 1);
				}
			}
 
			int result = 1;
 
			/**
			 * 안 입는 경우를 고려하여 각 종류별 옷의 개수에 +1 해준 값을
			 * 곱해주어야 한다.
			 */
			for (int val : hm.values()) {
				result *= (val + 1);
			}
	
			System.out.println(result - 1);		// 알몸인 상태를 제외해주어야 하므로 최종값에 -1이 정답.
 
		}
 
	}
}
