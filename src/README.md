### Ownership model
- Objects are "owned" by the scope they are created in
- All assignment operations are "destructive-moves" on objects
- Objects can be "moved" into a scope
- References to objects can be passed around, but they are not "owned" by the reference


### Data types
- All types are immutable/const by default
- Type inference always used for local variables
- Types needed for function parameters and return values


### Constraints
- Type constraints -> types can be constrained by a set of constraints
- Constrain super-types -> type must be a subclass of a specific type
- Constrain members (attributes, methods, typedefs) -> type must have a specific member
- Constrain type -> type must fit through a (lambda) function


### Enums
- Enumerations -> a set of named constants
- Enumeration values can have a value or varying types (Haskell data constructors)


### Guards
- Value constraints -> values can be constrained by a set of constraints
- Constrain the value with expressions
- Constrain the value with a function -> value must fit through a (lambda) function


### Generics
- Generic functions -> functions can take generic types as type parameters
- Generic classes -> classes can take generic types as type parameters
- Generic methods -> methods can take generic types as type parameters
- Generic constraints -> generic types can be constrained to a specific type
- Generic type inference -> generic types can be inferred from the type of the arguments


### Variadics
- Variadic functions -> functions can take a variable number of arguments
- Variadic generics -> generics can take a variable number of arguments
- Variadic types (tuple) -> type can be a collection of types
- Variadic function calls
- `function f<T>(T...)` => all types same
- `function f<T...>(T...)` => all types can be different


### Class model
- Class can be static, abstract, final or normal
- Static class -> all methods are static (like a namespace)
- Abstract class -> cannot be instantiated, but can be inherited from, all methods are abstract
- Final class -> cannot be inherited from, all methods are final


### Method model
- Methods can be static, class, abstract, virtual, final or normal
- Static method -> can be called without an instance of the class
- Class method -> can be called on an instance of the class
- Abstract method -> must be implemented by a subclass
- Virtual method -> can be overridden by a subclass
- Final method -> cannot be overridden by a subclass
- Overloading -> methods can be overloaded by having different parameter types


### Functions
- Closures -> lambda functions inherit the scope of the function they are defined in
- Partial functions -> functions can be partially applied by passing placeholders
- Pipe operator to chain functions -> `std::filter(std::is_prime, m)` -> `m |> std::filter(std::is_prime)`


### Comprehensions
- List comprehension -> `std::list<int> l = [x * 2 for x in range(10)]`


### Operator overloading
- Binary operators
- Unary operators (prefix)
- Postfix operators


### Expressions
- Assignment operators -> `=` `+=` `-=` `*=` `/=` `%=` `**=` `&=` `|=` `^=` `<<=` `>>=` `<<<=` `>>>=` `||=` `&&=` `?=`
- Other operators -> `...`

| Ternary Operator | Description                                                         |
|------------------|---------------------------------------------------------------------|
| `?:`             | Ternary operator - Construct inline if statement with optional else |

| Binary Operator | Description                                                                 |
|-----------------|-----------------------------------------------------------------------------|
| `??`            | Null coalescing - Return left expression if not null, else right            |
| `?:`            | Elvis operator - Return right expression if not null, else left             |
| `&&`            | Logical AND - Logical AND of two expressions                                |
| `&#124;&#124;`  | Logical OR - Logical OR of two expressions                                  |
| `=`             | Assignment - Assign right expression to left expression                     |
| `==`            | Equality - Check if two expressions are equal                               |
| `!=`            | Inequality - Check if two expressions are not equal                         |
| `<`             | Less than - Check if left expression is less than right expression          |
| `>`             | Greater than - Check if left expression is greater than right               |
| `<=`            | Less than or equal - Check if left expression is less than or equal         |
| `>=`            | Greater than or equal - Check if left expression is greater than or         |
| `+`             | Addition - Add two expressions                                              |
| `-`             | Subtraction - Subtract two expressions                                      |
| `*`             | Multiplication - Multiply two expressions                                   |
| `/`             | Division - Divide two expressions                                           |
| `%`             | Modulo - Modulo of two expressions                                          |
| `**`            | Exponentiation - Exponentiate two expressions                               |
| `//`            | Integer division - Divide two expressions                                   |
| `&`             | Bitwise AND - Bitwise AND of two expressions                                |
| `&#124;`        | Bitwise OR - Bitwise OR of two expressions                                  |
| `^`             | Bitwise XOR - Bitwise XOR of two expressions                                |
| `<<`            | Bitwise left shift - Bitwise left shift of two expressions                  |
| `>>`            | Bitwise right shift - Bitwise right shift of two expressions                |
| `<<<`           | Bitwise left rotate - Bitwise left rotate of two expressions                |
| `>>>`           | Bitwise right rotate - Bitwise right rotate of two expressions              |
| `&#124>;`       | Pipe function operator - Pipe the left expression into the right expression |

