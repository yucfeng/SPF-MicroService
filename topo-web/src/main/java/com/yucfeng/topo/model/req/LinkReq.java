package com.yucfeng.topo.model.req;

import com.yucfeng.topo.model.base.LinkAttribute;
import org.springframework.data.repository.NoRepositoryBean;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@NoRepositoryBean
public class LinkReq extends LinkAttribute implements Serializable{

    private static final long serialVersionUID = 4193978616313343601L;

    @NotNull
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
