package io.mycat.config.model.rule;

import java.io.Serializable;

public class DatabaseRuleConfig implements Serializable {
    private  String name;
    private final RuleConfig rule;

    public DatabaseRuleConfig(String name, RuleConfig rule) {
        if (name == null) {
            throw new IllegalArgumentException("name is null");
        }
        this.name = name;
        if (rule == null) {
            throw new IllegalArgumentException("no rule is found");
        }
        this.rule =rule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return unmodifiable
     */
    public RuleConfig getRule() {
        return rule;
    }
}