| Unary Operator | Description                                      |
|----------------|--------------------------------------------------|
| `~`            | Bitwise NOT - Bitwise NOT of an expression       |
| `!`            | Logical NOT - Logical NOT of an expression       |
| `&`            | Reference to - Take a reference to owning object |
| `+`            | Absolute - Take the absolute value               |
| `-`            | Negate - Negate the current value                |

| Postfix Operator | Description                                                 |
|------------------|-------------------------------------------------------------|
| `()`             | Function call - Call a function with the given arguments    |
| `[]`             | Index - Index into a collection with the given index        |
| `.`              | Member access - Access a member of an object                |
| `?.`             | Safe member access - Access a member of an optional object  |
| `->`             | Alternate member access - Access another part of the object |
| `~>`             | Alternate member access - Access another part of the object |
| `++`             | Increment - Increment the value by one                      |
| `--`             | Decrement - Decrement the value by one                      |


### Basic type constructors

| Type             | Construction                                        |
|------------------|-----------------------------------------------------|
| `bool`           | `False`, `True`                                     |
| `int`            | `-1.0e+308+64.7i`                                   |
| `string<C>`      | `"Hello, world!"`                                   |
| `char`           | `'a'`                                               |
| `list<T>`        | `[1, 2, 3]`, `[0..1]`                               |
| `tuple<T...>`    | `(1, 2, 3)`                                         |
| `map<K, V>`      | `{1: 2, 3: 4}`                                      |
| `set<T>`         | `{1, 2, 3}`                                         |
| `regex`          | `r"abc"`                                            |
| `lambda`         | `(x) -> x + 1`                                      |
| `any`            | `std.any(1)`                                        |
| `optional<T>`    | `std.some(1)`, `std.none<T>()`, `?expression()`     |
| `expected<T, E>` | `std.ok(1)`, `std.err<T>("error")`, `!expression()` |
| `variant<T...>`  | `std.variant<T...>(1)`                              |
---

## Keywords
### Program structure
- `module` Define a module to take part in the build; this is required so that the build system knows which files to 
  use  hen generating the module tree. If a file contains errors but is still referenced by other modules, then mark 
  the file as `ignored`, so the contents aren't compiled, but the file still exists in the module tree.


- `import` Import (parts of) a file into the current scope from another module. This is used to allow a module to 
  use other modules for type-hints and object creation. The module system automatically knows if an item only needs 
  to be imported for its type, or if the actual class information is needed, and adjusts it so. This combined with 
  late-as-possible loading allows most circular dependencies to be mitigated, whilst not requiring a separate header 
  file. Everything (that is exported) can be imported with the `*`


- `export` - Export a symbol / multiple symbols from the current scope, so that they can be imported into other 
  modules. This gives more control on what is shared between modules, as well as de-cluttering the module namespace. 
  Every type can be exported using the `*`. It should be noted that imports are not exportable, so every module 
  required must be explicitly imported by the module using it.


### Other constructs

- `enum` - Define an enumeration. An enumeration contains a list of members that can have a value assigned to them 
  using the assignment operator. The enumeration values are constant (ie their value cannot be changed), such that 
  they do not act like Haskell data constructors. Their values can be combinations of other enum values, allowing 
  flag-like behaviour. Further to this, they can import other enums, essentially copying their members into a new type.

  
- `constraint` - Define a type constraint. A constraint is similar to a C++ concept or a Haskell type-class - it 
  allows for a type to be constrained by a number of ways: super-classes, existing members and applicability. 
  Constraints must be defined as a block and not inline. They must be defined with at least 1 template argument, 
  which represents the type being checked. Constraints can inherit other constraints to use their type-checks too.


- `!<guard>` - Define a value constraint. A guard is similar to a C++ contract or Haskell pattern-matching - it 
  allows for a value to be constrained by any expression (not statement), allowing for value-based overloads. 
  Multiple expressions can be given using comma separation. Given guards are simple expressions, they are defined 
  inline, with no block-definition equivalent available.


### Classes

