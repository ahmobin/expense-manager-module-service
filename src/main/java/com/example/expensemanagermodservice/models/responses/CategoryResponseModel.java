package com.example.expensemanagermodservice.models.responses;

import com.example.expensemanagermodservice.entities.SubCategoryEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class CategoryResponseModel {
    private String uuid;
    private String name;
}
