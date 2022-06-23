package com.cn.factservice.model;

import java.util.List;

public class FactList {
    private List<String> facts;
    private boolean success;

    public List<String> getFacts() {
        return facts;
    }

    public void setFacts(List<String> facts) {
        this.facts = facts;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
