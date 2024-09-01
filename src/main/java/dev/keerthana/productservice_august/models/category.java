package dev.keerthana.productservice_august.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class category extends baseModel{
String name;
String description;
List<product> products;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<product> getProducts() {
        return products;
    }

    public void setProducts(List<product> products) {
        this.products = products;
    }
}
