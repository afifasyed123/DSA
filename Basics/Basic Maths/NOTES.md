# Basic Maths Notes (Java DSA)

## 1. Count Digits

### Logic

Keep dividing the number by 10 until it becomes 0.

### Example

n = 12345

12345 → 1234 → 123 → 12 → 1 → 0

Count = 5

### Code Pattern

```java
int count = 0;

while(n > 0){
    count++;
    n /= 10;
}
```

### Time Complexity

O(log10 n)

 

## 2. Reverse Number

### Logic

Extract last digit and build reversed number.

### Example

1234

rev = 0

rev = 4
rev = 43
rev = 432
rev = 4321

### Code Pattern

```java
int rev = 0;

while(n > 0){
    int digit = n % 10;
    rev = rev * 10 + digit;
    n /= 10;
}
```

### Time Complexity

O(log10 n) --> log n

---

## 3. Palindrome Number

### Logic

A number is palindrome if it remains same after reversing.

### Example

121 → Reverse = 121 ✔

123 → Reverse = 321 ✘

### Code Pattern

```java
int original = n;
int rev = 0;

while(n > 0){
    int digit = n % 10;
    rev = rev * 10 + digit;
    n /= 10;
}

if(original == rev)
    System.out.println("Palindrome");
```

### Time Complexity

O(log10 n)

---

## 4. Armstrong Number

### Definition

Sum of digits raised to power of number of digits equals original number.

### Example

153

1³ + 5³ + 3³

= 1 + 125 + 27

= 153 ✔

### Code Pattern

```java
int original = n;
int digits = String.valueOf(n).length();

int sum = 0;

while(n > 0){
    int digit = n % 10;
    sum += Math.pow(digit, digits);
    n /= 10;
}

if(sum == original)
    System.out.println("Armstrong");
```

### Time Complexity

O(log10 n)

---

## 5. Prime Number

### Definition

A number having exactly 2 factors:
1 and itself.

### Optimized Logic

Check divisibility till √n.

### Code Pattern

```java
boolean isPrime = true;

for(int i = 2; i <= Math.sqrt(n); i++){
    if(n % i == 0){
        isPrime = false;
        break;
    }
}
```

### Time Complexity

O(√n)

---

## 6. Print All Divisors

### Logic

Divisors come in pairs.

Example:

36

1 × 36

2 × 18

3 × 12

4 × 9

6 × 6

Only iterate till √n.

### Code Pattern

```java
ArrayList<Integer> list = new ArrayList<>();

for(int i = 1; i <= Math.sqrt(n); i++){
    if(n % i == 0){
        list.add(i);

        if(i != n / i)
            list.add(n / i);
    }
}

Collections.sort(list);
```

### Time Complexity

O(√n)

---

## 7. GCD / HCF

### Definition

Largest number dividing both numbers.

Example:

GCD(12,18) = 6

### Euclidean Algorithm

GCD(a,b) = GCD(b,a%b)

Repeat until b becomes 0.

### Code Pattern

```java
static int gcd(int a, int b){

    while(b != 0){
        int temp = b;
        b = a % b;
        a = temp;
    }

    return a;
}
```

### Time Complexity

O(log(min(a,b)))

---

# Quick Revision Table

| Problem        | Key Logic               | Complexity |
| -------------- | ----------------------- | ---------- |
| Count Digits   | Divide by 10            | O(log n)   |
| Reverse Number | Extract digit using %10 | O(log n)   |
| Palindrome     | Reverse and compare     | O(log n)   |
| Armstrong      | Sum of digit^count      | O(log n)   |
| Prime          | Check till √n           | O(√n)      |
| Divisors       | Divisor pairs till √n   | O(√n)      |
| GCD/HCF        | Euclidean Algorithm     | O(log n)   |

# Important Formulas

Count Last Digit:
digit = n % 10

Remove Last Digit:
n = n / 10

GCD:
gcd(a,b) = gcd(b,a%b)

LCM:
LCM = (a*b)/GCD

Prime Check:
Iterate till √n

Divisor Check:
If n%i==0 then both i and n/i are divisors.
