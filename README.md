# Towards-Java

Java practice programs, written as coursework during my BS Software
Engineering at COMSATS University Abbottabad. The file names carry the
lesson number (for example `CWH_54` = lesson 54), and each file is a
small, self-contained program — mostly one `main` method per file, some
with a helper class.

## Program index

### Basics and input/output

| File | What it does |
| ---- | ------------ |
| `SumOfThreeNumber.java` | Adds three hard-coded numbers and prints the sum. |
| `CWH_QUESTION.java` | Reads user input with `Scanner` and checks it with `hasNextInt()`. |
| `Cwh_grade_Casting.java` | Char arithmetic: shifts a grade by 8 and back, showing casting. |
| `cwh_grater_number.java` | String variables, plus a commented-out range check (number between 60 and 888). |
| `cwh_15video_prt.java` | String practice: case changes, `replace`, `indexOf`, and a letter template. |
| `Cwh_Question_03.java` | Reads Physics, English, Chemistry and Biology marks and prints the total. |
| `cw_19_pct_2.java` | Percentage of three subjects, with a pass/promoted or fail message. |
| `cwh_17_operation.java` | Boolean `AND`/`OR` operations and conditions. |

### Conditionals

| File | What it does |
| ---- | ------------ |
| `Cwh_16_if_else.java` | `if`/`else` age check (18 and over). |
| `cw_18_else_if_loader.java` | `switch` on an entered age. |

### Loops

| File | What it does |
| ---- | ------------ |
| `cwh_20_Loops_while.java` | `while` loop counting. |
| `cwh_21_do_while_loop.java` | `while` and `do`–`while` loops. |
| `cwh_22_For_loop.java` | `for` loop counting up and counting down. |
| `cwh_23_Break_cont.java` | `break` and `continue` inside a loop. |
| `cwh_24_practice.java` | Loop practice: star patterns, counting, and a factorial. |
| `cwh_25_every_table.java` | Multiplication table for a number entered by the user. |

### Arrays

| File | What it does |
| ---- | ------------ |
| `cwh_26_array.java` | Declaring and filling an array of marks. |
| `cwh_27_Array_For_each_loop.java` | Reading an array with a for-each loop. |
| `cwh_28_multi_dim_array.java` | Two-dimensional array (a flats layout). |
| `cwh_29_practice.java` | Array practice: sums and searches over mark arrays. |

### Methods

| File | What it does |
| ---- | ------------ |
| `cwh_30_methods.java` | A `logic` method that branches on its two inputs. |
| `cwh_31_Method_overlo.java` | Method overloading: three `foo` variants. |
| `cwh_32_varargs.java` | Variable arguments: `sum` over any number of ints. |
| `cwh_33_recursion.java` | Factorial, recursive and iterative versions side by side. |
| `cwh_35_practice.java` | Practice methods: Celsius conversion and star patterns. |

### Classes and objects

| File | What it does |
| ---- | ------------ |
| `cwh_38_custom_class.java` | A custom `employe` class with id, salary and name. |
| `cwh_40_getter_setter.java` | Getters and setters with private fields (`MyEmployee`). |
| `cwh_41_rock_paper_game.java` | Rock–paper–scissors against the computer (`Random` + `Scanner`). |
| `cwh_42_Constructor.java` | Constructors, including an overloaded one. |
| `cwh_43_practice.java` | A `Sphere` class: surface area and volume. |
| `cwh_44_practice.java` | A `Cylinder` class and a `Rectangle` class. |
| `cwh_46_this_and_Super.java` | `this` and `super` in a class hierarchy. |

### Inheritance, interfaces and polymorphism

| File | What it does |
| ---- | ------------ |
| `cwh_48_method_overloading.java` | Method overriding: class `B` overrides `A.math2()`. |
| `cwh_49_Dynamic.java` | Dynamic method dispatch: a `Phone` reference to a `smartPhone`. |
| `cwh_53_Abstract.java` | Abstract class `Parent2` with abstract `greet` methods. |
| `CWH_54_Interfaces.java` | Interfaces `Bicycle` and `HornBicycle`, implemented by `SoraabCycle`. |
| `CWH_56_Interface1.java` | Interfaces with `default` and `private` methods (`MyCamera`, `MyWifi`). |
| `cwh_58_Inhertance_interferance.java` | Interface inheritance: `childSampleInterface extends sampleInterface`. |
| `CWH_59_Polymorphism.java` | Polymorphism through camera/wifi interfaces and a phone class. |
| `CWH_60_Practice.java` | Abstract `Pen` class, implemented by `PainoPen`. |

## How to run

You need a JDK installed. Compile and run one file at a time, using the
file's class name:

```bash
javac Cwh_16_if_else.java
java Cwh_16_if_else
```

Programs that read input (for example the marks, percentage and table
programs) prompt on the console — type the numbers when asked.
