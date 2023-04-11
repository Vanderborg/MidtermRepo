package string.problems;

import org.junit.Assert;
import org.junit.Test;
import string.problems.Permutation;
import org.junit.ComparisonFailure;

import static org.junit.Assert.assertTrue;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        testIsAnagram_valid();
    }
     @Test
     public static void testIsAnagram_valid() {
     assertTrue(Anagram.isAnagram("elbow","below"));
    }


        }






