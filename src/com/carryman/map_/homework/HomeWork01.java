package com.carryman.map_.homework;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author carry man
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        News news1 = new News("3月13日0—24时，31个省（自治区、直辖市）和新疆生产建设兵团报告新增确诊病例1437例。");
        News news2 = new News("抗疫两年以来最困难的时期，是漫长冬夜还是倒春寒？ 抗疫两年多，全国同心协力，拒病毒于国门之外，维持了非常低的感染率与病死率。");

        ArrayList arrayList = new ArrayList();
        arrayList.add(news1);
        arrayList.add(news2);

        Collections.reverse(arrayList);

        for (Object o :arrayList) {
            News news=(News)o;

            if ( news.getTitle().length()>15){
                String substring = news.getTitle().substring(0, 15);
                StringBuffer stringBuffer = new StringBuffer(substring);
                stringBuffer.append("...");
                System.out.println(stringBuffer);
            }
            else {
                System.out.println(news.getTitle());
            }

        }


    }
}

class  News{
    private String title;
    private  String text;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }

    public News(String title) {
        this.title = title;

    }
}
