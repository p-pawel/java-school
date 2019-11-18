% Exceptions

# Intro

## What Is an Exception?

The Java uses exceptions to handle errors and other exceptional events.

The term exception is shorthand for <q>exceptional event</q>.

> Definition: An exception is an event, which occurs during the execution of a program, that disrupts the normal flow of the program's instructions.

<a href="https://docs.oracle.com/javase/tutorial/essential/exceptions/definition.html" target="_blank">[reference]</a>

## Call stack

<div style="text-align: center;"><img alt="" src="https://docs.oracle.com/javase/tutorial/figures/essential/exceptions-callstack.gif" style="width:50%" /></div>


## Searching the call stack for the exception handler

<div style="text-align: center;"><img alt="" src="https://docs.oracle.com/javase/tutorial/figures/essential/exceptions-errorOccurs.gif" style="width:50%" /></div>










## The Catch or Specify Requirement


Code that throws exceptions must be enclosed by either:

* A `try` statement that catches the exception.

* A method that specifies that it `throws` the exception.

**Code that fails to honor the Catch or Specify Requirement will not compile.**

Not all exceptions are subject to the Catch or Specify Requirement. 


## A `try` statement that catches the exception.##
The `try` statement must provide a handler for the exception.

## A method that specifies that it `throws` the exception.
 
The method must provide a `throws` clause that lists the exception. 



# Kinds of Exceptions

<img alt="" src="https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Java_exception_classes.svg/1920px-Java_exception_classes.svg.png" style="width:50%" />

<small>CC-AT-SA https://commons.wikimedia.org/wiki/File:Java_exception_classes.svg</small>


## Exceptions (checked exceptions)  
These are exceptional conditions that a well-written application should anticipate and recover from. 
<!--
For example, suppose an application prompts a user for an input file name, then opens the file by passing the name to the constructor for java.io.FileReader. 
Normally, the user provides the name of an existing, readable file, so the construction of the FileReader object succeeds, and the execution of the application proceeds normally. 
But sometimes the user supplies the name of a nonexistent file, and the constructor throws java.io.FileNotFoundException. 

A well-written program will catch this exception and notify the user of the mistake, possibly prompting for a corrected file name.
-->



Checked exceptions are subject to the Catch or Specify Requirement. 

All exceptions are checked exceptions, except for those indicated by `Error`, `RuntimeException`, and their subclasses.

## Errors

These are exceptional conditions that are external to the application, and that the application 
usually cannot anticipate or recover from. 


Errors are not subject to the Catch or Specify Requirement. 
Errors are those exceptions indicated by Error and its subclasses.

## Runtime exceptions

These are exceptional conditions that are internal to the application, and that the application usually cannot 
anticipate or recover from. 

These usually indicate programming bugs, such as logic errors or improper use of an API. 
The application can catch this exception, but it probably makes more sense to eliminate the bug that caused the exception to occur.

Runtime exceptions are not subject to the Catch or Specify Requirement. 
Runtime exceptions are those indicated by RuntimeException and its subclasses.


# Catching and Handling Exceptions

## `try`

Separation of concerns:

* logic that might throw the exception

* logic that handle given exception

```
try {
  ... // protected code
} catch ( <exception-type> <identifier> ) {
  ... // catch block
}
```
## `catch`

You associate exception handlers with a try block by providing one or more catch blocks directly after the try block. No code can be between the end of the try block and the beginning of the first catch block.

```
try {

} catch (ExceptionType name) {

} catch (ExceptionType name) {

}
```


<a href="https://docs.oracle.com/javase/tutorial/essential/exceptions/catch.html" target="_blank">[reference]</a>



## `finally`

```
try {

} catch (ExceptionType name) {

} finally {

}
```


The finally block always executes when the try block exits. This ensures that the finally block is executed even if an unexpected exception occurs. 


<a href="https://docs.oracle.com/javase/tutorial/essential/exceptions/finally.html" target="_blank">[reference]</a>


## Try with resources

The close() method of an `java.lang.AutoCloseable` object is called automatically when exiting a try-with-resources block for which the object has been declared in the resource specification header. 

```
try (BufferedReader br = new BufferedReader(new FileReader(path))) {
    return br.readLine();
}
```




# Throwing

## Specifying the Exceptions Thrown by a Method

`void myMethod() throws MyException {
...
}`

<a href="https://docs.oracle.com/javase/tutorial/essential/exceptions/declaring.html" target="_blank">[reference]</a>

## How to Throw Exceptions?

`throw new MyException()`

<a href="https://docs.oracle.com/javase/tutorial/essential/exceptions/throwing.html" target="_blank">[reference]</a>



# The end