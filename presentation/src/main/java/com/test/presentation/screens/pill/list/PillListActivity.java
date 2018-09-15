package com.test.presentation.screens.pill.list;

import android.arch.lifecycle.ViewModelProviders;

import com.test.firstaidkit.R;
import com.test.firstaidkit.databinding.ActivityPillListBinding;
import com.test.presentation.base.BaseMvvmActivity;

public class PillListActivity extends BaseMvvmActivity<PillListViewModel, ActivityPillListBinding> {

    @Override
    protected PillListViewModel provideViewModel() {
        return ViewModelProviders.of(this).get(PillListViewModel.class);
    }

    @Override
    protected int provideLayoutId() {
        return R.layout.activity_pill_list;
    }
}
