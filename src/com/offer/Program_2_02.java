package com.offer;

class Program_2_02 {
    /*
     * solution02:基于类初始化的解决方案
     */
    private static class InstanceHolder {
        //注意实例化
        public static Program_2_02 instance = new Program_2_02();
    }

    public static Program_2_02 getInstance() {
        return InstanceHolder.instance;

    }

}
