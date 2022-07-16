package org.example.hackerrank.fndpoint;

import java.util.List;

public class Result {
	public static List<Integer> findPoint(int px, int py, int qx, int qy) {
		return List.of(qx + qx - px, qy + qy - py);
	}
}
