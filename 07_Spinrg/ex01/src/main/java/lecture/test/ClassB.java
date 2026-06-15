package lecture.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassB {

//    @Autowired // 필드 주입
//    private ClassA classA;

    private ClassA classA;

    @Autowired
    public ClassB(ClassA classA) {
        this.classA = classA;
    }

    public void doSomething() {

        System.out.println("Class B is working");
        classA.doSomething();
    }

}
