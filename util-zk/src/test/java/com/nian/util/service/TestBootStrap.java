package com.nian.util.service;

import com.nian.util.server.BusinessServer;
import org.I0Itec.zkclient.ZkClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author niange
 * @ClassName: TestBootStrap
 * @desp:
 * @date: 2017/4/17 下午9:39
 * @since JDK 1.7
 */
public class TestBootStrap {
    private static Logger logger = LoggerFactory.getLogger(TestBootStrap.class);
    public static void main(String[] args){
        ZkClient zkClient = new ZkClient("192.168.139.159:2181", 1000);
        for(int i=0;i<5;i++){
            BusinessServer server = new BusinessServer("/server", zkClient, null);
            server.setName("servername"+i);
            server.start();
        }

    }
}
