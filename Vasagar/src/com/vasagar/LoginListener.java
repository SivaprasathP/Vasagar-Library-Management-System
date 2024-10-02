package com.vasagar;

import com.vasagar.dto.User;

public interface LoginListener {
    public void loginSuccess(User user);

    public void loginFailed();
}
