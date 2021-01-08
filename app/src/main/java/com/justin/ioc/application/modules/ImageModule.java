package com.justin.ioc.application.modules;
/*
 * created by Justin on 2021/1/8
 * email: wcw1992yu@163.com
 * github: https://github.com/wangchongwei
 */


import com.justin.ioc.application.objects.ImageObject;

import javax.inject.Singleton;

import dagger.Module;

@Module
@Singleton
public class ImageModule {

    @Singleton
    public ImageObject providerImageObject() {

        return new ImageObject();
    }

}
