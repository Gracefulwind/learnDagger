package com.gracefulwind.learndagger2.mvp.activity2;

import com.gracefulwind.learndagger2.base.ActivityScope;

import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;

/**
 * @ClassName: SecondComponent
 * @Author: Gracefulwind
 * @CreateDate: 2020/5/18 10:12
 * @Description: ---------------------------
 * @UpdateUser:
 * @UpdateDate: 2020/5/18 10:12
 * @UpdateRemark:
 * @Version: 1.0
 * @Email: 429344332@qq.com
 */

@ActivityScope
@Component(modules = SecondModule.class)
public interface SecondComponent {

    /**
     * 这里必须填写注入的类，不能是继承关系。
     * 比如这里就必须用SecondActivity，用view就会找不到对应类，无法注入
    */
//    void injectSecond(SecondContract.View view);
    void injectSecond(SecondActivity activity);

//    SecondContract.View setView();
////    SecondContract.Model setModel();
//
//    @Component.Builder
//    interface Builder {
////        @Binds
//        @BindsInstance
//        Builder setView(SecondContract.View view);
////        Builder setModel(SecondContract.Model model);
//
//        SecondComponent build();
//    }

}
