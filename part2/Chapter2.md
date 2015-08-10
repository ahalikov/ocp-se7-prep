Java Exceptions

Part I: http://habrahabr.ru/company/golovachcourses/blog/223821//#1
Part II: http://habrahabr.ru/company/golovachcourses/blog/225585/

Keywords related to exceptions: 

* try
* catch
* finally
* throw
* throws

Magic of Throwable
In Java, exception handling is revolving around class java.lang.Throwable and his descendants.

So the law is that one should always use java.lang.Throwable or his descendant with keywords try-catch-finally, throw and throws.

Throwing null is acceptable:

public static void main(String[] args) {

}

