package org.umgpm.content.graphql;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.umgpm.content.codegen.DgsConstants;
import org.umgpm.content.codegen.types.User;
import org.umgpm.content.service.UserService;

@Controller
@RequiredArgsConstructor
public class UserGraphQLController {

    private final UserService userService;

    @QueryMapping(name = DgsConstants.QUERY.GetUser)
    public User getUser(@Argument String id) {
        userService.getUserById(id);
        return User.newBuilder().id(id).firstName("test").build();
    }
}
