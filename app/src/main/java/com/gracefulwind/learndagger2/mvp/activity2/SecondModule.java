package com.gracefulwind.learndagger2.mvp.activity2;

import com.gracefulwind.learndagger2.base.ActivityScope;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * @ClassName: SecondModule
 * @Author: Gracefulwind
 * @CreateDate: 2020/5/18 10:13
 * @Description: ---------------------------
 * @UpdateUser:
 * @UpdateDate: 2020/5/18 10:13
 * @UpdateRemark:
 * @Version: 1.0
 * @Email: 429344332@qq.com
 */

@Module
public class SecondModule {

    private SecondContract.View mIView;
    private SecondContract.Model mModel;

    @Inject
    public SecondModule(SecondContract.View iView) {
        mIView = iView;
        mModel = new SecondModel(iView.toString());
    }

    public void setView(SecondContract.View mIView) {
        this.mIView = mIView;
    }

    public void setModel(SecondContract.Model mModel) {
        this.mModel = mModel;
    }

    @Provides
    SecondContract.View getView(){
        return mIView;
    }

    @Provides
    SecondContract.Model getModel(){
        return mModel;
    }

/**
 *
 * 这里的@ActivityScope只对该provides产生的presenter有效
 *
 * */
//    @ActivityScope
    @Provides
    SecondPresenter getPresenter(SecondContract.View view) {
        return new SecondPresenter(getView(), getModel());
//        return new SecondPresenter(view, new SecondModel(view.toString()));
    }

    @Named("sec")
    @Provides
    SecondPresenter getPresenterWithName() {

        return new SecondPresenter(getView(), new SecondModel("sec"));
    }

}
