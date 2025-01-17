package com.example.demo;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class SimpleView extends VerticalLayout {

        public SimpleView() {
            add(new H1("Hello, World!"));
        }
}
