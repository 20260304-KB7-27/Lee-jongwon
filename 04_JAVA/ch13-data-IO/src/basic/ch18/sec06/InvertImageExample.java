package basic.ch18.sec06;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class InvertImageExample {

    public static void main(String[] args) throws Exception{
        // 이미지 경로
        String source = "resource/pixel-art.png";
        String destination = "resource/pixel-art-invert.png"; // 색상 반전한 거 저장

        BufferedImage original = ImageIO.read(new File(source));

        int width = original.getWidth();
        int height = original.getHeight();

        // 색상반전 이미지 크기를 지정한 캔버스
        BufferedImage inverted = new BufferedImage(width, height, original.getType());

        System.out.println(original.getRGB(400, 400));
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int argb = original.getRGB(x, y); // 해당 픽셀의 색상을 32비트 정수(ARGB)로 변환
                // [AA|RR|GG|BB]

                int a = (argb >> 24) & 0xFF;
                int r = 255 - ((argb >> 16) & 0xFF);
                int g = 255 - ((argb >> 8) & 0xFF);
                int b = 255 - (argb & 0xFF);

                // OR연산으로 비트들을 재조합
                inverted.setRGB(x,y, (a << 24) | (r << 16) | (g << 8 ) | b);
            }
        }
        //png포멧으로 저장
        ImageIO.write(inverted, "png", new File(destination));
    }

}
