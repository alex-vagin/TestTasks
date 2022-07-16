package org.example.hackerrank.equalproblem;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Result {
	private static Integer f(List<Integer> arr, int m) {
		return arr.stream().map(p -> {
			int value = p - m;
			return value/5 + (value % 5)/2 + (value % 5) % 2;
		}).reduce(0, Integer::sum);
	}

	public static int equal(List<Integer> arr) {
		Integer min = Collections.min(arr);
		return IntStream.range(0, 5).map(p -> f(arr, min - p)).reduce(Integer::min).getAsInt();
	}
}
