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
        this.mModel = new MainModel();
//        this.mModel = new MainModel(mView.toString());
    }

    @Provides
    MainContract.View getView() {
        return mView;
    }

    @Provides
    MainContract.Model getModel() {
        return mModel;
    }

}
