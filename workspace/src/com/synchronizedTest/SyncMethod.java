package com.synchronizedTest;

/**
 * @author flywu
 * @date 2022/11/4 15:12
 */
public class SyncMethod {
    public int i;

    public synchronized void syncTask(){
        i++;
    }
}
