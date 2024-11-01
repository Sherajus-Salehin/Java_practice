package FrameBuild.Annotation;
@urlPort(url= "sqube.com")
public class TestAservice1 {
    @TestAnnotation1()
    public void Tester() {
        System.err.println("Printing from service");
    }

    @HttpMethods(path="/randomTest",method = HttpMethod.PUT)
    public void doPut(){
        //
    }
    @HttpMethods(path="/randomTest",method = HttpMethod.POST)
    public void doPost(){
        //
    }
    @HttpMethods(path="/randomTest",method = HttpMethod.GET)
    public void doGet(){
        //
    }
    @HttpMethods(path="/randomTest",method = HttpMethod.DELETE)
    public void doDelete(){
        //
    }
}
