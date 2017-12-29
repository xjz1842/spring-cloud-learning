package com.springcloud.eureka.sever.listener;

import com.netflix.appinfo.InstanceInfo;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRenewedEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaRegistryAvailableEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaServerStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by wuweifeng on 2017/10/10.
 */
@Component
public class EurekaStateChangeListener {

    @EventListener
    public void listen(EurekaInstanceCanceledEvent eurekaInstanceCanceledEvent) {
        //服务断线事件
        String appName = eurekaInstanceCanceledEvent.getAppName();
        String serverId = eurekaInstanceCanceledEvent.getServerId();
        System.out.println("appName:" + appName);
        System.out.println("serverId" + serverId);
    }

    @EventListener
    public void listen(EurekaInstanceRegisteredEvent event) {
        InstanceInfo instanceInfo = event.getInstanceInfo();
        System.out.println("instanceInfo" + instanceInfo);
    }

    @EventListener
    public void listen(EurekaInstanceRenewedEvent event) {
        System.out.println("kppName1" + event.getAppName());
        System.out.println(("serverId1" + event.getServerId()));
    }

    @EventListener
    public void listen(EurekaRegistryAvailableEvent event) {
        System.out.println("kppName2" + event.getSource());
        System.out.println(("timestamp2" + event.getTimestamp()));
    }

    @EventListener
    public void listen(EurekaServerStartedEvent event) {
        //Server启动
        System.out.println("-------start Servert -----");
    }
}