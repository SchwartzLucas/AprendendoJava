package PassBy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonPrimitivesUnitTest {

    @Test
    public void whenModifyingObjects_thenOriginalObjectChanged() {
        Foo a = new Foo(1);
        Foo b = new Foo(1);

        // Before Modification
        assertEquals(1, a.num);
        assertEquals(1, b.num);

        modify(a, b);

        // After Modification
        assertEquals(2, a.num);
        assertEquals(1, b.num);
    }

    public static void modify(Foo a1, Foo b1) {
        a1.num++;

        b1 = new Foo(1);
        b1.num++;
    }
}

