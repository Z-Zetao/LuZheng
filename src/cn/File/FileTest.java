package cn.File;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author 51465
 */
public class FileTest {

    @Test
    public void test4(){
        File file = new File("hi.txt");
        try {
            boolean newFile = file.createNewFile();//boolean createNewFile():创建文件。若文件存在，则不创建，并返回False
        } catch (IOException e) {
            e.printStackTrace();
        }
        boolean mkdir = file.mkdir();//boolean mkdir():创建文件目录。如果上层文件目录不存在，则不进行创建
        boolean mkdirs = file.mkdirs();//boolean mkdirs():创建文件目录。如果上层文件目录不存在，一并创建
        boolean delete = file.delete();//boolean delete():删除文件或文件夹
    }

    @Test
    public void test3(){
        File file = new File("hello.txt");
        boolean file1 = file.isFile();//boolean isFile():判断是否是文件
        boolean directory = file.isDirectory();//boolean isDirectory():判断是否是文件目录
        boolean exists = file.exists();//boolean exists():判断是否存在
        boolean b = file.canRead();//boolean canRead():判断是否可读
        boolean b1 = file.canWrite();//boolean canWrite():判断是否可写
        boolean hidden = file.isHidden();//boolean isHidden():判断是否隐藏
    }

    @Test
    public void test2(){
        File file1 = new File("hello.txt");
        File file2 = new File("D:\\io\\hello.txt");

        String absolutePath = file1.getAbsolutePath();//String getAbsolutePath():获取绝对路径
        String path = file1.getPath();//String getPath():获取路径
        String name = file1.getName();//String getName():获取文件名字
        String parent = file1.getParent();//String getParent():获取上层文件目录路径
        long length = file1.length();//long length():文件中的长度
        long l = file1.lastModified();//long lastModified():获取最后一次的修改时间
        String[] list = file1.list();//String[] list():获取指定目录下的所有文件或者文件目录的名称数组
        File[] files = file1.listFiles();//File[] listFiles():获取指定目录下的所有文件过着文件目录的File数组
    }

    @Test
    public void test1(){
        //创建File实例
        File file0 = new File("hello.txt");
        File file1 = new File("D:\\workspace\\Java\\File\\hello.txt");
        File file2 = new File("D:\\workspace\\Java", "File");
        File file3 = new File(file2, "hello.txt");
    }
}
