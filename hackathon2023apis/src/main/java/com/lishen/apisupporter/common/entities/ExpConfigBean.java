package com.lishen.apisupporter.common.entities;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "expressions")
public class ExpConfigBean
{
    private List<Exp> explist;
}
