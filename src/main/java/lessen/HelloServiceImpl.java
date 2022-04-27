package lessen;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHallo(String name) {
        return "Hello, "+name+ ".";
    }
}