- `class` - Define a class. A class is defined with a name and possible subclasses, and can be generic - that is, 
  have type arguments that are either implicitly defined via a constructor, or explicitly passed with `<...>`. These 
  generic types are also inherited into the methods (like C++, unlike Java). Classes contain constructors, 
  destructors, methods, operator definitions, attributes, typedefs and friend definitions. Classes can be decorated.


- `function` - Define a function. A function contains a name, generic definition, parameters, a return type and 
  possible guards. It should be noted that functions aren't allowed in the global scope, but are to be defined as 
  methods in a class scope. Functions can be overloaded by type-constraints (parameter types), or value constraints 
  (guards). Overloads are sorted by most-complex first, then top-down. The const-ness of a function on a class is 
  enforced through the mutability of the `self` argument. Functions can be decorated.


- `constructor` - Define a constructor for a class - it is the same as defining a function, just with a fixed name 
  `constructor`. Multiple constructors can be defined per class.


- `destructor` - Define a destructor for a class - it is the same as defining a function, just with a fixed name
  `destructir`. Multiple destructor can be defined per class.
  

- `operator` - Define an operator. An operator overload can overload any binary, unary (prefix) or postfix operator 
  on a class. Again these can have multiple overloads, and are inherited into sub-classes, unless defined as private.
  Operators are defined using the `@classmethod` decorator, so that their sub-classes return their own type.


- `inherit` - Inherit from another type. Classes, constraints and enums can use the `inherit` keyword to inherit 
  multiple other types into the current definition. Only the same type of thing can be inherited, for example a 
  class can't inherit an enum. The compiler automatically handles the "diamond problem" through "base-class-fusing", 
  so multiple inheritance doesn't affect the underlying super-classes.


### Variables / Attributes

- `ACCESS_MODIFIERS` - Constrain access to an item. This can be attributed to an attribute or method inside a class. 
  For things like classes, enums and constraints, access modifiers aren't required, as they can just be chosen to 
  not be exported out of the module. Enums can have access-modified members however. `public` allows anything to 
  access the item, `protected` allows the class and sub-classes to access the item, and `private` allows only the 
  class to access the item. There is also the lesser-used `packaged`, indicating only sibling and children modules 
  can access the item - file based rather than inheritance based.


- `friend` - Define a friend. This is used to allow certain classes / functions to access otherwise inaccessible 
  members from the type.

  
- `let` - Define a local-scoped variable. This creates the variable with the given name, and the type of local 
  variable is always required but never specified - the right-hand side must be given. For example, if the type is 
  going to be a non-has-custom-ctor type, then either define it as optional with `std.none<T>()` or defer the 
  definition. This enforced explicit null-allowance where required. Variable default to a const type (ie can have 
  only 1 assignment).


- `mut` - Allow a defined local-scoped variable to be mutable. It is used after the `let` keyword => `let mut`, the 
  same as in Rust. However, there cannot be an immutable and mutable variable of the same name defined at once. 
  Mutable variables are always received as const by default, but can be received at mutable if desired. Immutable 
  variables are always immutable.


### Statements

- `if` - If statement. Allows for basic branching, with the condition being a boolean expression. The body of the 
  if-statement is always a block, and the condition is always a boolean expression. Also allows for variables to 
  be defined in the condition.


- `else` - Else statement. Allows for basic branching, with the condition being a boolean expression. The body of 
  the else-statement is always a block, and the condition is always a boolean expression. Also allows for variables 
  to be defined in the condition.


- `while` - While loop. Allows for basic looping, with the condition being a boolean expression. The body of the 
  loop is always a block, and the condition is always a boolean expression. Also allows for variables to be defined 
  in the condition.


- `for` - For loop. Allows for looping over a range of values, or over an iterable. The iterable can be a range, 
  array, list, tuple, set, map, string, or any other type that implements the `[]` operator. The body of the loop is 
  always a block, and the condition is always a boolean expression. Also allows for variables to be defined in 
  the condition.


- `do` - Do loop. Allows for looping over a range of values, or over an iterable. The iterable can be a range, 
  array, list, tuple, set, map, string, or any other type that implements the `[]` operator. The body of the loop 
  is always a block, and the condition is always a boolean expression. Also allows for variables to be defined in 
  the condition.


- `match` - Match statement. Allows for matching on a value, and executing a block based on the value. The value 
  can be any type, and the match statement can be used to match on any type. The body of the match statement is 
  always a list of cases, and the condition is always a boolean expression. Also allows for variables to be defined 
  in the condition. Returns the value of the matched case.


