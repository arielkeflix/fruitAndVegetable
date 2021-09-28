package es.food.security.entity;

import java.io.Serializable;
import java.util.Collection;


import org.springframework.security.core.GrantedAuthority;


public class JwtResponse implements Serializable {   
	
	private String token;
    private String userName;
    private Collection<? extends GrantedAuthority> authorities;

    public JwtResponse(String token, String nombreUsuario, Collection<? extends GrantedAuthority> authorities) {
        this.token = token;
        this.userName = nombreUsuario;
        this.authorities = authorities;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }
    private static final long serialVersionUID = -1138581471978379303L;
}
