package com.offer;

class Program_2_01 {
    private  static Object object;

    private volatile static Program_2_01 instance;
    /*
     * solution01:双重检测锁定+volatile关键字
     */
    public static Program_2_01 getInstance() {
        if (instance == null) {
            //synchronized (object) {
            synchronized (Program_2_01.class) {
                if (instance == null) {
                    instance = new Program_2_01();
                }
            }
        }
        return instance;
    }

}
