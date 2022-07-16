package org.example.hackerrank.coinchange;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class ResultTest {
	@ParameterizedTest
	@MethodSource("args")
	void getWays(int expectedValue, int n, List<Long> list) {
		Assertions.assertEquals(expectedValue, Result.getWays(n, list));
	}

	private static Stream<Arguments> args() {
		return Stream.of(
			Arguments.of(4, 4, List.of(1L, 2L, 3L)),
			Arguments.of(5, 10, List.of(2L, 5L, 3L, 6L)));
	}
}