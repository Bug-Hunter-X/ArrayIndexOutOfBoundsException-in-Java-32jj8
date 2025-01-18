# ArrayIndexOutOfBoundsException in Java

This repository demonstrates a common Java error: the `ArrayIndexOutOfBoundsException`. The code attempts to access an array element beyond its valid index range, leading to a runtime exception.

## Bug Description

The provided Java code initializes an integer array of size 5 and then iterates through it, attempting to assign values to each element. However, the loop condition `i <= arr.length` is incorrect. Arrays in Java are zero-indexed, meaning the valid indices range from 0 to `arr.length - 1`. The loop should use `i < arr.length` to avoid accessing the non-existent element at index 5.

## Bug Solution

The solution corrects the loop condition to `i < arr.length`, preventing the `ArrayIndexOutOfBoundsException`.  The solution also includes robust error handling for cases where the array might be null or empty.