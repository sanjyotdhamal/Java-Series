# Operators & Binary Number System ☕

## What are Operators?

Operators are special symbols used to perform operations on variables and values.

Example:
```java
int a = 10;
int b = 5;
System.out.println(a + b); // 15
```

---

# 1. Arithmetic Operators

Used for mathematical calculations.

| Operator | Meaning | Example |
|----------|---------|---------|
| + | Addition | a + b |
| - | Subtraction | a - b |
| * | Multiplication | a * b |
| / | Division | a / b |
| % | Modulus (Remainder) | a % b |

Example:

```java
int a = 10;
int b = 3;

System.out.println(a + b); // 13
System.out.println(a - b); // 7
System.out.println(a * b); // 30
System.out.println(a / b); // 3
System.out.println(a % b); // 1
```

---

# 2. Unary Operators

Unary operators work on a single operand.

## Increment (++)

Increases value by **1**.

### Pre Increment (++a)

Value increases first, then used.

```java
int a = 5;
System.out.println(++a); // 6
```

### Post Increment (a++)

Value is used first, then increases.

```java
int a = 5;
System.out.println(a++); // 5
System.out.println(a);   // 6
```

---

## Decrement (--)

Decreases value by **1**.

### Pre Decrement (--a)

```java
int a = 5;
System.out.println(--a); // 4
```

### Post Decrement (a--)

```java
int a = 5;
System.out.println(a--); // 5
System.out.println(a);   // 4
```

---

# 3. Relational Operators

Used to compare two values.

| Operator | Meaning |
|----------|---------|
| == | Equal to |
| != | Not Equal to |
| > | Greater than |
| < | Less than |
| >= | Greater than or Equal |
| <= | Less than or Equal |

Example:

```java
int a = 10;
int b = 20;

System.out.println(a < b);  // true
System.out.println(a == b); // false
```

---

# 4. Logical Operators

Used to combine multiple conditions.

| Operator | Meaning |
|----------|---------|
| && | AND |
| \|\| | OR |
| ! | NOT |

Example:

```java
int age = 20;

System.out.println(age > 18 && age < 30); // true
System.out.println(age > 25 || age < 30); // true
System.out.println(!(age > 18));          // false
```

---

# Binary Number System

A Binary Number System uses only **two digits**:

```
0 and 1
```

Each binary digit is called a **Bit**.

Example:

| Decimal | Binary |
|---------|--------|
| 0 | 0000 |
| 1 | 0001 |
| 2 | 0010 |
| 3 | 0011 |
| 4 | 0100 |
| 5 | 0101 |
| 6 | 0110 |
| 7 | 0111 |
| 8 | 1000 |

---

# Bitwise Operators

Bitwise operators work on individual bits.

| Operator | Meaning |
|----------|---------|
| & | AND |
| \| | OR |
| ^ | XOR |
| ~ | NOT |
| << | Left Shift |
| >> | Right Shift |

Example:

```java
int a = 5;   // 0101
int b = 3;   // 0011

System.out.println(a & b); // 1
System.out.println(a | b); // 7
System.out.println(a ^ b); // 6
```

---

# Assignment Operators

Used to assign values to variables.

| Operator | Example | Same As |
|----------|---------|---------|
| = | a = 5 | Assign value |
| += | a += 2 | a = a + 2 |
| -= | a -= 2 | a = a - 2 |
| *= | a *= 2 | a = a * 2 |
| /= | a /= 2 | a = a / 2 |
| %= | a %= 2 | a = a % 2 |

Example:

```java
int a = 10;

a += 5; // 15
a -= 3; // 12
a *= 2; // 24
a /= 4; // 6
a %= 4; // 2
```

---

# Quick Revision

✅ Arithmetic Operators → `+ - * / %`

✅ Unary Operators → `++ --`

✅ Relational Operators → `== != > < >= <=`

✅ Logical Operators → `&& || !`

✅ Binary Number System → Uses only `0` and `1`

✅ Bitwise Operators → `& | ^ ~ << >>`

✅ Assignment Operators → `= += -= *= /= %=`

---

## Keep Learning 🚀

Small progress every day leads to big success.

**Happy Coding! ☕**