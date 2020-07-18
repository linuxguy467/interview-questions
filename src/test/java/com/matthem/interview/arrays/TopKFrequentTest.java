package com.matthem.interview.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentTest {
  @Test
  void solution1() {
    assertArrayEquals(new int[]{1, 2}, TopKFrequent.solution(new int[]{1, 1, 1, 2, 2, 3}, 2));
  }

  @Test
  void solution2() {
    assertArrayEquals(new int[]{1}, TopKFrequent.solution(new int[]{1}, 1));
  }

  @Test
  void solution3() {
    assertArrayEquals(new int[]{}, TopKFrequent.solution(new int[]{1, 1, 1, 2, 2, 3}, 0));
  }

  @Test
  void solution4() {
    assertArrayEquals(new int[]{}, TopKFrequent.solution(new int[]{}, 5));
  }

  @Test
  void solution5() {
    assertArrayEquals(new int[]{}, TopKFrequent.solution(null, 5));
  }
}