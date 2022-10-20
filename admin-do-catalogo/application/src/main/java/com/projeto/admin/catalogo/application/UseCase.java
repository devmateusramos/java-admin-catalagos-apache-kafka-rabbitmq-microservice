package com.projeto.admin.catalogo.application;

import com.projeto.admin.catalogo.domain.category.Category;

public class UseCase {
    public Category execute() {
        return new Category();
    }
}