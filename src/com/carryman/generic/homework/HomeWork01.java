package com.carryman.generic.homework;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author carry man
 * @version 1.0
 */
public class HomeWork01 {

    @Test
     public void test(){
        DAO<User> userDAO = new DAO<>();
        userDAO.save("1",new User(1,18,"tom"));
        userDAO.get("1");
        userDAO.update("1",new User(20,20,"jack"));
        List<User> list = userDAO.list();
        System.out.println(list);
        userDAO.delete("1");
    }

}

class DAO<T> {
    private Map<String, T> map=new HashMap<>();

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {

        return map.get(id);

    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {
        ArrayList<T> ts = new ArrayList<>();
        Set<String> strings = map.keySet();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            T t = get(next);
            ts.add(t);
        }
        return ts;
    }

    public void  delete(String id){
        map.remove(id);
    }

}
class User{
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}