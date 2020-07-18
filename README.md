# Interview Questions in Java

## Set up
After downloading the repo, open up in your favorite IDE **IntelliJ IDEA preferred**, you can run the tests with `mvn test` to run all tests with maven if you have Maven installed on you machine and in your PATH.

Also, Run tests using an IntelliJ Run Configuration
![Edit Config](https://resources.jetbrains.com/help/img/idea/2020.1/rc_icons.png)
![Run Configuration Instructions](https://resources.jetbrains.com/help/img/idea/2020.1/ij-select-new-run-config.png)

## Test Setup
tests reside in the `src/test/java` folder. Individual test cases set up as follows: 

```java
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestClass {
  @Test
  void testCase1() {
    assertEquals(expected, actual);
  } 
}
```