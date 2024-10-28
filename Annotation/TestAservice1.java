package Java_practice.Annotation;

public class TestAservice1 {
    @TestAnnotation1(testMethod = "ok")
    public void Tester() {
        System.err.println("Printing from service");
    }
}
