package com.example.demo.ui;

import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import com.example.demo.ui.LoginView;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@Route("")
@AnonymousAllowed
public class HomeView extends AppLayout{
    
    /**
     * 
     */
    public HomeView(){
        // add(
        //     new H1("Home View")
        // );

        createHeader();
    }

    private void createHeader() {
        H4 logo = new H4("Kilang");
        RouterLink admin = new RouterLink("Admin", PenyakitView.class);
        
        // Button btnlogin = new Button("Sign-in");
        // btnlogin.addThemeVariants(ButtonVariant.LUMO_SMALL);
        // btnlogin.addClickListener(e ->
        //     btnlogin.getUI().ifPresent(ui ->
        //       ui.navigate("login")
        // ));
        logo.addClassNames("text-l", "m-m");

        HorizontalLayout header = new HorizontalLayout(
          logo,admin
        );

        header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER); 
        header.setWidth("100%");
        header.addClassNames("py-0", "px-m");

        addToNavbar(header); 

    }
}
