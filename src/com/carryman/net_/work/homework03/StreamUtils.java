package com.carryman.net_.work.homework03;

import java.io.*;

/**
 * @author carry man
 * @version 1.0
 */
public class StreamUtils {
    //解析流的工具类

    public static byte[] streamToByteArray(InputStream in){

        //内存输出流

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        try {

            int len = 0;

            byte[] buffer = new byte[1024];  //1kb

            while((len = in.read(buffer))!=-1){

                bos.write(buffer, 0, len);

            }

            //关闭流

            bos.close();

            return bos.toByteArray();

        } catch (IOException e) {

            e.printStackTrace();

            return null;

        }

    }

    //解析流的工具类

    public static String streamToString(InputStream in){

        //



        StringBuilder stringBuilder = new StringBuilder();
        String line;

        try ( BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in))){

            while((line=bufferedReader.readLine())!=null){
                stringBuilder.append(line+"\r\n");
            }

            return stringBuilder.toString();

        } catch (IOException e) {

            e.printStackTrace();

            return null;

        }

    }
}

