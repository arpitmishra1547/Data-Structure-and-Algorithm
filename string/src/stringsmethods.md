# Java String Methods – Complete Cheat Sheet (Markdown)

This document contains **all important Java `String` methods**, grouped by category, with **clear explanations and examples**.  
At the end, you will also find a section on **Most Useful Methods (Top 20)**.

---

## 📌 1. Basic Information Methods

| Method | Description | Example |
|--------|-------------|---------|
| `length()` | Returns number of characters | `"hello".length()` → `5` |
| `isEmpty()` | Returns true if length is 0 | `"".isEmpty()` → `true` |
| `isBlank()` (Java 11+) | Returns true if empty or whitespace only | `"   ".isBlank()` → `true` |
| `charAt(i)` | Returns character at index `i` | `"hello".charAt(1)` → `e` |
| `codePointAt(i)` | Returns Unicode code point at index | `"A".codePointAt(0)` → `65` |

---

## 📌 2. String Comparison Methods

| Method | Description | Example |
|--------|-------------|---------|
| `equals(str)` | Checks exact equality | `"Hi".equals("Hi")` |
| `equalsIgnoreCase(str)` | Ignores case differences | `"hi".equalsIgnoreCase("HI")` |
| `compareTo(str)` | Lexicographical comparison | `"a".compareTo("b") → -1` |
| `compareToIgnoreCase(str)` | Case‑insensitive compare | `"a".compareToIgnoreCase("A")` |
| `contentEquals(str)` | Compares with StringBuffer/StringBuilder | `"abc".contentEquals(new StringBuffer("abc"))` |

---

## 📌 3. Searching / Matching in Strings

| Method | Description | Example |
|--------|-------------|---------|
| `contains(str)` | Checks if substring exists | `"hello".contains("ell")` |
| `startsWith(prefix)` | Checks if string begins with prefix | `"flower".startsWith("flo")` |
| `endsWith(suffix)` | Checks if string ends with suffix | `"hello".endsWith("lo")` |
| `indexOf(str)` | First occurrence of substring | `"banana".indexOf("na") → 2` |
| `lastIndexOf(str)` | Last occurrence of substring | `"banana".lastIndexOf("na") → 4` |
| `indexOf(str, fromIndex)` | Search starting from index | `"banana".indexOf("a", 3) → 3` |
| `matches(regex)` | Checks if entire string matches regex | `"123".matches("\d+") → true` |

---

## 📌 4. Extracting / Cutting Strings

| Method | Description | Example |
|--------|-------------|---------|
| `substring(start)` | From index to end | `"hello".substring(2)` → `"llo"` |
| `substring(start, end)` | Index range | `"hello".substring(1, 4)` → `"ell"` |
| `subSequence()` | Returns CharSequence | `"hello".subSequence(1, 4)` |

---

## 📌 5. String Modification Methods (Return NEW String)

> Java Strings are **immutable**, so these do NOT modify the original string.

| Method | Description | Example |
|--------|-------------|---------|
| `toLowerCase()` | Converts to lowercase | `"Hi".toLowerCase()` |
| `toUpperCase()` | Converts to uppercase | `"hi".toUpperCase()` |
| `trim()` | Removes leading & trailing spaces | `"  hi  ".trim()` → `"hi"` |
| `strip()` (Java 11+) | Unicode‑aware trim | `"  hi  ".strip()` |
| `stripLeading()` | Remove leading whitespace | `"  hi".stripLeading()` |
| `stripTrailing()` | Remove trailing whitespace | `"hi  ".stripTrailing()` |
| `replace(old, new)` | Replace characters | `"a-b-c".replace("-", "+")` |
| `replaceAll(regex, repl)` | Replace all regex matches | `"1a2b".replaceAll("\d", "*")` |
| `replaceFirst(regex, repl)` | Replace first occurrence | `"1a2b".replaceFirst("\d", "*")` |
| `repeat(n)` (Java 11+) | Repeat string | `"ha".repeat(3)` → `"hahaha"` |

---

## 📌 6. Splitting & Joining Strings

| Method | Description | Example |
|--------|-------------|---------|
| `split(regex)` | Splits based on regex | `"a,b,c".split(",")` |
| `split(regex, limit)` | Limit number of parts | `"a,b,c".split(",", 2)` |
| `String.join(delimiter, elements...)` | Joins strings | `String.join("-", "a", "b") → "a-b"` |

---

## 📌 7. Conversion Methods

| Method | Description | Example |
|--------|-------------|---------|
| `toCharArray()` | Converts to array of chars | `"abc".toCharArray()` |
| `getBytes()` | Converts to byte array | `"A".getBytes()` |
| `valueOf(x)` | Converts anything to a string | `String.valueOf(123)` |

---

## 📌 8. String Pool / Memory Methods

| Method | Description | Example |
|--------|-------------|---------|
| `intern()` | Adds string to String Pool | `"hello".intern()` |
| `hashCode()` | Returns hash | `"a".hashCode()` |

---

# ⭐ MOST USEFUL STRING METHODS (Top 20 You Must Know)

These are **used in 90% of Java interview problems**:

### 🔹 Checking & Searching
- `equals()`
- `equalsIgnoreCase()`
- `contains()`
- `startsWith()`
- `endsWith()`
- `indexOf()`
- `lastIndexOf()`

### 🔹 Extracting
- `substring()`
- `charAt()`
- `split()`

### 🔹 Modifying
- `toLowerCase()`
- `toUpperCase()`
- `trim()`
- `replace()`
- `replaceAll()`

### 🔹 Conversion
- `toCharArray()`
- `valueOf()`

### 🔹 Checking Length / Empty
- `length()`
- `isEmpty()`
- `isBlank()`

---

# ✔ If you want, I can also generate:
- A **PDF version** of this markdown
- A **detailed diagram explaining substring/indexing**
- A **set of interview questions based on String methods**

Just tell me!  





| Concept             | Questions       |
| ------------------- | --------------- |
| Two Pointers        | 557, 1662, 1768 |
| Hashing / Frequency | 242, 771        |
| Stack / Parentheses | 1021            |
| Greedy              | 1221, 1903      |
| Parsing             | 1309, 1678      |
| String Build        | 1108, 1528      |
| String Matching     | 14, 796, 1967   |
