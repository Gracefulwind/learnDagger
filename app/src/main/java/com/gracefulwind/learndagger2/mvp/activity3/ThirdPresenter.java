package com.gracefulwind.learndagger2.mvp.activity3;

import javax.inject.Inject;

/**
 * @ClassName: ThirdPresenter
 * @Author: Gracefulwind
 * @CreateDate: 2020/5/18 15:29
 * @Description: ---------------------------
 * @UpdateUser:
 * @UpdateDate: 2020/5/18 15:29
 * @UpdateRemark:
 * @Version: 1.0
 * @Email: 429344332@qq.com
 */

public class ThirdPresenter {

    String from = "null";
    private ThirdContract.View mView;
    private ThirdContract.Model mModel;

    @Inject
    public ThirdPresenter(){
        from = "local";
    }

    public ThirdPresenter(String from, ThirdContract.View view, ThirdContract.Model model){
        this.from = from;
        this.mView = view;
        this.mModel = model;
    }

    public void showPresenter(){
        System.out.println("=== this is ===  "  + this);
    }

}
