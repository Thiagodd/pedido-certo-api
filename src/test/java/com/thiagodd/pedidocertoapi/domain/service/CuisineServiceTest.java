package com.thiagodd.pedidocertoapi.domain.service;

import com.thiagodd.pedidocertoapi.domain.mapper.CuisineMapper;
import com.thiagodd.pedidocertoapi.domain.model.Cuisine;
import com.thiagodd.pedidocertoapi.domain.model.dto.CuisineDto;
import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CuisineServiceTest {


    @Autowired
    private CuisineService cuisineService;

    @Autowired
    private CuisineMapper mapper;

    private final List<Cuisine> VALID_CUISINES = new ArrayList<>();
    private Integer TOTAL_CUISINES;


    @BeforeEach
    public void setUp() {

        Cuisine italian = Cuisine.builder()
            .id(UUID.fromString("abb6b6f7-e7b2-4507-92f1-e9583b01767b"))
            .name("Italian")
            .build();
        Cuisine mexican = Cuisine.builder()
            .id(UUID.fromString("745cb43f-9354-4d8b-8040-029dcd333b0e"))
            .name("Mexican")
            .build();
        Cuisine chinese = Cuisine.builder()
            .id(UUID.fromString("9e18ef29-73a4-4410-8538-059e31827a05"))
            .name("Chinese")
            .build();

        VALID_CUISINES.add(italian);
        VALID_CUISINES.add(mexican);
        VALID_CUISINES.add(chinese);

        TOTAL_CUISINES = cuisineService.findAll(PageRequest.of(0, 10)).getContent().size();
    }

    @Test
    @DisplayName("Checks whether it is possible to create a new cuisine with valid data.")
    public void shouldBeAbleToCreateNewCuisineWithValidData(){

        //Given
        Cuisine cuisine = new Cuisine("Mexicana");
        cuisine.setCreatedBy("Default");

        // When
        CuisineDto createdCuisine = cuisineService.create(mapper.toDto(cuisine));

        // Then
        assertNotNull(createdCuisine);
        assertEquals("Mexicana", createdCuisine.getName());
    }

    @Test
    @DisplayName("Checks that it is not possible to create a new cuisine with invalid data.")
    public void shouldNotBeAbleToCreateNewCuisineWithInvalidData(){
        // Given
        Cuisine cuisine = new Cuisine();

        // When
        // Then
        assertThrows(Exception.class, () -> cuisineService.create(mapper.toDto(cuisine)));
    }

    @Test
    @DisplayName("Checks if it is possible to list cuisines with pagination.")
    public void shouldBeAbleToListCuisinesWithPagination(){
        // Given
        int pageNumber = 0;
        int pageSize = 10;

        // When
        Page<CuisineDto> cuisines = cuisineService.findAll(PageRequest.of(pageNumber, pageSize));

        // Then
        System.out.println("CUISINE CONTENT SIZE: " + cuisines.getContent().size());
        assertNotNull(cuisines);
        assertEquals(TOTAL_CUISINES, cuisines.getContent().size());
    }

    @Test
    @DisplayName("Checks if it is possible to find a cuisine by ID.")
    public void shouldBeAbleToFindCuisineByID(){
        // Given
        var validCuisine = VALID_CUISINES.get(0);

        // When
        var cuisine = cuisineService.findById(validCuisine.getId());

        // Then
        assertNotNull(cuisine);
        assertEquals(validCuisine.getId(), cuisine.getId());
        assertEquals(validCuisine.getName(), cuisine.getName());
    }

    @Test
    @DisplayName("Checks whether an exception is thrown if the cuisine is not found.")
    public void shouldReturnErrorIfCuisineIsNotFound(){
        // Given
        UUID id = UUID.randomUUID();

        // When
        // Then
        assertThrows(EntityNotFoundException.class, () -> cuisineService.findById(id));
    }

    @Test
    @DisplayName("Checks whether it is possible to update a cuisine with valid data.")
    public void shouldBeAbleToUpdateCuisineWithValidData(){
        // Given
        var validCuisine = VALID_CUISINES.get(0);
        var cuisineDto = cuisineService.findById(validCuisine.getId());


        // When
        var cuisine = mapper.toEntity(cuisineDto);
        cuisine.setName("Alemã");
        cuisineDto = mapper.toDto(cuisine);
        var updatedCuisine = cuisineService.update(validCuisine.getId(), cuisineDto);

        // Then
        assertNotNull(updatedCuisine);
        assertEquals("Alemã", updatedCuisine.getName());
    }

    @Test
    @DisplayName("Checks if it is not possible to update a cuisine with invalid data.")
    public void shouldNotBeAbleToUpdateCuisineWithInvalidData(){
        // Given
        var validCuisine =  VALID_CUISINES.get(0);
        var result = cuisineService.findById(validCuisine.getId());

        // When
        result.setName("");
        // Then
        assertThrows(Exception.class, () -> cuisineService.update(validCuisine.getId(), result));
    }

    @Test
    @DisplayName("Checks whether it is possible to delete a cuisine.")
    public void shouldBeAbleToDeleteCuisine(){
        var validCuisine = VALID_CUISINES.get(2);

        cuisineService.delete(validCuisine.getId());

        Page<CuisineDto> cuisines = cuisineService.findAll(PageRequest.of(0, 10));

        // Then
        assertEquals(TOTAL_CUISINES - 1, cuisines.getContent().size());
    }

    @Test
    @DisplayName("Checks that an exception is not thrown if the cuisine is not found.")
    public void shouldNotReturnErrorIfCuisineIsNotFound(){
        UUID id = UUID.randomUUID();

        cuisineService.delete(id);
        Page<CuisineDto> cuisines = cuisineService.findAll(PageRequest.of(0, 10));

        // Then
        assertEquals(TOTAL_CUISINES, cuisines.getContent().size());
    }

    @Test
    @DisplayName("Checks whether an exception is thrown if the cuisine is in use.")
    public void shouldReturnErrorIfCuisineIsInUse(){
        // Given
        UUID id = VALID_CUISINES.get(0).getId();

        // When
        // Then
        assertThrows(Exception.class, () -> cuisineService.delete(id));
    }
}