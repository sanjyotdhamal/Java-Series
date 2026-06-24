# 1) Time Complexity

Time complexity tells us how much time an algorithm takes to run depending on the size of input n.
It is used to measure the efficiency of a program.

Example:

If the number of operations increases as input increases, then time complexity also changes.

# 2) Types of Asymptotic Notations
a) Big O Notation – O()
It gives the upper bound of time.
It usually represents the worst case.
Example: O(n), O(n²)
b) Omega Notation – Ω()
It gives the lower bound of time.
It usually represents the best case.
c) Theta Notation – Θ()
It gives the average case or exact bound.

# 3) Example of Linear Time Complexity O(n)
int a = 0;
for(int i = 1; i <= n; i++) {
    a = a + 1;
}
Explanation:
Loop runs n times
So total work also depends on n
Therefore, Time Complexity = O(n)

# 4) Order of Time Complexities

From slower / larger complexity to better / smaller complexity:

O(n³) > O(n²) > O(n log n) > O(n) > O(log n) > O(1)
Note:

Less time complexity means better performance.

# 5) Space Complexity

Space complexity tells us how much memory a program uses while running.

It depends on:

variables used
arrays used
extra memory used by program
Example:
int a;
int takes 4 bytes of memory.

So, space complexity means the memory occupied by a program.

# 6) Summary
Time Complexity → measures running time
Space Complexity → measures memory used
Important notations:
O() → worst case
Ω() → best case
Θ() → average case

