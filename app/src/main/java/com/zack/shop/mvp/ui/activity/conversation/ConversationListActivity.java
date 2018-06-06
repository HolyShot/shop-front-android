package com.zack.shop.mvp.ui.activity.conversation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.jess.arms.di.component.AppComponent;
import com.zack.shop.R;
import com.zack.shop.app.base.BaseSupportActivity;

import timber.log.Timber;

public class ConversationListActivity extends BaseSupportActivity {


    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {

    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        Timber.e("onActivityCreated initView %s", this.getLocalClassName());
        return R.layout.activity_conversation_list;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        Timber.e("onActivityCreated initData %s", this.getLocalClassName());
    }
}