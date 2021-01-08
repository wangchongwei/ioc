package com.justin.ioc.application.components;
/*
 * created by Justin on 2021/1/8
 * email: wcw1992yu@163.com
 * github: https://github.com/wangchongwei
 */

import com.justin.ioc.application.MainActivity;
import com.justin.ioc.application.modules.HttpModule;
import com.justin.ioc.application.modules.ImageModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {HttpModule.class, ImageModule.class})
public interface HttpComponent {


    void injectMainActivity(MainActivity activity);

}


