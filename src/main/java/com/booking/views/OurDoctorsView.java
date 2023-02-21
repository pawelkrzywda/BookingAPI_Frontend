package com.booking.views;

import com.booking.dto.DoctorDto;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "doctors", layout = MainView.class)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class OurDoctorsView extends VerticalLayout {

    Grid<DoctorDto> grid = new Grid<>(DoctorDto.class);

    public OurDoctorsView() {
        grid.setColumns("id", "name", "surname", "specialization", "rating");
        grid.setSizeFull();
        add(grid);

    }

}