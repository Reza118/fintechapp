package reza.job.assess.capgemini.fintechapp.Utils;

import reza.job.assess.capgemini.fintechapp.model.Accounts;

import java.util.Comparator;

public class SortByAccountNo implements Comparator<Accounts> {

    @Override
    public int compare(Accounts account1, Accounts account2) {
        return Integer.valueOf(account1.getAccount()) - Integer.valueOf(account2.getAccount());
    }
}