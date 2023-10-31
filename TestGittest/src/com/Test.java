package com;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String args[]) throws Exception{

		// streamのメソッドのfilter,sorted,map,forEachを使用
		int[] numbers = {-1, 2, 0, -3, 8};
		List<Integer> numbersList = new ArrayList<>();
		for(int n : numbers) {
		  numbersList.add(n);
		}
		numbersList.stream().filter((i) -> { return i >= 0; })
        .sorted((i1, i2) -> { return i1 - i2; })
        .map((i) -> { return "*" + i + "*"; })
        .forEach((s) -> { System.out.print(s + " "); });
        //結果
        // *0* *2* *8*

	}
}
