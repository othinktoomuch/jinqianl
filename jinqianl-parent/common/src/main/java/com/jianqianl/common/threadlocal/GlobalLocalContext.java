/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.jianqianl.common.threadlocal;

import com.jianqianl.common.model.GlobalLocalModel;

public class GlobalLocalContext {
	private static final ThreadLocal<GlobalLocalModel> threadLocal = new ThreadLocal();

	public static GlobalLocalModel getLocalContext() {
		GlobalLocalModel globalLocalModel = (GlobalLocalModel) threadLocal.get();
		if (globalLocalModel == null) {
			globalLocalModel = new GlobalLocalModel();
			setLocalContext(globalLocalModel);
		}

		return (GlobalLocalModel) threadLocal.get();
	}

	public static void setLocalContext(GlobalLocalModel context) {
		threadLocal.set(context);
	}

	public static void removeLocalContext() {
		threadLocal.remove();
	}
}