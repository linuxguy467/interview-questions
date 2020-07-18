package com.matthem.interview.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeautifulOrchardTest {
  @Test
  public void solution1() {
    assertEquals(24, BeautifulOrchard.solution(new int[]{6, 1, 4, 6, 3, 2, 7, 4}, 3, 2));
  }

  @Test
  public void solution2() {
    assertEquals(-1, BeautifulOrchard.solution(new int[]{10, 19, 15}, 2, 2));
  }

  @Test
  public void solution3() {
    assertEquals(0, BeautifulOrchard.solution(null, 3, 5));
  }

  @Test
  public void solution4() {
    assertEquals(20, BeautifulOrchard.solution(new int[]{0, 6, 5, 2, 2, 5, 1, 9, 4}, 1, 2));
  }

  @Test
  public void solution5() {
    assertEquals(29, BeautifulOrchard.solution(new int[]{3, 8, 1, 3, 2, 1, 8, 9, 0}, 3, 2));
  }

  @Test
  public void solution6() {
    assertEquals(31, BeautifulOrchard.solution(new int[]{2, 1 ,5 ,6 ,0 ,9 ,5 ,0 ,3 ,8}, 4, 3));
  }
}