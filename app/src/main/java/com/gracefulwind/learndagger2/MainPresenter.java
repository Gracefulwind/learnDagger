package com.gracefulwind.learndagger2;

import javax.inject.Inject;

/**
 * @ClassName: MainPresenter
 * @Author: Gracefulwind
 * @CreateDate: 2020/5/15 16:23
 * @Description: ---------------------------
 * @UpdateUser:
 * @UpdateDate: 2020/5/15 16:23
 * @UpdateRemark:
 * @Version: 1.0
 * @Email: 429344332@qq.com
 */

public class MainPresenter {

    private MainContract.View mView;
    private MainContract.Model mModel;

    @Inject
    MainPresenter(MainContract.View view) {
        mView = view;
    }

    MainPresenter(MainContract.View view, MainContract.Model model) {
        mView = view;
        mModel = model;
    }


    public void loadData() {
        mView.updateUI();
    }

}
