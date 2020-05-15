package com.gracefulwind.learndagger2;

import com.gracefulwind.learndagger2.base.IModel;
import com.gracefulwind.learndagger2.base.IView;

/**
 * @ClassName: MainContact
 * @Author: Gracefulwind
 * @CreateDate: 2020/5/15 16:17
 * @Description: ---------------------------
 * @UpdateUser:
 * @UpdateDate: 2020/5/15 16:17
 * @UpdateRemark:
 * @Version: 1.0
 * @Email: 429344332@qq.com
 */

public class MainContract {

    interface View extends IView {
        void updateUI();
    }

    interface Model extends IModel {

    }

}
