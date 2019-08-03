package entity;

import java.util.Collection;

public class CategoryDto {
    private Long id;
    private String name;
    private Collection<CategoryDto> subs;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<CategoryDto> getSubs() {
        return subs;
    }

    public void setSubs(Collection<CategoryDto> subs) {
        this.subs = subs;
    }
}
