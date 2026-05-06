package basic.ch18.sec06;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("resource/printStream.txt");

        PrintStream ps = new PrintStream(fos);

        ps.println("Print 출력하는 것처럼");
        ps.println("데이터를 입출력한다");
        ps.printf("| %6d | %10s | %\n", 1, "홍길동");
        ps.printf("| %6d | %10s | %\n", 2, "홍길동");

        ps.flush();
        ps.close();
    }
}
