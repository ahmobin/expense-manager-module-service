package com.example.expensemanagermodservice.models.responses;

import com.example.expensemanagermodservice.entities.CategoryEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class SubCategoryResponseModel {
    private String slug;
    private CategoryEntity category;
    private String name;
}