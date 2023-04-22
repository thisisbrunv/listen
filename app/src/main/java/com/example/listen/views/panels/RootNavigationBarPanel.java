package com.example.listen.views.panels;
import android.content.Context;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;

import com.example.listen.R;
import com.realgear.multislidinguppanel.BasePanelView;
import com.realgear.multislidinguppanel.MultiSlidingUpPanelLayout;

public class RootNavigationBarPanel extends BasePanelView{


    public RootNavigationBarPanel(@NonNull Context context, MultiSlidingUpPanelLayout panelLayout) {
        super(context, panelLayout);

        getContext().setTheme(R.style.Theme_Listen);
        LayoutInflater.from(getContext()).inflate(R.layout.layout_root_navigation_bar, this, true);
    }

    @Override
    public void onCreateView() {

    }

    @Override
    public void onBindView() {

    }

    @Override
    public void onPanelStateChanged(int panelSate) {

    }
}
