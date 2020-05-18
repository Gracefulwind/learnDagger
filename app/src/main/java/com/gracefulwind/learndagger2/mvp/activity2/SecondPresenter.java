package com.gracefulwind.learndagger2.mvp.activity2;

import android.widget.Toast;

import com.gracefulwind.learndagger2.base.ActivityScope;

import javax.inject.Inject;

/**
 * @ClassName: SecondPresenter
 * @Author: Gracefulwind
 * @CreateDate: 2020/5/18 10:06
 * @Description: ---------------------------
 * @UpdateUser:
 * @UpdateDate: 2020/5/18 10:06
 * @UpdateRemark:
 * @Version: 1.0
 * @Email: 429344332@qq.com
 */

/**
 *
 * 这里的@ActivityScope只对用@Inject产生的presenter有效
 *
 * */
@ActivityScope
public class SecondPresenter {

    private SecondContract.View mView;
    private SecondContract.Model mModel;

//    @Inject
    SecondPresenter(SecondContract.View view) {
        mView = view;
    }

    @Inject
    SecondPresenter(SecondContract.View view, SecondContract.Model model) {
        mView = view;
        mModel = model;
    }

//-----------------------------------------------------------------------------------------------------
    public void update(){
        if(null != mModel){
            mModel.getData();
        }else {
            System.out.println("=====use default inject=====");
        }
        mView.showSecond();
    }

}
