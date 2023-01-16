package com.synchronizedTest;

/**
 * @author flywu
 * @date 2022/11/4 15:03
 */
public class SyncCodeBlock {
    public int i;

    public void syncTask(){
        //同步代码库
        synchronized (this){
            i++;
        }
    }
}
