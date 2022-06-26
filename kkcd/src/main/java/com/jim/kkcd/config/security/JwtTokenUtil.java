package com.jim.kkcd.config.security;

import io.jsonwebtoken.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Jim
 * @Description
 * @createTime 2022年06月26日
 */
@Component
public class JwtTokenUtil {

    private static final String CLAIM_KEY_USERNAME = "sub";
    private static final String CLAIM_KEY_CREATED  = "created";

    @Value("${jwt.secret")
    private String secret;
    @Value("${jwt.expiration")
    private Long expiration;

    /**
     * @Author: Jim
     * @Description: 根据用户信息生成 token
     * @param userDetails
     */
    public String generateToken(UserDetails userDetails){
        Map<String,Object> claims = new HashMap<>();
        claims.put(CLAIM_KEY_USERNAME,userDetails.getUsername());
        claims.put(CLAIM_KEY_CREATED,new Date());
        return generateToken(claims);
    }

    /**
     * @Author: Jim
     * @Description: 从 token 中获取用户名
     * @param token
     */
    public String getUsernameFromToken(String token){
        String username;
        try {
            Claims claims = getClaimsFromToken(token);
            username = claims.getSubject();
        } catch (Exception e) {
            username = null;
        }
        return username;
    }

    /**
     * @Author: Jim
     * @Description: 判断 token 是否失效
     * @param token
     * @param userDetails
     */
    public boolean validateToken(String token,UserDetails userDetails){
        String username = getUsernameFromToken(token);
        return username.equals(userDetails.getUsername()) && !isTokenExpired(token);
    }

    /**
     * @Author: Jim
     * @Description: 判断 token 是否可以刷新
     * @param token
     */
    public boolean canRefresh(String token){
        return !isTokenExpired(token);
    }

    /**
     * @Author: Jim
     * @Description: 刷新 token
     * @param token
     */
    public String refreshToken(String token){
        Claims claims = getClaimsFromToken(token);
        claims.put(CLAIM_KEY_CREATED,new Date());
        return generateToken(claims);
    }
    /**
     * @Author: Jim
     * @Description: 判断 token 时间是否已经失效
     * @param token
     */
    private boolean isTokenExpired(String token) {
        Date expireDate = getExpiredDateFromToken(token);
        return expireDate.before(new Date());
    }

    /**
     * @Author: Jim
     * @Description: 从 token 中获取失效时间
     * @param token
     */
    private Date getExpiredDateFromToken(String token) {
        Claims claims = getClaimsFromToken(token);
        return claims.getExpiration();
    }

    private Claims getClaimsFromToken(String token) {
        Claims claims = null;
        try {
            claims = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return claims;
    }

    /**
     * @Author: Jim
     * @Description: 根据荷载生成 JWT TOKEN
     * @param claims
     */
    private String generateToken(Map<String,Object> claims) {
        return Jwts.builder()
                .setClaims(claims)
                .setExpiration(generateExpirationDate())
                .signWith(SignatureAlgorithm.ES512, secret)
                .compact();
    }

    /**
     * @Author: Jim
     * @Description: 获取当前时间
     */
    private Date generateExpirationDate() {
        return new Date(System.currentTimeMillis()+expiration*1000);
    }


}
