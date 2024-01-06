package org.avyudaya.curtain.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

@Document
@Getter
@Setter
@RequiredArgsConstructor
public class User implements UserDetails {
    @Id
    private String id;
    private boolean verified = false;
    private boolean enabled = true;
    private String email;
    private String password;
    private String fullName;
    private Set<Role> authorities = new HashSet<>(List.of(new Role("USER")));

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return enabled;
    }

    @Override
    public boolean isAccountNonLocked() {
        return enabled;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return enabled;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
