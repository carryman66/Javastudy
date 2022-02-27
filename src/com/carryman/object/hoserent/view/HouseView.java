package com.carryman.object.hoserent.view;

import com.carryman.object.hoserent.domain.House;
import com.carryman.object.hoserent.service.HouseService;
import com.carryman.object.hoserent.utils.Utility;

public class HouseView {


    //控制显示菜单
    private boolean flag = true;

    //接受用户选择
    private char key;

    //默认放2个
    private HouseService houseService = new HouseService(2);


    /**
     * 修改房屋信息
     * 根据id修改房屋信息
     */

    public void updateHouse(){
        System.out.println("---------------修改房屋信息---------------");
        System.out.println("请输入您要修改的房屋ID(-1退出修改): ");
        int id = Utility.readInt();
        if (id==-1){
            System.out.println("---------------放弃修改房屋信息---------------");
            return;
        }
        if (id<=0){
            System.out.println("您输入的ID有误");
            return;
        }
        House searchHouse = houseService.search(id);
        if (searchHouse!=null){
            System.out.println("编号\t\t房主\t\t\t电话\t\t\t\t地址\t\t\t月租\t\t\t状态(未出租|已出租)");
            System.out.println(searchHouse);
            System.out.println("请输入修改的信息: ");
            System.out.print("姓名: ");
            String  name = Utility.readString(8, "");
            if (!"".equals(name)){
                searchHouse.setName(name);
            }
            System.out.print("电话: ");
            String  phone = Utility.readString(12, "");
            if (!"".equals(phone)){
                searchHouse.setPhone(phone);
            }
            System.out.print("地址: ");
            String  address = Utility.readString(16, "");
            if (!"".equals(address)){
                searchHouse.setAddress(address);
            }
            System.out.print("月租: ");
            int  rent = Utility.readInt(-1);
            if (rent!=-1){
                searchHouse.setRent(rent);
            }
            System.out.print("状态: ");
            String  state = Utility.readString(3, "");
            if (!"".equals(state)){
                searchHouse.setAddress(state);
            }
            System.out.println("房屋修改成功");

        }else {
            System.out.println("您修改的房屋不存在");
        }



    }


    /**
     * 查找房屋
     * 根据id查找房屋并返回
     *
     */
    public void searchHouse(){
        System.out.println("---------------查找房屋---------------");

        System.out.println("请输入您要查找的房屋ID: ");
        int id = Utility.readInt();

        if (id<=0){
            System.out.println("您输入的ID有误");
            return;
        }
        House searchHouse = houseService.search(id);
        if (searchHouse!=null){
            System.out.println("编号\t\t房主\t\t\t电话\t\t\t\t地址\t\t\t月租\t\t\t状态(未出租|已出租)");
            System.out.println(searchHouse);
        }else {
            System.out.println("您查询的房屋ID不存在");
        }



    }


    /**
     * 退出房屋出租系统
     *
     */
    public void exit(){
        System.out.println("确定退出");
        char c = Utility.readConfirmSelection();
        if (c == 'Y'){
            flag = false;
        }
    }


    /**
     * 删除房屋
     * 接受用户删除的id，调用service(int id)
     * 返回boolean 判断是否删除成功
     */
    public void deleteHouse() {

        System.out.println("---------------删除房屋信息---------------");
        System.out.print("请输入删除的房屋编号(-1退出删除): ");
        int deleteId = Utility.readInt();
        if (deleteId == -1) {
            System.out.println("---------------放弃删除房屋信息---------------");
            return;
        }
//        System.out.println("请确认是否删除(Y/N),小心选择: ");
        //请确认是否删除
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {

            if (houseService.delete(deleteId)){
                System.out.println("删除房屋信息成功");
            }
            else {
                System.out.println("房屋ID不存在");
            }
        } else {
            System.out.println("---------------放弃删除房屋信息---------------");
        }


    }


    /**
     * 添加房屋
     * 接受输入，创建house对象，调用service方法
     */
    public void addHouse() {
        System.out.println("---------------新增房源---------------");
        System.out.print("姓名: ");
        String name = Utility.readString(8);
        System.out.print("电话: ");
        String phone = Utility.readString(12);
        System.out.print("地址: ");
        String address = Utility.readString(16);
        System.out.print("月租: ");
        int rent = Utility.readInt();
        System.out.print("状态: ");
        String state = Utility.readString(3);

        //创建一个新的house对象
        //ID是系统分配，用户不能输入

        House house = new House(1, name, phone, address, rent, state);
        boolean add = houseService.add(house);
        if (add) {
            System.out.println("---------------添加房屋成功---------------");
        } else {
            System.out.println("---------------房子已满，不能添加---------------");
        }

    }


    /**
     * 房屋列表
     */

    public void listHouse() {
        System.out.println("---------------房屋列表---------------");
        System.out.println("编号\t\t房主\t\t\t电话\t\t\t\t地址\t\t\t月租\t\t\t状态(未出租|已出租)");
        //所有的房屋信息
        House[] houses = houseService.list();
        for (House h : houses) {
            if (h == null) {
                break;
            }
            String s = h.toString();
            System.out.println(s);
        }

    }

    /**
     * 主菜单
     */
    public void mainMenu() {
        do {

            System.out.println("===============房屋出租系统===============");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退       出");

            System.out.print("请输入您的选择(1-6): ");
            key = Utility.readChar();

            switch (key) {
                case '1': {
                    addHouse();
                    break;
                }
                case '2': {
                    searchHouse();
                    break;
                }
                case '3': {
                    deleteHouse();
                    break;
                }
                case '4': {
                    updateHouse();
                    break;
                }
                case '5': {

                    listHouse();
                    break;
                }
                case '6': {

                 exit();
                 break;

                }
                default: {
                    System.out.println("您输入有误！检查后重新输入");
                }
            }


        } while (flag);
    }
}
