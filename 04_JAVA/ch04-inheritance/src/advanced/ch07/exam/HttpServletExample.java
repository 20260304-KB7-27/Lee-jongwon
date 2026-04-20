package advanced.ch07.exam;

public class HttpServletExample {
    public static void main(String[] args) {
//        servlet.service();

        method(new LoginServlet());
        method(new FileDownloadServlet());
    }
    public static void method(HttpServlet servlet){ //매개변수의 다형성
        servlet.service(); //동적 바인딩
    }
}
