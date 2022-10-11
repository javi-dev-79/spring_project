package com.aruteros.spring_project.persistence.entity;

import java.util.List;

public class SplitResponseBody {

    private List<String> splitResponseBody;

    public SplitResponseBody(List<String> responseBody) {
        this.splitResponseBody = responseBody;
    }

    public List<String> getSplitResponseBody() {
        return splitResponseBody;
    }

    public void setSplitResponseBody(List<String> splitResponseBody) {
        this.splitResponseBody = splitResponseBody;
    }
}
