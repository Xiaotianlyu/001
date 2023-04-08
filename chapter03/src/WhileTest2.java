/*
世界上最高的山是珠穆朗玛峰：8848.86米,假如我有一张很大的纸，厚度是0.1mm,
请问，我折叠多少次可以折成它的高度？
 */

public class WhileTest2 {
    public static void main(String[] args) {
        //1.声明珠穆朗玛峰的高度,纸的厚度
        double paper = 0.1;//毫米
        double zf = 8848860;//毫米

        //2.定义一个变量，记录折纸次数
        int count = 0;

        //3.通过循环结构，不断调整纸的厚度.当纸的厚度超过珠穆朗玛峰高度时，停止循环
        while (paper <= zf) {
            paper *= 2;
            count++;
        }

        System.out.println("paper的高度为：" + (paper / 1000) + ",超过了珠峰的高度" + zf);
        System.out.println("共折纸" + count + "次");

    }


}
