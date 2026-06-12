Recursion Notes
What is Recursion?

A function calling itself to solve a smaller version of the same problem.

void print(int n){
    if(n == 0) return;   // Base Case

    System.out.println(n);
    print(n-1);          // Recursive Call
}
Components of Recursion
1. Base Case

Condition that stops recursion.

if(n == 0)
    return;

Without a base case, recursion continues indefinitely and causes:

StackOverflowError
2. Recursive Call
print(n-1);

The problem size must move toward the base case.

Recursive Tree Thinking

Example:

print(3)

Calls:

print(3)
  |
print(2)
  |
print(1)
  |
print(0)

Then returns back up the stack.

Recursion Stack Space

For:

print(n);
Time Complexity: O(n)
Space Complexity: O(n)

Reason:
Each function call waits in the call stack.

Parameterized Recursion

Answer carried in parameters.

Sum of first N numbers
void sum(int i, int sum){
    if(i < 1){
        System.out.println(sum);
        return;
    }

    sum(i-1, sum+i);
}
Functional Recursion

Function returns a value.

int sum(int n){
    if(n == 0)
        return 0;

    return n + sum(n-1);
}
Factorial
int fact(int n){
    if(n == 0)
        return 1;

    return n * fact(n-1);
}

Example:

fact(4)
= 4 * fact(3)
= 4 * 3 * fact(2)
= 4 * 3 * 2 * fact(1)
= 24
Reverse Array Using Recursion

Pattern:

swap(i, n-i-1)
i++

Base Case:

if(i >= n/2)
    return;
Palindrome Using Recursion

Pattern:

boolean palindrome(String s, int i){
    if(i >= s.length()/2)
        return true;

    if(s.charAt(i) != s.charAt(s.length()-i-1))
        return false;

    return palindrome(s, i+1);
}

Idea:

Compare first and last character
Move inward
Fibonacci
int fib(int n){
    if(n <= 1)
        return n;

    return fib(n-1) + fib(n-2);
}

⚠️ Time Complexity:

O(2^n)

Very inefficient.

Common Mistakes
Missing Base Case
void fun(int n){
    fun(n-1);
}

Results:

StackOverflowError
Not Moving Toward Base Case

Wrong:

fun(n);

Correct:

fun(n-1);
Forgetting Return

Wrong:

int sum(int n){
    sum(n-1);
}

Correct:

return n + sum(n-1);
Recursion Checklist

Before writing any recursion:

What is the base case?
What is the smaller subproblem?
How does the recursive call move toward the base case?
What should be returned after the recursive call?
What is the time complexity?
What is the recursion stack space?
