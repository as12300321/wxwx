package com.myuuutime.server;

import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 給图片添加图片
 *
 * @author liqiang
 */
@Service("WaterMarkUtils")
public class WaterMarkUtils {

    /**
     * @param args
     */
//    public static void main(String[] args) {
//        String srcImgPath = "C:\\Users\\songfei\\Desktop\\166707_pen_color2.png";
//        String iconPath = "C:\\Users\\songfei\\Desktop\\zg01.png";
//        String targerPath = "C:\\tmp\\image.jpg";
////        String targerPath2 = "C:\\tmp\\image2.jpg";
//        // 给图片添加水印
//        WaterMarkUtils.markImageByIcon(iconPath, srcImgPath, targerPath,-45);
//        // 给图片添加水印,水印旋转-45
//       // WaterMarkUtils.markImageByIcon(iconPath, srcImgPath, targerPath2, -45);
//
//    }

    /**
     * 给图片添加水印
     *
     * @param iconPath
     *            水印图片路径
     * @param srcImgPath
     *            源图片路径
     * @param targerPath
     *            目标图片路径
     */
//    public static void markImageByIcon(String iconPath, String srcImgPath, String targerPath) {
//        markImageByIcon(iconPath, srcImgPath, targerPath, null);
//    }

    /**
     * 给图片添加水印、可设置水印图片旋转角度
     *
     * @param iconPath   水印图片路径
     * @param srcImgPath 源图片路径
     * @param targerPath 目标图片路径
     * @param degree     水印图片旋转角度
     */
    public String markImageByIcon(String iconPath, String srcImgPath, String targerPath, Integer degree) {
        OutputStream os = null;
        try {
            Image srcImg = ImageIO.read(new File(srcImgPath));

            BufferedImage buffImg = new BufferedImage(srcImg.getWidth(null), srcImg.getHeight(null),
                    BufferedImage.TYPE_INT_RGB);

            // 得到画笔对象
            // Graphics g= buffImg.getGraphics();
            Graphics2D g = buffImg.createGraphics();

            // 设置对线段的锯齿状边缘处理
            g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);

            g.drawImage(srcImg.getScaledInstance(srcImg.getWidth(null), srcImg.getHeight(null), Image.SCALE_SMOOTH), 0,
                    0, null);

//            if (null != degree) {
//                // 设置水印旋转
//                g.rotate(Math.toRadians(degree), (double) buffImg.getWidth() / 2, (double) buffImg.getHeight() / 2);
//            }

            // 水印图象的路径 水印一般为gif或者png的，这样可设置透明度
            ImageIcon imgIcon = new ImageIcon(iconPath);

            // 得到Image对象。
            Image img = imgIcon.getImage();

            float alpha = 0.8f; // 透明度
            g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, alpha));

            // 表示水印图片的位置
            g.drawImage(img, 500, 150, null);

            g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER));

            g.dispose();

            os = new FileOutputStream(targerPath);

            // 生成图片
            ImageIO.write(buffImg, "JPG", os);
            String nu="write image success";
            System.out.println("图片完成添加Icon印章。。。。。。");
            return nu;
        } catch (Exception e) {
            e.printStackTrace();
            return "write image failure";
        } finally {
            try {
                if (null != os)
                    os.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}