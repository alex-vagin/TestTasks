package org.example.hackerrank.stockmax;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class ResultTest {
	@ParameterizedTest
	@MethodSource("args")
	void stockmax(long expectedValue, List<Integer> prices) {
		Assertions.assertEquals(expectedValue, Result.stockmax(prices));
	}

	private static Stream<Arguments> args() {
		return Stream.of(
			Arguments.of(0, List.of(5, 3, 2)),
			Arguments.of(197, List.of(1, 2, 100)),
			Arguments.of(3, List.of(1, 3, 1, 2)),
			Arguments.of(1, List.of(1, 2)),
			Arguments.of(0, List.of(2, 1)));
	}
}