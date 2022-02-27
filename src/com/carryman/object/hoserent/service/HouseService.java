package com.carryman.object.hoserent.service;

import com.carryman.object.hoserent.domain.House;

/**
 *
 */
public class HouseService {
    private House[] houses;
    //当前有多少房屋信息
    //系统已经有一条，默认添加唯一
    private int housesNums = 1;

    //id自增长到哪个值了
    //系统已经有一条，id为1
    private int idCounter = 1;


    public HouseService(int size) {
        houses = new House[size];
        houses[0] = new House(1, "jack", "13266666666", "海淀区", 2000, "未出租");

    }


    //返回房屋数组
    public House[] list() {
        return houses;
    }
    //添加房屋进数组

    public boolean add(House house) {
        if (housesNums == houses.length) {//满了

            return false;
        }

        houses[housesNums++] = house;

        house.setId(++idCounter);

        return true;

    }

    //删除房屋，根据id
    public boolean delete(int id) {
        int index = -1;

        //找到删除的房屋对应的下标，数组实际位置
        for (int i = 0; i < houses.length; i++) {
            if (id == houses[i].getId()) {
                index = i;
                break;
            }

        }

        if (index  == -1){
            return false;
        }
        for (int i = index; i <housesNums-1; i++) {
            houses[i]=houses[i+1];
        }
        //最后一个置空，并且当前房屋数-1
        houses[--housesNums]=null;

        return true;


    }

    /**
     * 根据id查找house对象
     * @param id
     * @return
     */
    public House search(int id){

        for (int i = 0; i < housesNums; i++) {
            if (houses[i].getId()==id){
                return houses[i];

            }

        }
        return null;
    }


}
