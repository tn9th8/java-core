# Java core

## What next ?
- Collections: Lists, ArrayLists, Maps, Stacks, Queues
- Stream API
- Function programming Lambda
- Spring boots

## Core

### Package
- Tương tự như folder
- Chứa các classes / interfaces / sub-packages
- Truy cập package: `public` và `import`

### Types

> Primitive data type <br>
> So sánh: `==`
- `byte`, `short`, `int`, `long`
- `float`, `double`
- `boolean`
- `char`

> Non-primitive / Reference data type <br>
> So sánh: `.equal()` <br>
> Refernce: https://stackoverflow.com/questions/29284402/why-do-reference-data-types-point
- `String`
- `Array`
- `Class`, `Interface`

> Auto boxing/Unboxing <br>
> <table>
> <thead>
> <th>Primitive</th>
> <th>Convert to Reference</th>
> </thead>
> <tbody>
> <tr>
> <td>boolean</td>
> <td>Boolean</td>
> </tr>
> <tr>
> <td>byte, short</td>
> <td>Byte, Short</td>
> </tr>
> <tr>
> <td>int, long</td>
> <td>Integer, Long</td>
> </tr>
> <tr>
> <td>float, double</td>
> <td>Float, Double</td>
> </tr>
> <tr>
> <td>char</td>
> <td>Character</td>
> </tr>
> </tbody>
> </table>

<br>

```java
// auto boxing
Integer object = new Integer(1);
// unboxing
int val = object.intValue();

// Với ArrayList, nó sẽ chữa các objects.
// Tuy nhiên input là các primitive variables.
// Compiler tự động boxing nên gọi là auto boxing.
```

### Variables

```java
// input values:
Scanner scanner = new Scanner(System.in);

String name = scanner.nextLine();
int age = scanner.nextInt();
float gpa = scanner.nextFloat();

scanner.close();
```

<br>

```java
// output values:
System.out.println(name + " is " + age + " years old and has a gpa of " + gpa);

//in ra kết quả có định dạng: print format
System.out.printf( );
// %d: số nguyên
// %f: số thực, mặc định là 6 số lẻ
// %.3f định dạng 3 số lẻ
// %s: chuỗi
```

### Operators

### Conditions

```java
if (expression) {
    // TO DO
} else {
    // TO DO
}
```

<br>

```java
switch (expression) {
    case x:
        // CODE BLOCK
        break;
    case y:
        // CODE BLOCK
        break;
    default:
        // CODE BLOCK
}
```

### Loops

```java
// for
for ( ; ; ) {

}

// while
while () {

}

// do while
do {

} while ();

// exit, skip
break;
continue;
```

### Arrays

```java
String[] array1 = { "ab", "bc", "cd" };
String[] array2 = new String[3];

int len = Array.length(array1);
String content = Array.toString(array2);
Array.sort(array2);
```

## OOP

### Class
> object
- `object`
- `class`
- `attribute`
- `method`
- `constructor`
- `overloading`

> Access modifier
- `private`
- `public`
- `protected` :
    - con thừa kế đặc điểm của cha
> Others:
- `final` : 
    - không thể ghi đè, tương tự `const`
- `static` :
    - method thuộc về Class, không phụ thuộc vào đối tượng
    - gọi trực tiếp thông qua tên lớp

### Encapsulation
> Tính đóng gói
- `getter`
- `setter`

### Inheritance
> Tính thừa kế
- `extends`
- `super( );` : gọi constructor của parents
- `super.` : gọi method của parents => phân biệt với `this.`
- `override` : ghi đè method của parents (cùng tên method, cùng parameter) => phân biệt với `overloading`

> abstract class <br>
> Reference: https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
- `abstract method` : không có body, mặc định `public`
- `extends`
- đơn kế thừa

> interface
- `method` : không cớ body, mặc định `public abstract`
- `implements`
- không tạo constructor
- đa kế thừa
- `default`, `static` method (java v8)

> default, static method <br>
> Reference: https://www.baeldung.com/java-static-default-methods <br>
> Reference: https://docs.oracle.com/javase/tutorial/java/IandI/defaultmethods.html
- `default` method:
    - method có body tại interface
    - các classes không cần thực thi, tự động có sẳn
- `static` method:
    - method thuộc về Class, không phụ thuộc vào đối tượng
    - gọi trực tiếp thông qua tên lớp

> Multiple Interface Inheritence <br>
> Reference: https://stackoverflow.com/questions/2801878/implementing-two-interfaces-in-a-class-with-same-method-which-interface-method

> `abstract` và `interface` <br>
> Reference: https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
- `abstract class`
    - các classes có mối quan hệ gần gủi
    - access modifiers other than `public` (such as `protected`, `private`)
    - khai báo thuộc tính `non-static`, `non-final`
- `interface`
    - các classes thì unrelated
    - chỉ định hành vi, không quan tâm ai implements
    - tận dụng multiple inheritance

### Polymorphism
> Reference: https://www.javatpoint.com/runtime-polymorphism-in-java <br>
> Reference: https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html
- poly + morphism : many + form
- behind the screen: `upcasting` and `downcasting`

```java
public class Animal { }
public class Dog extends Animal { }
public class Cat extends Animal { }

Animal animal1 = new Dog();
Animal animal2 = new Cat();
```

## Advanced

### Generic (basic)
> Java v5 <br>
> Reference: https://docs.oracle.com/javase/tutorial/java/generics/index.html <br>
> Mục đích: Tái sử dụng code, test, check type

```java
// The following code snippet without generics requires casting:
List list = new ArrayList();
list.add("hello");
String s = (String) list.get(0);

// When re-written to use generics, the code does not require casting:
List<String> list = new ArrayList<String>();
list.add("hello");
String s = list.get(0); // no cast
```

