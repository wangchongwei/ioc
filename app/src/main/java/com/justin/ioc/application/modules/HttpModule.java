package com.justin.ioc.application.modules;
/*
 * created by Justin on 2021/1/8
 * email: wcw1992yu@163.com
 * github: https://github.com/wangchongwei
 */


import com.justin.ioc.application.objects.HttpObject;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Singleton
@Module
public class HttpModule {

    @Singleton
    @Provides
    public HttpObject providerHttpObject() {
        return new HttpObject();
    }

}
