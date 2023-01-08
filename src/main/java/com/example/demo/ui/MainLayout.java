package com.example.demo.ui;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;

import com.example.demo.ui.PenyakitView;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.HighlightConditions;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.server.PWA;

public class MainLayout extends AppLayout { 

    public MainLayout() {
        createHeader();
        createDrawer();
    }

    private void createHeader() {
        H2 logo = new H2("Kilang");
        logo.addClassNames("text-l", "m-m");

        HorizontalLayout header = new HorizontalLayout(
          new DrawerToggle(), 
          logo
        );

        header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER); 
        header.setWidth("100%");
        header.addClassNames("py-0", "px-m");

        addToNavbar(header); 

    }

    private void createDrawer() {
        RouterLink admin = new RouterLink("Penyakit", PenyakitView.class); 
        admin.setHighlightCondition(HighlightConditions.sameLocation()); 

        addToDrawer(new VerticalLayout( 
            admin
        ));
    }
}