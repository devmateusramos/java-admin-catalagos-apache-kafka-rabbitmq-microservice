package com.projeto.admin.catalogo.infrastructure;

import com.projeto.admin.catalogo.application.UseCase;

public class Main {
    public static void main(String[] args) {
        System.out.println(new UseCase().execute());
    }
}