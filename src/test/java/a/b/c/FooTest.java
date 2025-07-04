package a.b.c;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class FooTest {

    @Test
    public void methodFoo() {
        Foo foo = new Foo();
        assertEquals("Foo dummy", foo.methodFoo("dummy"));
    }
}