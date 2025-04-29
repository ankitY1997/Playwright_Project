package com.utills.reusablecomponents;

import com.microsoft.playwright.Page;

public class ActionEngine {

	public Page page = null;

	public ActionEngine(Page page) {
		this.page = page;
	}

}
