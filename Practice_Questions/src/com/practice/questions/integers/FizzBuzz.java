package com.practice.questions.integers;

import java.util.*;
/**
Problem description

<p> The {@code FizzBuzz} problem.

<p> Write a program that outputs the String representation of a numbers from
1 to n. But for the multiples of 3 it should print <i>Fizz</> instead of the number
and for the multiples of 5 it should print <i>Buzz</> . For numbers which are multiple
of both three and five print <i>FizzBuzz</> 

*/
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res.add("FizzBuzz");
            } else if (i % 3 == 0) {
                res.add("Fizz");
            } else if (i % 5 == 0) {
                res.add("Buzz");
            } else {
                res.add(Integer.toString(i));
            }
        }
        return res;
    }
}


