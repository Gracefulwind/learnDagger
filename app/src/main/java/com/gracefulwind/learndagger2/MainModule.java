package com.gracefulwind.learndagger2;

import dagger.Module;
import dagger.Provides;

/**
 * @ClassName: MainModule
 * @Author: Gracefulwind
 * @CreateDate: 2020/5/15 16:26
 * @Description: ---------------------------
 * @UpdateUser:
 * @UpdateDate: 2020/5/15 16:26
 * @UpdateRemark:
 * @Version: 1.0
 * @Email: 429344332@qq.com
 */

@Module
public class MainModule {
    private MainContract.View mView;
    private MainContract.Model mModel;


//    public MainModule(MainContract.View mView, MainContract.Model model) {
//        this.mView = mView;
//        this.mModel = model;
//    }

    public MainModule(MainContract.View mView) {
        this.mView = mView;
//        this.mModel = new MainModel();
        this.mModel = new MainModel(mView.toString());
        System.out.println("==============");
    }

    /**
        View确实通过这个方法提供了
        但是model是用了他本身的inject方法获取的，并没有用到getModel，为什么？
     */
    @Provides
    MainContract.View getView() {
        return mView;
    }

    @Provides
    MainContract.Model getModel() {
        return mModel;
    }

    /**
        在module里添加@Provides方法控制注入的优先级比Presenter中的@Inject优先级高
        如果没有Provides，才会去调用inject，利用Provides可以控制用哪一个构造
        module就相当于一个构造中心，所有的构造调度都由这里开始
        接下来试下在SecondActivity里测试用Component完成调度
    */
    @Provides
    MainPresenter getPresenter() {
        return new MainPresenter(getView(), getModel());
    }

}
