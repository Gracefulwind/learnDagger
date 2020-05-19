package com.gracefulwind.learndagger2.mvp.activity3;

import com.gracefulwind.learndagger2.mvp.activity2.SecondContract;

import dagger.Module;
import dagger.Provides;

/**
 * @ClassName: ThirdModule
 * @Author: Gracefulwind
 * @CreateDate: 2020/5/18 15:31
 * @Description: ---------------------------
 * @UpdateUser:
 * @UpdateDate: 2020/5/18 15:31
 * @UpdateRemark:
 * @Version: 1.0
 * @Email: 429344332@qq.com
 */

@Module
public class ThirdModule {

    String from = "from Module";

    public ThirdModule() {
        System.out.println("use no param constructor");
    }

    public ThirdModule(String from) {
        this.from = from;
    }



//    @Provides
//    ThirdPresenter getPresenter(ThirdContract.View view) {
//        return new ThirdPresenter(view.toString(), view, new ThirdModel(view.toString()));
//    }

    @Provides
    ThirdPresenter getPresenter2(ThirdContract.View view, ThirdContract.Model model) {
        return new ThirdPresenter(view.toString(), view, model);
    }

    @Provides
    ThirdModel getModel(ThirdContract.View view) {
        return new ThirdModel(view.getData());
    }

}
