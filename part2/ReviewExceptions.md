Java Exceptions
---

Part I: http://habrahabr.ru/company/golovachcourses/blog/223821//#1

Keywords related to exceptions: 

* try
* catch
* finally
* throw
* throws

####Magic of Throwable

In Java, exception handling is revolving around class `java.lang.Throwable` and his descendants.

So the law is that one should always use `java.lang.Throwable` or his descendant with keywords `try-catch-finally`, `throw` and `throws`.

Throwing null is NOT acceptable (code below will compile but fail with NPE):

```
public static void main(String[] args) {
  throw null;
}

>> RUNTIME ERROR: Exception in thread "main" java.lang.NullPointerException
```

####System.err is used with exceptions

One thing to remember here is that System.out is buffered, while System.err is not buffered.
As a result the following code:

```
System.out.println("sout");
throw new Error();
```

may output:

```
>> sout
>> RUNTIME ERROR: Exception in thread "main" java.lang.Error
```

Throwing exception - is an additional return type. 

####`catch` is polymorphic.

It is not recommended:

*  to use `return` in finally-section (exception from `try` section can be wiped out).
*  to do something in finally-section that can throw exception (exception from `try` section can be wiped out).
*  

Part II: http://habrahabr.ru/company/golovachcourses/blog/225585/

####Pessimistic mechanism

E.g.:

```
public class App {
    public static void main(String[] args) throws Exception {
        throw new IOException();
    }
}
``` 
