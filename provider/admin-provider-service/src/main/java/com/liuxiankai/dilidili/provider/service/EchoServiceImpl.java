package com.liuxiankai.dilidili.provider.service;

import com.liuxiankai.dilidili.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Service;


@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String string) {
        return "hello dubbo" + string;
    }
}
