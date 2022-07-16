package org.example.hackerrank.equalproblem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class ResultTest {
	@ParameterizedTest
	@MethodSource("args")
	void equal(int expectedValue, List<Integer> list) {
		Assertions.assertEquals(expectedValue, Result.equal(list));
	}

	private static Stream<Arguments> args() {
		return Stream.of(
			Arguments.of(2, List.of(1, 1, 5)),
			Arguments.of(2, List.of(2, 2, 3, 7)),
			Arguments.of(3, List.of(10, 7, 12)));
	}
}