package com.gracefulwind.learndagger2.mvp.activity3;

import com.gracefulwind.learndagger2.mvp.activity2.SecondContract;

import dagger.BindsInstance;
import dagger.Component;

/**
 * @ClassName: ThirdComponent
 * @Author: Gracefulwind
 * @CreateDate: 2020/5/18 15:33
 * @Description: ---------------------------
 * @UpdateUser:
 * @UpdateDate: 2020/5/18 15:33
 * @UpdateRemark:
 * @Version: 1.0
 * @Email: 429344332@qq.com
 */

@Component(modules = ThirdModule.class)
public interface ThirdComponent {

    void inject(ThirdActivity activity);

//---------------------------------------------------------------------------------------------------------
    //这个方法干嘛的？似乎去掉也可以啊。。。
    //这个方法可以返回我们在builder里输入的实例。当没用链式的时候可以拿到这个view并执行相关操作
    ThirdContract.View getView();
    ThirdContract.Model getModel();

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder getThirdView(ThirdContract.View view);
        @BindsInstance
        Builder getThirdModel(ThirdContract.Model model);

        ThirdComponent build();
    }


}
