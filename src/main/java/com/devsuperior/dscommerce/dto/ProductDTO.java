package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.models.Category;
import com.devsuperior.dscommerce.models.Product;
import jakarta.validation.constraints.*;

import java.util.ArrayList;
import java.util.List;

public class ProductDTO {

    private Long id;
    @Size(min = 3, max = 80, message = "Insira um nome válido")
    @NotBlank(message = "Campo Obrigatório")
    private String name;
    @Size(min = 10, message = "Descrição deve ter no mínimo 10 caracteres")
    @NotBlank(message = "Campo Obrigatório")
    private String description;
    @NotNull(message = "Campo requirido")
    @Positive(message = "O preço deve ser maior que 0")
    private Double price;
    private String imgUrl;

    @NotEmpty(message = "Deve ter no mínimo uma categoria")
    private List<CategoryDTO> categories = new ArrayList<>();

    public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product model) {
        id = model.getId();
        name = model.getName();
        description = model.getDescription();
        price = model.getPrice();
        imgUrl = model.getImgUrl();
        for (Category cat : model.getCategories()){
            categories.add(new CategoryDTO(cat));
        }
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public List<CategoryDTO> getCategories() {
        return categories;
    }
}