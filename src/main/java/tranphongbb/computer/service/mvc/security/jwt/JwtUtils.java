package tranphongbb.computer.service.mvc.security.jwt;

import io.jsonwebtoken.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import tranphongbb.computer.service.mvc.models.UserDetailsImpl;

import java.text.ParseException;
import java.util.Date;

@Component
public class JwtUtils {

    private static final Logger logger = LoggerFactory.getLogger(JwtUtils.class);

    @Value("${fatstack.app.jwtSecret}")
    private String jwtSecret;

    @Value("${fatstack.app.jwtExpirationMs}")
    private long jwtExpirationMs;

    public String generateJwtToken(Authentication authentication) throws ParseException {
        UserDetailsImpl userPrincipal = (UserDetailsImpl) authentication.getPrincipal();

        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);

        JwtBuilder jwtBuilder = Jwts.builder()
                .setSubject(userPrincipal.getUsername())
                .setIssuedAt(now)
                .signWith(SignatureAlgorithm.HS512, jwtSecret);

        if (jwtExpirationMs > 0) {
            long expMillis = nowMillis + jwtExpirationMs;
            Date exp = new Date(expMillis);
            jwtBuilder.setExpiration(exp);
        }

        return jwtBuilder.compact();
    }

    public String getUsernameFromJwtToken(String token) {
        return Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody().getSubject();
    }

    public boolean validateJwtToken(String authToken) {
        try {
            Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(authToken);
            return true;
        } catch (SignatureException e) {
            logger.error("Invalid JWT signature: {}", e.getMessage());
        } catch (MalformedJwtException e) {
            logger.error("Invalid JWT token: {}", e.getMessage());
        } catch (ExpiredJwtException e) {
            logger.error("JWT token is expired: {}", e.getMessage());
        } catch (UnsupportedJwtException e) {
            logger.error("JWT token is unsupported: {}", e.getMessage());
        } catch (IllegalArgumentException e) {
            logger.error("JWT claims string is empty: {}", e.getMessage());
        }
        return false;
    }
}
