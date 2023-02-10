package com.chatapp.chatserver.filter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JWTFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        // Get the token from the header
        String header = request.getHeader("Authorization");
        if (header == null || !header.startsWith("Bearer ")) {
            throw new JwtException("No JWT token found in request headers");
        }
        String token = header.substring(7);

        try {
            // Parse the token and validate it
            Jws<Claims> claimsJws = Jwts.parser().setSigningKey("secretKey").parseClaimsJws(token);
            Claims claims = claimsJws.getBody();

            // Add the user information to the request attributes
            request.setAttribute("username", claims.getSubject());
            request.setAttribute("chatroomId", claims.get("chatroomId"));

        } catch (JwtException e) {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, e.getMessage());
            return;
        }

        filterChain.doFilter(request, response);
    }
}
