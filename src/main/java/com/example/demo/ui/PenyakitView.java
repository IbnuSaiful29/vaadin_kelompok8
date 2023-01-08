package com.example.demo.ui;

import javax.annotation.security.RolesAllowed;

import org.vaadin.crudui.crud.impl.GridCrud;

import com.example.demo.backend.Penyakit;
import com.example.demo.backend.PenyakitService;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "Admin",  layout = MainLayout.class)
@RolesAllowed("ADMIN")
public class PenyakitView extends VerticalLayout{

    public PenyakitView(PenyakitService service){

        var crud  = new GridCrud<>(Penyakit.class, service);
        crud.getGrid().setColumns("nama_penyakit","deskripsi");
        crud.getCrudFormFactory().setVisibleProperties("nama_penyakit","deskripsi");
        add(
            new H4("Data Penyakit"),crud
        );
    }
}
