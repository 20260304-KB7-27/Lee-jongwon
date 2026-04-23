package ch12.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Application {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        // Service에 선언된 메서드를 모두 가져옴 (method 1, 2, 3)
        Method[] declaredMethod = Service.class.getDeclaredMethods();

        Method method = declaredMethod[2]; // 어노테이션이 붙은 상태

        // 2. 메서드에 붙은 어노테이션을 읽기
        PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

        // 3. 어노테이션 속성값으로 구분선 출력
        if (printAnnotation != null) {
            int number = printAnnotation.number(); // 어노테이션에 정의한 속성
            String value = printAnnotation.value();

            for (int i = 0; i < number; i++) {
                System.out.print(value);
            }

            System.out.println();
        }

        method.invoke(new Service());
    }
}