package com.xyc.todolist.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class CacheData implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
  log.info("暂时没有缓存，之后有redis了可以在这里实现默认加载");
    }
}
