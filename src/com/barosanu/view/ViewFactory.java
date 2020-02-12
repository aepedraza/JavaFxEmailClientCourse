package com.barosanu.view;

import com.barosanu.EmailManager;

/**
 * Factory for invoking views.
 * <p>
 * This is the first skeleton, will be fully implemented in next lectures
 */
public class ViewFactory {

    private EmailManager emailManager;

    public ViewFactory(EmailManager emailManager) {
        this.emailManager = emailManager;
    }

    public void showLoginWindow(){
        System.out.println("show login window called");
    }
}
