package nextstep.helloworld.config.javaConfig;

import org.springframework.stereotype.Service;

@Service
public class AuthService {
    public String findMemberName() {
        return "사용자";
    }
}
