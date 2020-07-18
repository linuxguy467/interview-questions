package com.matthem.interview.arrays;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class TopKFrequent {
  public static int[] solution(int[] nums, int k) {
    // O(1) time
    if(nums == null || nums.length == 0 || k <= 0) return new int[]{};
    if(k == nums.length) return nums;

    /*
     * 1) build map : character and occurrences
     * O(N) time
     */
    Map<Integer, Long> counts = Arrays.stream(nums).boxed()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .entrySet().stream().sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

    /*
     * 2) keep top k most frequent elements in heap
     * O(N log k) < O(N log N)
     */
    Queue<Integer> heap = counts.keySet().stream().limit(k).collect(Collectors.toCollection(PriorityQueue::new));


    /*
     * 3) build output array
     * O(k log k) time
     */
    return heap.stream().mapToInt(x -> x).toArray();
  }
}
