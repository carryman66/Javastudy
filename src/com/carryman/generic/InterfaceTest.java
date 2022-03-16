package com.carryman.generic;

/**
 * @author carry man
 * @version 1.0
 */
 interface InterfaceTest<T> {
      T hi();
}
interface InterFaceIMPL extends  InterfaceTest<String>{

}

class Test implements InterfaceTest<Integer>{
     public<T,R> void run(T t,R r){
         System.out.println(t.getClass());
         System.out.println(r.getClass());
     }

    @Override
    public Integer hi() {
        return 9999;
    }
}
