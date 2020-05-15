package com.gracefulwind.learndagger2;

import dagger.Component;

/**
 * @ClassName: MainComponent
 * @Author: Gracefulwind
 * @CreateDate: 2020/5/15 16:28
 * @Description: ---------------------------
 * @UpdateUser:
 * @UpdateDate: 2020/5/15 16:28
 * @UpdateRemark:
 * @Version: 1.0
 * @Email: 429344332@qq.com
 */

@Component(modules = MainModule.class)
public interface MainComponent {

    void inject(MainActivity activity);

}
