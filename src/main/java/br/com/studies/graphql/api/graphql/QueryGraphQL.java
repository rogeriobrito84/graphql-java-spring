package br.com.studies.graphql.api.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class QueryGraphQL implements GraphQLQueryResolver {

    public String hello() {
        return "Hello GraphQL";
    }

    public int sum(int a, int b) {
        return a + b;
    }

}
