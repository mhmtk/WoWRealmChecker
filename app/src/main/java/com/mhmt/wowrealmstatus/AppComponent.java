package com.mhmt.wowrealmstatus;

import com.mhmt.wowrealmstatus.annotations.ApplicationScope;
import com.mhmt.wowrealmstatus.ui.presenters.PresenterComponent;
import com.mhmt.wowrealmstatus.ui.presenters.PresenterModule;

import dagger.Component;

@ApplicationScope
@Component(modules = AppModule.class)
public interface AppComponent {

  // Each subcomponent can depend on more than one module
  PresenterComponent newControllerComponent(PresenterModule module);

//  ServiceComponent newServiceComponent(ServiceModule module);

}