package com.mhmt.wowrealmstatus;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.mhmt.wowrealmstatus.Constant;
import com.mhmt.wowrealmstatus.annotations.ApplicationScope;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

  private final Application mApplication;

  public AppModule(Application application) {
    mApplication = application;
  }

  @Provides
  @ApplicationScope
  Application applicationContext() {
    return mApplication;
  }

  @Provides
  @ApplicationScope
  SharedPreferences sharedPreferences() {
    return mApplication.getSharedPreferences(Constant.SharedPreferences.PREFERENCES_FILE, Context.MODE_PRIVATE);
  }

}