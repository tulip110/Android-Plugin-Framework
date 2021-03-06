package com.example.pluginmain;

import com.limpoxe.fairy.core.PluginApplication;
import com.limpoxe.fairy.core.PluginLoader;
import com.limpoxe.fairy.util.ProcessUtil;
import com.tencent.bugly.crashreport.CrashReport;

public class MyApplication extends PluginApplication {
	@Override
	public void onCreate() {
		super.onCreate();

        CrashReport.initCrashReport(getApplicationContext(), "c38ae3f8a6", true);

		//可选, 指定loading页UI, 用于首次加载插件时, 显示菊花等待插件加载完毕,
		if (ProcessUtil.isPluginProcess(this)) {
			PluginLoader.setLoadingResId(R.layout.loading);
		}
	}
}
