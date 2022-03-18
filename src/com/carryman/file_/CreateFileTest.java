package com.carryman.file_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author carry man
 * @version 1.0
 */
public class CreateFileTest {

    @Test
    public void createFile1() {
        File file = new File("d:\\newfile.txt");

        try {
            if (!file.exists()) {
                boolean newFile = file.createNewFile();
                System.out.println(newFile);
            } else {
                System.out.println("文件存在");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void createFile2() {

        File directioy = new File("d://");
        File file = new File(directioy, "2.txt");

        if (!file.exists()) {
            boolean newFile = false;
            try {
                newFile = file.createNewFile();
                System.out.println(newFile);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }

    @Test
    public void createFile3() {
        File file = new File("d:\\", "3.txt");

        try {
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void delete() {
        File file = new File("d:\\3.txt");

        boolean delete = file.delete();

        System.out.println(delete);

    }

    @Test
    public void getPath() {
        File file = new File("");
        try {
            String canonicalPath = file.getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

//    @Test
//    public void getAllPath() {
//        File file = new File("d:\\");
//        String[] list = file.list();
//        File[] files = file.listFiles();
//        System.out.println(Arrays.toString(list));
//        System.out.println(Arrays.toString(files));
//    }

    @Test
    public void printFile() {
        File f = new File("D:\\新建文件夹");
         // 列出所有文件和子目录
        printFiles(f);

    }


    static void printFiles(File files) {
        System.out.println("==========");
        File[] files1 = files.listFiles();
        if (files1 != null) {
            for (File f : files1) {
                if (f.isDirectory()){
                    System.out.println(f.getName());
                    printFiles(f);
                }
                if (f.isFile()){
                    System.out.println(f.getName());
                }
            }
        }

        System.out.println("==========");
        System.out.println("");



    }


    /**
     * 遍历文件夹下的所有文件和文件夹
     */
    @Test
    public void pr(){
        File file = new File("d:\\新建文件夹");
        myPrintFile(file);

    }

    public void myPrintFile(File file){
        File[] files = file.listFiles();

        if (files!=null){
            for (File f :files) {
                if (f.isDirectory()){
                    System.out.println("找到文件夹，进入遍历");
                    System.out.println("文件名为"+f.getName());
                    myPrintFile(f);
                }
                if (f.isFile()){
                    System.out.println("找到文件,打印名称");
                    System.out.println(f.getAbsolutePath());

                    System.out.println(f.getName());
                }
            }
        }
        System.out.println("遍历完成！");


    }

    @Test
    public void absolutePath(){
        File file = new File("d:\\新建文件夹\\a\\b\\c");

        if (file.exists()){
            System.out.println("目录存在");

        }
        else {
            //创建多级目录
            boolean mkdirs = file.mkdirs();
            if (mkdirs){
                System.out.println("创建成功");
            }
            else{
                System.out.println("创建失败");
            }
        }
    }

    @Test
    public void mkdir(){
        File file = new File("d:\\d");
        boolean mkdir = file.mkdir();
        System.out.println(mkdir);
        boolean delete = file.delete();
        System.out.println(delete);
    }



    //删除路径下所有文件 慎用
    @Test
    public void deleteAll(){
        File file = new File("d:\\");
        deleteFile(file);

    }

    public void deleteFile(File file){
        File[] files = file.listFiles();

        if (files!=null){
            for (File file1 :files) {
                if (file1!=null){
                    if (file1.isDirectory()){
                        deleteFile(file1);
                        boolean delete = file1.delete();
                        System.out.println("文件夹删除"+delete);
                    }
                    if (file1.isFile()){
                        boolean delete = file1.delete();
                        System.out.println("文件删除"+delete);
                    }
                }
            }
        }



    }

}
