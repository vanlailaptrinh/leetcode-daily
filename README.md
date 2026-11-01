# 🔥 leetcode-daily

> **Now or never.** My daily LeetCode & DSA journal.

One problem a day. No excuses. This repo is where I keep my solutions and notes while building real problem-solving muscle: data structures, algorithms, and the patterns behind them.

![Status](https://img.shields.io/badge/status-in%20progress-brightgreen)
![Language](https://img.shields.io/badge/language-Java-orange)

---

## Goals

- Solve **at least 1 problem every day**
- Understand the *pattern*, not just memorize the answer
- Compare multiple approaches (brute force vs. optimized) and measure the difference
- Revisit hard problems after a few days to check retention

## Repository Structure

```
leetcode-daily/
├── README.md                      # This file
├── 01_Arrays/                     # Topic: Array
│   ├── 1. Two Sum/              # One folder per problem: [ID]_[Name]
│   │   ├── README.md              # Detailed explanation and performance comparison
│   │   ├── BruteForce.java        # Approach 1: brute force, O(n^2)
│   │   ├── HashMapSolution.java   # Approach 2: optimized, O(n)
│   │   └── img/                   # Screenshots (runtime, memory)
│   │       ├── brute_force.png
│   │       └── hashmap_solution.png
│   └── 217.Contains Duplicate/
│       ├── README.md
│       └── HashSetSolution.java
├── 02_Two_Pointers/               # Topic: Two Pointers
│   └── 26. Remove Duplicates/
└── 03_Sliding_Window/             # More topics coming
```

### Conventions

- **Topic folders** are numbered and grouped by technique: `NN_Topic_Name`.
- **Problem folders** follow the LeetCode number: `[ID]_[Problem_Name]`.
- Each problem has its own `README.md` covering the approach, time/space complexity, and lessons learned.
- When a problem has more than one approach, each one gets its own file (`BruteForce.java`, `HashMapSolution.java`, ...).
- Performance screenshots go in the problem's `img/` folder.

## How I Work

1. Read the problem and try to solve it **without hints** (time-boxed).
2. If stuck, think about which pattern fits before looking at any solution.
3. Write the solution, then test edge cases.
4. If possible, write a second, better approach and compare the two.
5. Write the problem's `README.md`, then commit with a message like `solve: 0001 two sum`.

## Feedback

Found a bug or have a cleaner approach? Feel free to open an issue or PR. I'm here to learn.

---

⭐ If this repo helps you stay consistent too, consider giving it a star. Let's keep the streak alive.