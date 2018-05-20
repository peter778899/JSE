package com.tx.stu.annotaions;

import com.tx.stu.annotations.MyAnnotation;
import org.junit.Test;

/**
 * Created by peter.
 */
@MyAnnotation(id=3,msg="hello annotation")
public class MyAnnotationTest {
    @Test
    public void test() {
        boolean hasAnnotation = MyAnnotationTest.class.isAnnotationPresent(MyAnnotation.class);
        if (hasAnnotation) {
            MyAnnotation myAnnotation = MyAnnotationTest.class.getAnnotation(MyAnnotation.class);
            System.out.println("id: " + myAnnotation.id());
            System.out.println("msg: " + myAnnotation.msg());
        }
    }
}
