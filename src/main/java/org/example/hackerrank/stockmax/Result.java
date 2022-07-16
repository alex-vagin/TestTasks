/*
https://www.hackerrank.com/challenges/stockmax/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
	*/
package org.example.hackerrank.stockmax;

import java.util.List;

public class Result {

	/*	public static int findMax(List<Integer> prices, int startPosition) {
			int maxValue = 0;
			int result = prices.size();

			for (int i = startPosition; i < prices.size(); i++) {
				Integer curentValue = prices.get(i);
				if (curentValue > prices.get(i - 1) && curentValue > maxValue) {
					maxValue = curentValue;
					result = i;
				}
			}
			return result;
		}


		public static long stockmax(List<Integer> prices) {
			int idx = 0;
			long result = 0;
			int startPosition = 1;

			do {
				idx = findMax(prices, startPosition);

				if (idx < prices.size()) {
					int limit = idx - startPosition + 1;
					Integer maxValue = prices.get(idx);
					result += prices.stream().filter(value -> value < maxValue).map(value -> maxValue - value).limit(limit).reduce(Integer::sum).orElse(0);
				}
				startPosition = idx + 2;

			} while (idx > 0 && startPosition < prices.size());

			return result;
		}*/
	public static long stockmax(List<Integer> prices) {
		long result = 0;
		int depth = 0;

		for (int i = prices.size() - 2; i >= 0; i--) {
			depth = Math.max(depth + prices.get(i + 1) - prices.get(i), 0);

			if (depth > 0) {
				result += depth;
			}
		}

		return result;
	}
}
