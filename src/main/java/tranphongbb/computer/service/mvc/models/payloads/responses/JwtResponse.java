package tranphongbb.computer.service.mvc.models.payloads.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JwtResponse {

    private String token;
    private String type = "Bearer";
    private String expirationTime;
    private int id;
    private String username;
    private String email;
    private List<String> roles;

    public JwtResponse(String token, String expirationTime, int id, String username, String email, List<String> roles) {
        this.token = token;
        this.expirationTime = expirationTime;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }
}
