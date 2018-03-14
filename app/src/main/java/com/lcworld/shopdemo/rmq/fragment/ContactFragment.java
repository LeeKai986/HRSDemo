package com.lcworld.shopdemo.rmq.fragment;

import android.view.View;
import android.widget.ImageView;

import com.lcworld.shopdemo.R;
import com.lcworld.shopdemo.base.BaseFragment;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 创建：duke
 * 日期： 2017/4/14
 * 注释：通讯录
 * 版本： 1.0.0
 */
public class ContactFragment extends BaseFragment {


    @Override
    protected int setContentView() {
        return R.layout.fragment_contact;
    }

    @Override
    protected boolean setActionBarView() {
        return true;
    }

    @Override
    protected void initView(View view) {
        ImageView iv1 = (ImageView) view.findViewById(R.id.iv1);
        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
//        mActionbar.setListener(new Actionbar.ActionbarOnClickListener() {
//            @Override
//            public void rightOnClickListener(View v) {
//            }
//
//            @Override
//            public void leftOnClickListener(View v) {
//
//            }
//        });
//        //title
//        mActionbar.setTitleTxt("云薄");
//        initRightTwo(view);
//        mViewPager.setCurrentItem(4);

        /**
         * 右上角的 搜索和三点
         *
         * @param view
         */
//    private void initRightTwo(View view) {
//        (view.findViewById(R.id.ll_search)).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                UIManager.turnToAct(getActivity(), SearchAct.class);
//            }
//        });
//        (view.findViewById(R.id.rl_yjhj)).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                UIManager.turnToAct(getActivity(), YJHJListAct.class);
//            }
//        });
//        (view.findViewById(R.id.ll_more)).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //弹出功能pop
//                ((MainActivity) getActivity()).doMore(mActionbar);
//
//            }
//        });
//    }

//
//        @OnClick({R.id.ll_add_rm, R.id.ll_new_friend_fragment_friends, R.id.ll_black})
//        public void onClick (View view){
//            switch (view.getId()) {
//                case R.id.ll_add_rm:
//                    UIManager.turnToAct(getActivity(), AddSthActivity.class);
//                    break;
//                case R.id.ll_new_friend_fragment_friends:
//                    EventBus.getDefault().post(new EventRefreshBottomRedCircle(4, false));
//                    ActivitySkipUtil.skip(getActivity(), NewFriendsActivity.class);
//                    break;
//                case R.id.ll_black:
//                    UIManager.turnToAct(getActivity(), BlackListAct.class);
//                    break;
//            }
//        }
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void setListener() {

    }


}
