# 136. Single Number

**Difficulty:** Easy · **Topics:** Array, Bit Manipulation · **Language:** Java

## Problem

Given a non-empty integer array `nums`, every element appears exactly twice except for one element. Return that element.

The solution must run in linear time and use only constant extra space.

### Examples

| `nums` | Output |
| --- | ---: |
| `[2, 2, 1]` | `1` |
| `[4, 1, 2, 1, 2]` | `4` |
| `[1]` | `1` |

### Constraints

- `1 <= nums.length <= 3 * 10^4`
- `-3 * 10^4 <= nums[i] <= 3 * 10^4`
- Every element appears twice except for one element, which appears once.

---

## Approach: XOR

Source: [`XORSolution.java`](./XORSolution.java)

Use XOR to accumulate all values in `nums`. XOR has two useful properties:

- `a ^ a = 0`, so each duplicated pair cancels out.
- `a ^ 0 = a`, so the number that appears once remains.

Start with `result = 0`, then XOR every value into it. Since XOR is associative and commutative, the order of the values does not matter.

```java
result ^= nums[i];
```

For `[2, 2, 1]`, the calculation is `0 ^ 2 ^ 2 ^ 1 = 1`.

| Time | Space | LeetCode runtime | LeetCode memory |
| :---: | :---: | :---: | :---: |
| `O(n)` | `O(1)` | 1 ms | 46.50 MB |

This meets both requirements without using a `HashSet`, `HashMap`, or any other auxiliary collection.

![XOR performance](./imgs/xor_solution.png)

## Key Takeaway

When every value except one occurs exactly twice, XOR eliminates the pairs in one pass and leaves the unique value using constant extra space.
