# Array Equality Test with JUnit

This project demonstrates how to perform unit testing for array equality using the JUnit `assertArrayEquals` method.

## Questions Answered:

1. **What does `assertArrayEquals` do?**
   - It checks if two arrays are equal in terms of length and the values at the same indices.

2. **What happens if the arrays are not equal?**
   - The test will fail and JUnit provides a detailed message where the arrays differ.

3. **How does it handle multi-dimensional arrays?**
   - It compares each inner array individually recursively ensuring all elements match.
