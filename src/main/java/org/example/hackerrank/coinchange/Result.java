/*
https://www.hackerrank.com/challenges/coin-change/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
Given an amount and the denominations of coins available, determine how many ways change can be made for amount. There is a limitless supply of each coin type.
 */
package org.example.hackerrank.coinchange;

import java.util.*;
import java.util.stream.Collectors;

public class Result {
	static Map<String, Long> results = new HashMap<>();
	static Long calculate(Long n, List<Long> c) {
		String key = n.toString().concat("_").concat(Integer.toString(c.size()));
		Long cachedResult = results.get(key);
		if (cachedResult != null) {
			return cachedResult;
		}

		long result = 0;

		for (int idx = 0; idx < c.size(); idx++) {
			Long currentValue = c.get(idx);
			if (currentValue > n ) {
				continue;
			}

			for (long accumulator = currentValue, remaining = n - currentValue; accumulator <= n; accumulator += currentValue, remaining -= currentValue) {
				if (remaining == 0) {
					result++;
				} else {
					int idx2 = idx + 1;
					if (idx2 < c.size()) {
						result += calculate(n - accumulator, c.subList(idx2, c.size()));
					}
				}
			}
		}

		results.put(key, result);
		return result;
	}

	public static long getWays(int n, List<Long> c) {
		results.clear();
		List<Long> list = new ArrayList<>(c);
		Collections.sort(list, Collections.reverseOrder());
		return calculate((long) n, list);
	}
}
