# Hashing

## What is Hashing?
Hashing is a technique used to store and retrieve data efficiently by mapping a key to an index using a hash function.

Hash Function:
index = h(key)

Average Time Complexity:
- Search: O(1)
- Insert: O(1)
- Delete: O(1)

---

## Division Method

Hash Function:
h(key) = key % tableSize

Example:
key = 37
tableSize = 10

37 % 10 = 7

Store 37 at index 7.

---

## Collision

A collision occurs when two keys map to the same index.

Example:
15 % 10 = 5
25 % 10 = 5

Both want index 5.

---

## Collision Handling

### 1. Chaining

Store multiple elements at the same index using a linked list.

Example:
Index 5 -> 15 -> 25 -> 35

Pros:
- Simple
- Easy insertion

Cons:
- Extra memory required

---

### 2. Open Addressing

Find another empty slot when a collision occurs.

#### Linear Probing
i is the number of attempts (probe number). Try:

i = 1
(5 + 1) % 10 = 6

If 6 is occupied:
i = 2
(5 + 2) % 10 = 7
Formula:
(h(key) + i) % tableSize

Check next positions one by one.

Pros:
- Simple

Cons:
- Primary clustering

---

#### Quadratic Probing

Formula:
(h(key) + i²) % tableSize

Checks positions using square jumps.

Pros:
- Less clustering than linear probing

Cons:
- More complex

---

#### Double Hashing

Formula:
(h1(key) + i * h2(key)) % tableSize

Uses a second hash function to determine jump size.

Pros:
- Best distribution
- Least clustering

Cons:
- More computation

---

## HashMap in Java

Equivalent to unordered_map in C++.

Declaration:
HashMap<KeyType, ValueType> map = new HashMap<>();

Example:
HashMap<Integer, Integer> freq = new HashMap<>();

Key   -> Array Element
Value -> Frequency Count

Important Methods:
- put(key, value)
- get(key)
- getOrDefault(key, defaultValue)
- containsKey(key)
- remove(key)
- size()
- keySet()
- values()
- entrySet()

Frequency Count:
freq.put(num, freq.getOrDefault(num, 0) + 1);

Note:
Java HashMap internally handles hashing and collisions automatically.