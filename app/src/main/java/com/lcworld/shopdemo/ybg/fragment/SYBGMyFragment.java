package com.lcworld.shopdemo.ybg.fragment;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.lcworld.shopdemo.R;
import com.lcworld.shopdemo.base.BaseFragment;
import com.lcworld.shopdemo.base.UIManager;
import com.lcworld.shopdemo.ybg.activity.T_YBGMainActivity;
import com.lcworld.shopdemo.ybg.activity.YBGsettingActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;


/**
 * 商会-资讯
 */
public class SYBGMyFragment extends BaseFragment {

    Unbinder unbinder;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    protected int setContentView() {
        return R.layout.s_frag_ybgmain_wd;
    }

    @Override
    protected boolean setActionBarView() {
        return false;
    }

    @Override
    protected void initView(View view) {
        unbinder = ButterKnife.bind(this, view);
        final T_YBGMainActivity activity = (T_YBGMainActivity) getActivity();
        final ImageView ivmore = (ImageView) view.findViewById(R.id.ivmore);
        final ImageView ivset = (ImageView) view.findViewById(R.id.ivset);
        ivmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.doMore(ivmore);
            }
        });
        ivset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UIManager.turnToAct(getActivity(), YBGsettingActivity.class);
            }
        });
    }


    @Override
    protected void initData() {
    }


    @Override
    protected void setListener() {

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }


}
