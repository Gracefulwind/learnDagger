package com.gracefulwind.learndagger2.mvp.activity3;

import com.gracefulwind.learndagger2.base.IModel;
import com.gracefulwind.learndagger2.base.IView;

/**
 * @ClassName: Thirdcontract
 * @Author: Gracefulwind
 * @CreateDate: 2020/5/18 15:09
 * @Description: ---------------------------
 * @UpdateUser:
 * @UpdateDate: 2020/5/18 15:09
 * @UpdateRemark:
 * @Version: 1.0
 * @Email: 429344332@qq.com
 */

public class ThirdContract {


    interface View extends IView {
        void showThird();
        String getData();
    }

    interface Model extends IModel {
        void getData();
    }
}
