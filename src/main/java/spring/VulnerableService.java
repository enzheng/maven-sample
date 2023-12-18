package spring;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

public class VulnerableService {
    private MyService myService;

    public void setMyService(MyService myService) {
        this.myService = myService;
    }

    public void exportService() {
        HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
//        exporter.setService(myService);
//        exporter.setServiceInterface(MyService.class);
//        exporter.afterPropertiesSet();
        // HttpInvokerServiceExporterを使用してサービスを公開する
    }
}