### ArrayList
> ArrayList ra đời để khắc phục nhược điểm giới hạn phần từ, flexible (thêm/xóa phần tử...)
```java
// không khai báo type => không nên
ArrayList arr1 = new ArrayList();

// khai báo type
ArrayList<String> arr2 = new ArrayList<String>();

// rút gọn => java diamond: compiler đoán type
ArrayList<String> arr3 = new ArrayList<>();
ArrayList<String> arr3 = new ArrayList();

// method
arr3.get(0);
arr3.add(item); // thêm vào cuối
arr3.delete(0);
arr3.clear(); // xóa tất cả
```

### String
> `char` ký tự đơn lẻ <br>
> `String` chuỗi ký tự, là 1 Class

```java
// Kí tự đặc biệt
// \n
// \t
// \\: \
// \": "
// \r: Về đầu dòng

// Method
string.length();
string.trim(); // bỏ spaces đầu, cuối chuỗi
string.toLowerCase(); // viết thường tất cả
string.toUpperCase(); // viết hoa tất cả
string.substring(); // cắt chuỗi
```

### Regular Expression

> https://www.w3schools.com/java/java_regex.asp <br>
> https://regexone.com/ <br>
> Mục đích: search / replace text <br>
> Ví dụ về RegEx: "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$"

> Java hỗ trợ các gói để xử lý Regex:
> - Pattern Class
> - Matcher Class
> - PatternSyntaxException Class

### Exception

> try-catch-finally <br>
> Reference: https://docs.oracle.com/javase/tutorial/essential/exceptions/definition.html

```java
try {
    // TO DO
} catch(ArithmeticException e) {
    // TO DO
} catch(IOException e) {
    // TO DO
} finally {
    // TO DO
}
```

> try-with-resources <br>
> Từ java v7, thay vì dùng `finally`, ta có thể dùng trực tiếp với `try()` <br>
> Giúp ta close resources  <br>
> The try-with-resources statement is a try statement that declares one or more resources. A resource is an object that must be closed after the program is finished with it. The try-with-resources statement ensures that each resource is closed at the end of the statement.
> Reference: https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html

```java
// clean code
static String readFirstLineFromFile(String path) throws IOException {
	try (
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr)
    ) {
        return br.readLine();
    }
}

// should not
static String readFirstLineFromFileWithFinallyBlock(String path) throws IOException {
    FileReader fr = new FileReader(path);
    BufferedReader br = new BufferedReader(fr);
    try {
        return br.readLine();
    } finally {
        br.close();
        fr.close();
    }
}
```

### I/O Stream
> Reference: https://docs.oracle.com/javase/tutorial/essential/io/streams.html

> Nguyên tắc: máy tính chỉ hiểu dữ liệu 0, 1

> input for human ==> 0, 1 ==> output for human

> Stream (dòng chảy) chia data thành các chunk (đoạn) để truyển đi <br>
> Ưu điểm: tiết kiệm memory, cpu <br>
> Nhược điểm: read, write nhiều lần

> Phân loại stream: <br>
> Reference: https://stackoverflow.com/questions/3013996/byte-stream-and-character-stream
> - Byte stream
> - Character stream
> - Buffer stream <br>

> Path <br>
> Reference: https://docs.oracle.com/javase/tutorial/essential/io/path.html
- Relative path:
    - `./`
    - `../`
- Absolute path

> `Path` class/ object
- Trong java, đôi khi ta không thể truyển vào path string
- Mà phải truyền vào 1 path object

### Thread
> Reference: https://docs.oracle.com/javase/tutorial/essential/concurrency/procthread.html
- Applications
- Tasks
- Processes
```java
// Để chạy 1 applications, cần 1 (hoặc nhiều) processes.

// Đặc điểm: Mỗi process "có không gian riêng" để chạy => không chia sẻ memory

// Ví dụ với Google Chrome
// 1 tab = 1 process . Kill 1 process với Task manager => kill tab
```
- Threads
```java
// 1 Process cần ít nhất là 1 thread (main thread)
// => process chứa (bao gồm) thread

// Đặc điểm: Các thread chia sẻ nguồn tài nguyên

// Hiểu đơn giản:
// - Thread là đơn vị nhỏ nhất để thực thi code
// - Thread giúp thực hiện các "nhiệm vụ" của chương trình, ví dụ: in ra màn hình, xuất file...

// - Multi-thread là cách thực thi nhiều thread song song
```

### Lambda

> Introduced from Java version 8

```java
(parameters) -> { expression block };
```

Funtional Interface

> Lambda Expression is only used with Funtional Interface. <br>
Funtional Interface is defined that a interface only have a abstract method. <br>
Abstract method is only declared, doesn't have body.

```java
@FunctionalInterface
public interface NumberFunction {
	int compute(int num1, int num2);
}
```

Lambda Expression

> Lambda đơn giản hóa việc triển khai của function interface. <br>
Thay vì phải tạo a implementation class, chỉ cần khai báo cách triển khai phương thức của function interface

```java
// don't use lambda
public class Sum implements IFNumber {
    @Override
    int compute(int num1, int numb2) {
        return num1 + num2;
    }
}

IFNumber sumObj = new Sum();

int result = sumObj.compute(1, 2);

// use lambda
IFNumber sumFunc = (num1, num2) -> {
	return num1 + num2;
};

int result = sumFunc.compute(1, 2);

// shorthand
NumberFunction toMinus = (num1, num2) -> num1 - num2;

int result = sumFunc.compute(1, 2);
```

