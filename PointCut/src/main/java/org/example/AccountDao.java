package org.example;

import org.springframework.stereotype.Component;

@Component("accountDao")
public class AccountDao {
    public void addAccount()
    {
        System.out.println("Add Account");
    }
}
