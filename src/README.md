# Spring-AOP-Example

 While the project is short and precise this notes are detailed. The notes are for my own reference and for anyone who wants to learn Spring AOP.

## **Common Aspect Terms Explained**

1. **Aspect**: An aspect is a modular unit of code that encapsulates a cross-cutting concern, such as logging or security. It allows you to apply specific functionality across different parts of your codebase.

2. **Joinpoint**: A joinpoint represents a specific point in the execution flow of a program, such as a method invocation or an exception being thrown. Aspects are applied at these joinpoints to modify or add behavior.

3. **Pointcut**: A pointcut is a specification that defines where an aspect should be applied. It identifies the joinpoints in the codebase where the aspect will be invoked. For example, you can specify that an aspect should be applied **before** or **after** a specific method.

4. **Advice**: Advice is the actual implementation of the aspect's behavior. It defines what actions should be taken at a particular joinpoint. Common types of advice include "before" (executed before a joinpoint), "after" (executed after a joinpoint), and "around" (wraps around a joinpoint and controls its execution).

5. **Weaving**: Weaving is the process of applying aspects to the target codebase. It can be done either at compile-time (static weaving) or at runtime (dynamic weaving). Weaving combines the aspects with the existing code to create the final executable.



## **Spring AOP**

Spring AOP (Aspect-Oriented Programming) is a useful feature in the Spring Framework that helps developers separate common functionality from the business logic in their applications. It allows for modularizing cross-cutting concerns like logging, security, and transaction management.

AOP works by applying aspects to the existing codebase. Aspects are reusable modules of code that encapsulate cross-cutting concerns. 

**Annotations Used in Spring AOP:**

1. `@Aspect`: Identifies a class as an aspect and is used along with other annotations to define its behavior.

2. `@Pointcut`: Defines a specific joinpoint (a point during program execution) where the aspect should be applied.

3. `@Before`: Executes the annotated method before the specified joinpoint.

4. `@After`: Executes the annotated method after the specified joinpoint, regardless of the outcome.

5. `@AfterReturning`: Executes the annotated method after the specified joinpoint if it returns successfully.

6. `@AfterThrowing`: Executes the annotated method after the specified joinpoint only if an exception is thrown.

7. `@Around`: Allows the annotated method to control the entire execution of the joinpoint.

## Acknowledgements
Special thanks to the following book:
- Title: "Spring Start Here: Learn what you need and learn it well"
- Author: Laurentiu Spilca