- `case` - Case statement. Allows for matching on a value, and executing a block based on the value. The value 
  can be any type, and the case statement can be used to match on any type. The body of the case statement is always 
  a list of cases. Each case can have a guard, which is a boolean expression that must be true for the case to be 
  matched.


- `return` - Return statement. Allows for returning a value from a function. The return statement can only be used 
  inside a function, and the value returned must match the return type of the function. If the function is a void 
  function, then the return statement can be omitted.


- `typedef` - Define a type alias. This allows for a type to be aliased to another type, and can be used to make 
  code more readable. Typedefs can be bound to classes and accessed from a static context.


### Async keywords

- `thread` - Define a thread. This allows for a function to be run in a separate thread. The function doesn't have  
  be a void function, and the thread is automatically joined when the function returns. The thread is automatically 
  detached if the function never returns.


- `defer` - Define a deferred statement. This allows for a statement to be deferred until the end of the current 
  scope. The statement can be any statement, and is executed in the reverse order that they were defined. This is 
  useful for things like closing files, or freeing memory.


- `generator` - Define a generator. Uses the exact same semantics as a `function` definition, but just replaces the
  keyword definition. This allows for very simple interchangeability, and a common syntax all the way through the
  program. The `return` keyword can still be used, and the `yield` keyword to yield the next result. It is a 
  specific implementation of a coroutine.


- `async` - Define an asynchronous function. This allows for a function to be run asynchronously, and the function 
  doesn't have to be a void function. It is a specific implementation of a coroutine, and can be paired with the 
  `await` keyword to wait for the result of the asynchronous function.


- `await` - Await an asynchronous function. This allows for a function to be awaited, and the function doesn't have 
  to be a void function. It is a specific implementation of a coroutine, and can be paired with the `async` keyword 
  to run the function asynchronously.


- `yield` - Yield a value from a generator. The function will return a generator type wrapping the actual value, 
  and the generator can be iterated over to get the value. The function can be used with the `for` keyword to 
  iterate over the generator.


### Predefined decorators
- `@static_method` - Define a method as static. This allows for a method to be called without an instance of the 
  class. The method can still access static members of the class, but cannot access instance members.


- `@class_method` - Define a method as a class method. This allows for a method to be called without an instance of 
  the class. The method can still access static members of the class, and can access instance members. Used to write 
  methods that return the type of the class even after subclassing and overriding.


- `@abstract_method` - Define a method that must be overridden by a subclass. The method can still access static 
  members of the class, and can access instance members. Cannot have a default implementation, as it must be overridden.


- `@virtual_method` - Define a method which can be overridden by a subclass. The method can still access static 
  members of the class, and can access instance members. Can have a default implementation, but can be overridden.


- `@override_method` - Define a method which overrides a virtual method. The method can still access static members 
  of the class, and can access instance members. Can have a default implementation, but can be overridden again.


- `@final_method` - Define a method which cannot be overridden by a subclass. The method can still access static 
  members of the class, and can access instance members. Can have a default implementation, but cannot be overridden.


- `@overload_method` - Tell the compiler that this method is an overload of another method. The method can still 
  access static members of the class, and can access instance members.


- Common combinations:
  - `@static_method @abstract_method` - Define a static method that must be overridden by a subclass. The method can 
    still access static members of the class, but cannot access instance members.
  - `@virtual_method @override_method` - Define a virtual method that is being overridden, but can be overridden again. 
    The method can still access static members of the class, and can access instance members.

---


# Standard Libary

### algorithms.spp
- The algorithms library contains a number of useful algorithms that can be used to manipulate data. The algorithms 
  are all implemented as generic functions, and can be used with any type that implements the `[]` operator. They 
  work by defining structs and overloading the `()` operator as a generator, so that the algorithms only return data 
  as it is needed.


- Algorithms defined include things such as transforms, filters, reversing etc; they are defined as structs not 
  member functions, so that they can be used with any type that implements the `[]` operator. The data type that is 
  iterated over is encouraged to implement the pipe operator `|` to allow for chaining of algorithms. For example 
  with a std::vector<T>, you can do `vector | filter(...) | transform(...) | reverse()`.


- The algorithms use a simple generator pattern that can easily be copied and re-implemented for user defined 
  structs. A base class is provided too, with abstract methods that must be implemented. This forces all the user 
  defined algorithms to conform to the same interface.


---


# BANNED AND NEVER BEING ADDED
- `goto, break, continue, throw` -> disrupts the code flow
- global variables -> inefficient, lead to spaghetti code
- transitive exports -> no