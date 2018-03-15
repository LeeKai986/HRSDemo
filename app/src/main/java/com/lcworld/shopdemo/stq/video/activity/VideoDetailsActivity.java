package com.lcworld.shopdemo.stq.video.activity;


import android.view.View;

import com.lcworld.shopdemo.R;
import com.lcworld.shopdemo.base.BaseActivity;
import com.lcworld.shopdemo.base.BaseFrameLayout;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * 社团圈-视频详情
 */
public class VideoDetailsActivity extends BaseActivity {


    private Unbinder unbinder;

    @Override
    protected int setContentView() {
        return R.layout.s_act_video_details;
    }

    @Override
    protected void initView() {
        unbinder = ButterKnife.bind(this);
        baseFrameLayout.setState(BaseFrameLayout.STATE_SUCCESS);
    }


    @Override
    protected void initData() {

    }

    @Override
    protected void setListener() {

    }

    @OnClick({R.id.back})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back:
                finish();
                break;
//            case R.id.iv_paly:  //视频播放
//                UIManager.turnToAct(this, VideoPlayActivity.class);
//                break;
        }
    }

    @Override
    protected boolean setWindowDye() {
        return false;
    }

    @Override
    protected boolean setActionBarView() {
        return false;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

}
