package com.mhmt.wowrealmstatus.ui.presenters;

import com.mhmt.wowrealmstatus.annotations.PresenterScope;

import dagger.Subcomponent;

@PresenterScope
@Subcomponent(modules = { PresenterModule.class})
public interface PresenterComponent {

}
