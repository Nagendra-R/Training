package springaop.demo.proxy;

public class LoggerAspect {

    public void logBefore(){
        System.out.println("before ");
    }

    public void logAfter() {
        System.out.println("after ");
    }
}
