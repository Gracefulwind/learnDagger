package com.gracefulwind.learndagger2.mvp.activity2;

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

@Component(modules = SecondModule.class)
public interface SecondComponent {
    void injectSecond(SecondContract.View view);

}
