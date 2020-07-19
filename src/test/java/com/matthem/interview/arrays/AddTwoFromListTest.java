package com.matthem.interview.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoFromListTest {
  @Test
  void canTwoNumsAddToK1() {
    assertTrue(AddTwoFromList.canTwoNumsAddToKSorted(new int[]{10, 15, 3, 7}, 17));
  }

  @Test
  void canTwoNumsAddToKUnSorted() {
    assertTrue(AddTwoFromList.canTwoNumsAddToKUnSorted(new int[]{10, 15, 3, 7}, 17));
  }

  @Test
  void canTwoNumsAddToKUnSorted2() {
    assertTrue(AddTwoFromList.canTwoNumsAddToKUnSorted(new int[]{20, 4, 10, 50, 6}, 56));
  }
}